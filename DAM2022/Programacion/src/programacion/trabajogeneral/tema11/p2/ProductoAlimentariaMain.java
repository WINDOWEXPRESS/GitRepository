package trabajogeneral.tema11.p2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ProductoAlimentariaMain {
    static String nombreEmpresa;
    public static void main(String[] args) {
        //Instanciar la clase Scanner
        Scanner dato = new Scanner(System.in);
        // Definir Variables e instancias de las clases
        String nombre;
        String fechaDeCaducidad;
        int numeroDeLote = 0;
        String fechaEnvasado;
        String paisDeOrigen;
        LocalDate fecha;
        int temperaturaRecomendada;
        Fresco fresco;
        Refrigerado refrigerado;
        Congelado congelado;
        // Definimos el formato de la fecha a ingresar
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Nombre de la empresa:");
        nombreEmpresa = dato.nextLine();
        int opcion;
        do {
            Menu();
            opcion = dato.nextInt();
            dato.nextLine();
            switch (opcion) {
                case 1:
                    Fresco fresco1 = new Fresco("nombre", 1, LocalDate.now(), LocalDate.now(), "paisDeOrigen");
                    fresco1.addNumeroLote(1);

                    fresco = new Fresco();
                    System.out.println("Has seleccionado introducir un producto fresco.");

                    // Pedir introducir los datos del producto
                    do {
                        System.out.println("Introduce el nombre del producto:");
                        nombre = dato.nextLine();
                    } while (nombre.isEmpty());
                    do {
                        System.out.println("Introduce su numero de lote: ");
                        try {
                            numeroDeLote = dato.nextInt();
                        } catch (InputMismatchException e) {
                            System.out.println("Dato erroneo!");
                            dato.nextLine();
                        }

                    } while (!fresco.addNumeroLote(numeroDeLote));
                    dato.nextLine();
                    Date date ;
                    do {
                        System.out.println("Introduce su fecha de caducidad(formato dd/MM/yyyy):");
                        fechaDeCaducidad = dato.nextLine();
                        fecha = LocalDate.parse(fechaDeCaducidad, formatter);
                        System.out.println(fecha);

                    }while (fechaDeCaducidad.isEmpty());
                    do {
                        System.out.println("Introduce su fecha de envasado(formato dd/MM/yyyy):");
                        fechaEnvasado = dato.nextLine();
                        LocalDate LocalDatefechaEnvasado = LocalDate.parse(fechaEnvasado, formatter);
                    }while (fechaEnvasado.isEmpty());

                    do {
                        System.out.println("Introduce su pais de origen:");
                        paisDeOrigen = dato.nextLine();
                    }while (paisDeOrigen.isEmpty());

                    fresco = new Fresco(nombre, numeroDeLote, fecha, LocalDate.now(), paisDeOrigen);

                fresco.showNum();
                    System.out.println(fresco.toString());
                    System.out.println("-----------------");
                    break;
                /*case 2:
                    do {
                        System.out.println("Has seleccionado introducir un producto refrigerado.");
                        System.out.println("Introduce el nombre del producto:");
                        nombre = dato.nextLine();
                        System.out.println("Introduce su fecha de caducidad:");
                        fechaDeCaducidad = dato.nextLine();
                        System.out.println("Introduce su numero de lote: ");
                        numeroDeLote = dato.nextInt();
                        dato.nextLine();
                        System.out.println("Introduce el codigo del organismo que envia el producto.");
                        int codigoOrganismo;
                        codigoOrganismo = dato.nextInt();
                        dato.nextLine();
                        System.out.println("Introduce la temperatura recomendada del producto:");
                        temperaturaRecomendada = dato.nextInt();
                        dato.nextLine();
                        System.out.println("Introduce el pais de origen del producto:");
                        paisDeOrigen = dato.nextLine();

                        productoRefrigerado1.setDatos(nombre, fechaDeCaducidad, numeroDeLote);
                        productoRefrigerado1.setDatosProductoRefrigerado(codigoOrganismo, temperaturaRecomendada, paisDeOrigen);

                        if (productoRefrigerado1.datosCorrectos() == false) {
                            System.out.println("Datos introducidos incorrectos.");
                        }
                    } while (productoRefrigerado1.datosCorrectos() == false);

                    System.out.println();
                    System.out.println(productoRefrigerado1);
                    System.out.println("*******************");

                    // for (int i = 0; i < arrayProductoRefrigerado.size(); i++) {
                    // if (arrayProductoRefrigerado.get(i) == null) {
                    arrayProductoRefrigerado.add(productoRefrigerado1);
                    // }
                    // }

                    System.out.println("¿Desea ver los productos refrigerados guardados? S/N");
                    String respuesta;
                    respuesta = dato.nextLine();
                    if (respuesta.equalsIgnoreCase("S")) {
                        for (int i = 0; i < arrayProductoRefrigerado.size(); i++) {
                            System.out.println((i+1) + ") " + arrayProductoRefrigerado.get(i));
                        }
                        for(ProductoRefrigerado variableIteracion: arrayProductoRefrigerado){
                            System.out.println(variableIteracion);
                        }

                    } else if (respuesta.equalsIgnoreCase("N")) {
                        System.out.println("Has decidido no ver los productos almacenados.");
                    } else {
                        System.out.println("Respuesta introducida no reconocida.");
                    }
                    break;

                case 3:
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("La opcion ingresada no es correcta. Vuelve a intentarlo.");
                    System.out.println();
                    break;
            }
            System.out.println("==> Productos Refrigerados ("+ arrayProductoRefrigerado.size() + "):");
            for(ProductoRefrigerado variableIteracion: arrayProductoRefrigerado){
                System.out.println(variableIteracion);
            }
            System.out.println("==> Productos Frescos ("+ arrayProductoFresco.size() + "):");
            for(Producto variableIteracion: arrayProductoFresco){
                System.out.println(variableIteracion);
            */
            }

        } while (opcion != 7);

    }
    public static void Menu() {
        int longitudCadena = (42-nombreEmpresa.length())/2;
        System.out.println("==============================================");
        System.out.print("||"+"*".repeat(longitudCadena)+nombreEmpresa);
        System.out.println((nombreEmpresa.length()%2!=0?"*".repeat(longitudCadena+1):"*".repeat(longitudCadena))+"||");
        System.out.println("==============================================");
        System.out.println("||*******************Menu*******************||");
        System.out.println("||1.Ingresar productos frescos.             ||");
        System.out.println("||2.Visualizar productos frescos.           ||");
        System.out.println("||3.Ingresar productos refrigerados.        ||");
        System.out.println("||4.Visualizar productos refrigerados.      ||");
        System.out.println("||5.Ingresar productos congerados.          ||");
        System.out.println("||6.Visualizar productos congerados.        ||");
        System.out.println("||7.Salir.                                  ||");
        System.out.println("==============================================");
    }
}
