package programacion.examenordinario;

import java.io.*;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

public class EmpresaAlquilerVehiculos {
    final String SEPARATOR_CSV = "#";
    private String nombre;
    private String nif;
    private Map<String, Cliente> clientes;
    private Map<String, Vehiculo> vehiculos;
    private List<Alquiler> alquileres;


    public EmpresaAlquilerVehiculos(String nombre, String nif) {
        this.nombre = nombre;
        this.nif = nif;
        clientes = new TreeMap<>();
        vehiculos = new TreeMap<>();
        alquileres = new ArrayList<>();

    }

    /*
     * Métodos apartado 2:
     */
    public boolean addCliente(Cliente cliente) {
        if (clientes.containsKey(cliente.getDni())) {
            return false;
        }
        clientes.put(cliente.getDni(), cliente);
        return true;
    }

    public Cliente getCliente(String dni) {
        if (clientes.containsKey(dni)) {
            return clientes.get(dni);
        }
        return null;
    }

    public boolean addVehiculo(Vehiculo vehiculo) {
        if (vehiculos.containsKey(vehiculo.getMatricula())) {
            return false;
        }
        vehiculos.put(vehiculo.getMatricula(), vehiculo);
        return true;
    }

    public Vehiculo getVehiculo(String matricula) {
        if (vehiculos.containsKey(matricula)) {
            return vehiculos.get(matricula);
        }
        return null;
    }

    public boolean addAlquiler(Alquiler alquiler) throws ParametroInvalidoException {
        alquileres.add(alquiler);
        return true;
    }

    public boolean finalizarAlquiler(String matricula, LocalDateTime fin) {
        for (Alquiler alquiler : alquileres) {
            Vehiculo coche = alquiler.getVehiculo();
            if (coche.getMatricula().equals(matricula) && alquiler.getFin() == null) {
                alquiler.finalizarAlquiler(fin);
                return true;
            }
        }
        return false;
    }

    public String toString() {
        String cadena = "";
        cadena += "=== Empresa: " + nombre + ", NIF: " + nif;
        if (clientes.isEmpty() == false) {
            cadena += "\n== Clientes:\n";
            cadena += toStringClientes();
        }
        if (vehiculos.isEmpty() == false) {
            cadena += "\n== Vehiculos:\n";
            cadena += toStringVehiculos();
        }
        if (alquileres.isEmpty() == false) {
            cadena += "\n== Alquileres:\n";
            cadena += toStringAlquileres();
        }
        return cadena;
    }

    public String toStringClientes() {
        String listaCliente = "";
        for (Map.Entry<String, Cliente> entry : clientes.entrySet()) {
            listaCliente += entry.getValue() + "\n";
        }
        return listaCliente;
    }

    public String toStringVehiculos() {
        String listaVehiculo = "";
        for (Map.Entry<String, Vehiculo> entry : vehiculos.entrySet()) {
            listaVehiculo += entry.getValue() + "\n";
        }
        return listaVehiculo;
    }

    public String toStringAlquileres() {
        String listaAlquileres = "";
        for (Alquiler alquiler : alquileres) {
            listaAlquileres += alquiler + "\n";
        }
        return listaAlquileres;
    }

    /*
     * Métodos apartado 4: Ordenamiento de colecciones
     */

    public String toStringClientesOrdenNatural() {
        TreeMap<Cliente, String> clientes1 = new TreeMap<>();
        String listaCliente = "";
        for (Map.Entry<String, Cliente> entry : clientes.entrySet()) {
            clientes1.put(entry.getValue(), entry.getKey());
        }
        for (Map.Entry<Cliente, String> entry : clientes1.entrySet()) {
            listaCliente += entry.getKey() + "\n";
        }
        return listaCliente;
    }

    public String toStringClientesOrdenDni() {
        String listaCliente = "";
        TreeMap<Cliente, String> clientesOrdenDni = new TreeMap<>(Cliente.ORDEN_POR_DNI);
        for (Map.Entry<String, Cliente> entry : clientes.entrySet()) {
            clientesOrdenDni.put(entry.getValue(), entry.getKey());
        }
        for (Map.Entry<Cliente, String> entry : clientesOrdenDni.entrySet()) {
            listaCliente += entry.getKey() + "\n";
        }
        return listaCliente;
    }

    public String toStringVehiculosOrdenNatural() {
        TreeMap<Vehiculo, String> vehiculoOrdenNatural = new TreeMap<>();
        String listaVehiculos = "";
        for (Map.Entry<String, Vehiculo> entry : vehiculos.entrySet()) {
            vehiculoOrdenNatural.put(entry.getValue(), entry.getKey());
        }
        for (Map.Entry<Vehiculo, String> entry : vehiculoOrdenNatural.entrySet()) {
            listaVehiculos += entry.getKey() + "\n";
        }
        return listaVehiculos;
    }

