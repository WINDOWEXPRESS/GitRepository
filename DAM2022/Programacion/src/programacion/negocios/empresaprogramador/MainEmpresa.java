package negocios.empresaprogramador;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainEmpresa {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Empresa del Juan de la Cierva");
        int opcion = 0;

        Scanner scanner = new Scanner(System.in);

        AbstractEmpleado programador = new Programador("Juan Cierva", 2000.50, "Java", true);
        empresa.addEmpleado(programador);

        AbstractEmpleado programador1 = new Programador("Juan Cierva", 2500.50, "C++", true);
        empresa.addEmpleado(programador1);

        AbstractEmpleado gerente = new Gerente("Lola", 1666.66, "HHRR");
        empresa.addEmpleado(gerente);

        AbstractEmpleado gerente1 = new Gerente("Losi", 2100.66, "HHRR");
        empresa.addEmpleado(gerente1);

        AbstractEmpleado programador2 = new Programador("Sargys", 3400.50, "FullStack", false);
        empresa.addEmpleado(programador2);

        AbstractEmpleado programador3 = new Programador("Zhouyi Chen", 4500.50, "FullStack", true);
        empresa.addEmpleado(programador3);

        AbstractEmpleado programador4 = new Programador("David", 2400.50, "Python", false);
        empresa.addEmpleado(programador4);

        AbstractEmpleado programador5 = new Programador("Marcos", 2700.50, "C#", false);
        empresa.addEmpleado(programador5);

        do {
            System.out.println(empresa.getNombreEmpresa());
            imprimirMenu();
            try {
                opcion = scanner.nextInt();
            } catch (InputMismatchException e) {
                scanner.nextLine();
            }
            switch (opcion) {

                case 1:
                    // Imprimir todos los empleados
                    empresa.toStringEmpleados();
                    break;

                case 2:
                    // Imprimir programadores
                    empresa.toStringProgramadores();
                    break;

                case 3:
                    // Imprimir empleados por sueldo de MAYOR A MENOR
                    empresa.toStringOrdenSueldo();
                    break;
                case 4:
                    // Imprimir empleados por nombre
                    empresa.toStringOrdenNombre();
                    break;

                case 5:
                    scanner.nextLine();
                    // Cargar desde CSV
                    System.out.println("Ingrese el nombre del archivo CSV a cargar:");
                    String archivoCargar = scanner.nextLine();
                    empresa.cargarDesdeCSV(archivoCargar);
                    break;

                case 6:
                    // Guardar en CSV
                    scanner.nextLine();
                    System.out.println("Ingrese el nombre del archivo CSV para guardar:");
                    String archivoGuardar = scanner.nextLine();
                    try{
                        empresa.guardarEnCSV(archivoGuardar);
                    }catch (RuntimeException e){
                        System.out.println(e);
                    }

                    break;

                case 7:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Formato u opción invalido vuelve intentarlo.");
                    break;
            }
        } while (opcion != 7);
    }

    private static void imprimirMenu() {
        System.out.println("### Menú Empresa ###");
        System.out.println("1. Imprimir todos los empleados");
        System.out.println("2. Imprimir todos los programadores");
        System.out.println("3. Imprimir empleados por sueldo");
        System.out.println("4. Imprimir empleados por nombre");
        System.out.println("5. Cargar desde fichero CSV");
        System.out.println("6. Guardar en CSV");
        System.out.println("7. Salir");
        System.out.println("Introduce una opción:");
    }
}