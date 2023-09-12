package negocios.parking;

import java.util.ArrayList;
import java.util.Collections;

public class Parking {
    //el indice indicara las plazas de parking
    private ArrayList<String> matriculas;
    private final String nombre;

    public Parking(String nombre, int plazas) {
        this.nombre = nombre;
        matriculas = new ArrayList<>(Collections.nCopies(plazas, null));
    }

    public String getNombre() {
        return nombre;
    }

    public void entrada(String matricula, int plaza) throws ParkingException {
        if (matricula.length() < 4 || matricula.equals(null)) {
            throw new ParkingException("Matricula incorrecta", matricula);
        }
        if (matriculas.get(plaza) != null) {
            throw new ParkingException("Plaza ocupada", matricula);
        }
        if (matriculas.contains(matricula)) {
            throw new ParkingException("Matricula repetida", matricula);
        }
        matriculas.add(plaza,matricula);
    }

    public int salida(String matricula) throws ParkingException {
        if (!matriculas.contains(matricula)) {
            throw new ParkingException("Matrícula no existente", matricula);
        }

        int numeroPlaza = matriculas.indexOf(matricula);
        matriculas.set(numeroPlaza, null);

        return numeroPlaza;
    }

    public int getPlazasTotales() {
        return matriculas.size();
    }
    public int getPlazasOcupadas() {
        return getPlazasTotales() - getPlazasLibres();
    }
    public int getPlazasLibres() {
        return Collections.frequency(matriculas, null);
    }

    @Override
    public String toString() {

        String cadena = "Parking "+nombre+"\n";
        cadena += "-------------------\n";
        for(int i=0;i<matriculas.size();i++) {
            cadena += "Plaza "+i+": ";
            cadena += (matriculas.get(i)==null) ? "(vacía)" : matriculas.get(i);
            cadena += "\n";
        }
        cadena += "-------------------\n";

        return cadena;
    }
}