    public String toStringAlquileresOrdenNatural() {
        String listaAlquileres = "";
        Collections.sort(alquileres, new Comparator<Alquiler>() {

            @Override
            public int compare(Alquiler o1, Alquiler o2) {
                return o1.getInicio().compareTo(o2.getInicio());
            }
        });
        for (Alquiler alqui : alquileres) {
            listaAlquileres += alqui + "\n";
        }
        return listaAlquileres;
    }

    /*
     * Métodos apartado 5: Guardado y lectura en ficheros CSV
     */
    public boolean guardarClientesCsv(String ruta) {
        String cliente = "";
        try (BufferedWriter escritorBuffer = new BufferedWriter(new FileWriter(ruta, false))) {
            for (Map.Entry<String, Cliente> entry : clientes.entrySet()) {
                cliente += entry.getValue().getDni() + "#" + entry.getValue().getNombre() + "#" + entry.getValue().getApellidos() + "\n";
                escritorBuffer.write(cliente);
            }
            return true;
        } catch (IOException e) {
            System.out.println("Directorio no existe.");
        }
        return false;
    }

    public boolean cargarClientesCsv(String ruta) {
        String[] arrayCliente = null;
        int contadorFila = 0;
        String cliente = "";
        try (BufferedReader lectorBuffer = new BufferedReader(new FileReader(ruta))) {
            while ((cliente = lectorBuffer.readLine()) != null) {
                arrayCliente = cliente.split(SEPARATOR_CSV);
                if (arrayCliente.length != 3) {
                    System.out.println("[cargarClientesCsv] Error en "+ruta + (++contadorFila) + ": se esperaban 3 columnas y se han leído " + arrayCliente.length);

                } else {
                    clientes.put(arrayCliente[0], new Cliente(arrayCliente[0], arrayCliente[1], arrayCliente[2]));
                }
            }
        } catch (IOException e) {
            System.out.println("Directorio no existe.");
        }
        return true;

    }

    public boolean guardarTurismosCsv(String ruta) {
        String datosTurismo = "";
        Turismo turismo;
        try (BufferedWriter escritorBuffer = new BufferedWriter(new FileWriter(ruta, false))) {
            for (Map.Entry<String, Vehiculo> entry : vehiculos.entrySet()

            ) {
                if (entry.getValue() instanceof Turismo) {
                    turismo = (Turismo) entry.getValue();
                    datosTurismo = entry.getValue().getMarca() + "#" + entry.getValue().getModelo() + "#" + entry.getValue().getAnioFabricacion() + "#" + entry.getValue().getMatricula() + "#" + turismo.getNumeroPuertas() + "\n";
                    escritorBuffer.write(datosTurismo);
                }
            }
            escritorBuffer.close();
            return true;
        } catch (IOException e) {
            System.out.println("Directorio no existe.");
        }
        return false;
    }

    public boolean cargarTurismosCsv(String ruta) {
        final int CAMPO_TOTAL = 5;
        String[] arrayDatosTurismo = null;
        String turismo = "";
        int contadorFila = 0;
        int fechaFabricacion = 0;
        int numeroPuerta = 0;
        try (BufferedReader lectorBuffer = new BufferedReader(new FileReader(ruta))) {
            while ((turismo = lectorBuffer.readLine()) != null) {
                arrayDatosTurismo = turismo.split(SEPARATOR_CSV);
                if (arrayDatosTurismo.length != CAMPO_TOTAL) {
                    System.out.println("[cargarTurismosCsv] Error en "+ruta + (++contadorFila) + ": se esperaban 5 columnas y se han leído " + arrayDatosTurismo.length);
                    continue;
                }
                try {
                    fechaFabricacion = Integer.parseInt(arrayDatosTurismo[2]);
                } catch (NumberFormatException e) {
                    System.out.println("[cargarTurismosCsv] Error en "+ruta  + (++contadorFila) + " parseando anio de fabricación: \n" + "For input string: \"" + arrayDatosTurismo[2] + "\"");
                    continue;
                }
                try {
                    numeroPuerta = Integer.parseInt(arrayDatosTurismo[4]);
                } catch (NumberFormatException e) {
                    System.out.println("[cargarTurismosCsv] Error en "+ruta  + (++contadorFila) + "parseando numero de puertas: \n" + "For input string: \"" + arrayDatosTurismo[4] + "\"");
                    continue;
                }

                vehiculos.put(arrayDatosTurismo[3], new Turismo(arrayDatosTurismo[0], arrayDatosTurismo[1], fechaFabricacion, arrayDatosTurismo[3], numeroPuerta));
            }
        } catch (IOException e) {
            System.out.println("Directorio no existe.");
        }
        return true;
    }

