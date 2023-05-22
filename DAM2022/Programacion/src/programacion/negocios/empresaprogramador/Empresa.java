package negocios.empresaprogramador;

import java.io.*;
import java.util.Collection;
import java.util.Scanner;
import java.util.TreeSet;

public class Empresa {
    private String nombreEmpresa;

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    private TreeSet<AbstractEmpleado> listaEmpleado = new TreeSet<>();

    public Empresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public void addEmpleado(AbstractEmpleado empleado) {
        listaEmpleado.add(empleado);
    }

    public void toStringEmpleados() {
        int count = 1;
        for (AbstractEmpleado empleado : listaEmpleado) {
            System.out.println((count++) + ")" + empleado);
        }
    }

    public void toStringProgramadores() {
        int count = 1;
        for (AbstractEmpleado empleado : listaEmpleado) {
            if (empleado instanceof Programador) {
                System.out.println((count++) + ")" + empleado);
            }
        }
    }

    public void toStringOrdenSueldo() {
        TreeSet<AbstractEmpleado> listaEmpleadoOrdenSueldo = new TreeSet<>(AbstractEmpleado.ORDENAR_POR_SUELDO);
        listaEmpleadoOrdenSueldo.addAll(this.listaEmpleado);
        int count = 1;
        for (AbstractEmpleado empleado : listaEmpleadoOrdenSueldo) {
            System.out.println((count++) + ")" + empleado);
        }
    }

    // TreeSet Implementa comparable ya esta en orden natural por nombre
    public void toStringOrdenNombre() {
        toStringEmpleados();
    }

    public void cargarDesdeCSV(String archivoCargar) {
        File file = new File(archivoCargar);
        String texto = "";
        if (file.exists()) {
            try (BufferedReader lectorBufferDeFichero = new BufferedReader(new FileReader(file))) {
                texto = lectorBufferDeFichero.readLine();
                while (texto != null) {
                    System.out.println(texto);
                    texto = lectorBufferDeFichero.readLine();
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("Fichero no existe.");
        }

    }

    public void guardarEnCSV(String archivoGuardar) throws RuntimeException {
        Boolean aniadirDesdeUltimaLinea = false;
        String respuesta = "";
        File file = new File(archivoGuardar);
        try (Scanner scanner = new Scanner(System.in)) {
            if (file.exists()) {
                System.out.println("Quieres sobreescribir el fichero ?(S/N)");
                respuesta = scanner.nextLine().toUpperCase();
                if (respuesta.equals("N")) {
                    aniadirDesdeUltimaLinea = true;
                }
            } else {
                try {
                    file.createNewFile();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        try (FileWriter escritorFichero = new FileWriter(file, aniadirDesdeUltimaLinea)) {
            BufferedWriter escritorBuffer = new BufferedWriter(escritorFichero);
            escritorBuffer.write("NOMBRE,SUELDO,PUESTO O LENGUAJE,PLUS IDIOMA\n");
            for (AbstractEmpleado empleado : listaEmpleado) {
                String informacionEmpleado = empleado.toString();
                escritorBuffer.write(informacionEmpleado + "\n");
            }
            escritorBuffer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
