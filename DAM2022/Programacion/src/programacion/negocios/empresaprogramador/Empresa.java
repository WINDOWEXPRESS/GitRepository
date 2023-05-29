package negocios.empresaprogramador;

import java.io.*;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Empresa {
    private String nombreEmpresa;
    private TreeSet<AbstractEmpleado> listaEmpleado;

    public Empresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
        listaEmpleado = new TreeSet<>();
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void addEmpleado(AbstractEmpleado empleado) {
        if (listaEmpleado.contains(empleado)) {
            System.out.println("Empleado '" + empleado.nombre + "' ya esta registrado en la empresa.");
        }
        listaEmpleado.add(empleado);
    }


    public String toStringOrdenSueldo() {
        TreeSet<AbstractEmpleado> listaEmpleadoOrdenSueldo = new TreeSet<>(AbstractEmpleado.ORDENAR_POR_SUELDO);
        listaEmpleadoOrdenSueldo.addAll(this.listaEmpleado);
        String cadednaListaEmpleado = "";
        Iterator<AbstractEmpleado> iteratorEmpleado = listaEmpleadoOrdenSueldo.iterator();
        while (iteratorEmpleado.hasNext()) {
            cadednaListaEmpleado += iteratorEmpleado.next() + "\n";
        }
        return cadednaListaEmpleado;
    }

    public String toStringOrdenNombre() {
        //usando clase anonimo y expresion lambda
        TreeSet<AbstractEmpleado> listaEmpleadoOrdenNombre = new TreeSet<>((o1, o2) -> o1.nombre.compareTo(o2.nombre));
        listaEmpleadoOrdenNombre.addAll(listaEmpleado);
        String cadednaListaEmpleado = "";
        Iterator<AbstractEmpleado> iteratorEmpleado = listaEmpleadoOrdenNombre.iterator();
        while (iteratorEmpleado.hasNext()) {
            cadednaListaEmpleado += iteratorEmpleado.next() + "\n";
        }
        return cadednaListaEmpleado;
    }

    public void cargarDesdeCSV(String archivoCargar) {
        File file = new File(archivoCargar);
        String texto;
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
        boolean aniadirDesdeUltimaLinea = false;
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

    public String toStringEmpleadoPorPuesto(TipoEmpleado tipoEmpleado) {
        String cadednaListaEmpleado = "";
        for (AbstractEmpleado empleado : listaEmpleado) {
            if (empleado.getTipoEmpleado() == tipoEmpleado) {
                cadednaListaEmpleado += empleado + "\n";
            }
        }
        return  cadednaListaEmpleado;
    }

    @Override
    public String toString() {
        String cadednaListaEmpleado = "";
        Iterator<AbstractEmpleado> iteratorEmpleado = listaEmpleado.iterator();
        while (iteratorEmpleado.hasNext()) {
            cadednaListaEmpleado += iteratorEmpleado.next() + "\n";
        }
        return cadednaListaEmpleado;
    }


}