    public boolean guardarMotocicletasCsv(String ruta) {
        String datosMoto = "";
        Motocicleta motocicleta;
        try (BufferedWriter escritorBuffer = new BufferedWriter(new FileWriter(ruta, false))) {
            for (Map.Entry<String, Vehiculo> entry : vehiculos.entrySet()) {
                if (entry.getValue() instanceof Motocicleta) {
                    motocicleta = (Motocicleta) entry.getValue();
                    datosMoto = entry.getValue().getMarca() + "#" + entry.getValue().getModelo() + "#" + entry.getValue().getAnioFabricacion() + "#" + entry.getValue().getMatricula() + "#" + motocicleta.getCilindrada() + "\n";
                    escritorBuffer.write(datosMoto);
                }
            }
            escritorBuffer.close();
            return true;
        } catch (IOException e) {
            System.out.println("Directorio no existe.");
        }
        return false;
    }

    public boolean cargarMotocicletasCsv(String ruta) {
        final int CAMPO_TOTAL = 5;
        String[] arrayDatosMotocicleta = null;
        String motocicleta = "";
        int contadorFila = 0;
        int fechaFabricacion = 0;
        int cilindrada = 0;
        try (BufferedReader lectorBuffer = new BufferedReader(new FileReader(ruta))) {
            while ((motocicleta = lectorBuffer.readLine()) != null) {
                arrayDatosMotocicleta = motocicleta.split(SEPARATOR_CSV);
                if (arrayDatosMotocicleta.length != CAMPO_TOTAL) {
                    System.out.println("[cargarMotocicletasCsv] Error en "+ruta + (++contadorFila) + ": se esperaban 5 columnas y se han leído " + arrayDatosMotocicleta.length);
                    continue;
                }
                try {
                    fechaFabricacion = Integer.parseInt(arrayDatosMotocicleta[2]);
                } catch (NumberFormatException e) {
                    System.out.println("[cargarMotocicletasCsv] Error en "+ruta  + (++contadorFila) + " parseando anio de fabricación: \n" + "For input string: \"" + arrayDatosMotocicleta[2] + "\"");
                    continue;
                }
                try {
                    cilindrada = Integer.parseInt(arrayDatosMotocicleta[4]);
                } catch (NumberFormatException e) {
                    System.out.println("[cargarMotocicletasCsv] Error en "+ruta  + (++contadorFila) + "parseando cilindrada: \n" + "For input string: \"" + arrayDatosMotocicleta[4] + "\"");
                    continue;
                }


                vehiculos.put(arrayDatosMotocicleta[3], new Motocicleta(arrayDatosMotocicleta[0], arrayDatosMotocicleta[1], fechaFabricacion, arrayDatosMotocicleta[3], cilindrada));

            }
        } catch (IOException e) {
            System.out.println("Directorio no existe.");
        }
        return true;
    }

    public String toStringVehiculosOrdenMatricula(){
        TreeMap<Vehiculo, String> vehiculoOrdenMatricula = new TreeMap<>(Vehiculo.ORDEN_MATRICULA);
        String listaVehiculos = "";
        for (Map.Entry<String, Vehiculo> entry : vehiculos.entrySet()) {
            vehiculoOrdenMatricula.put(entry.getValue(), entry.getKey());
        }
        for (Map.Entry<Vehiculo, String> entry : vehiculoOrdenMatricula.entrySet()) {
            listaVehiculos += entry.getKey() + "\n";
        }
        return listaVehiculos;
    }

    /*
     * Métodos apartado Ampliaciones extra, 6.3: Cargar y guardar alquileres en formato CSV
     */
    public boolean guardarAlquileresCsv(String ruta) {
        String datosAlquileres = "";
        try (BufferedWriter escritorBuffer = new BufferedWriter(new FileWriter(ruta, false))) {
            for (Alquiler alquiler : alquileres) {
                datosAlquileres = alquiler.getCliente().getDni() +"#"+alquiler.getVehiculo().getMatricula()+"\n";
                escritorBuffer.write(datosAlquileres);
            }
            escritorBuffer.close();
            return true;
        } catch (IOException e) {
            System.out.println("Directorio no existe.");
        }
        return false;
    }
    public boolean cargarAlquileresCsv(String ruta) {
        String[] arrayAlquiler = null;
        String alquiler = "";
        try (BufferedReader lectorBuffer = new BufferedReader(new FileReader(ruta))) {
            while ((alquiler = lectorBuffer.readLine()) != null) {
                arrayAlquiler = alquiler.split(SEPARATOR_CSV);
                if (arrayAlquiler.length != 2) {
                    System.out.println(alquiler+"Datos incompleto.");
                }
                System.out.println(alquiler);
            }
        } catch (IOException e) {
            System.out.println("Directorio no existe.");
        }
        return true;
    }

}
