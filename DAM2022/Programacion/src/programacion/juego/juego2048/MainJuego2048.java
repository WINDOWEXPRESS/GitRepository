package juego.juego2048;

import java.util.Scanner;

public class MainJuego2048 {
    static Scanner scanner = new Scanner(System.in);
    static Tablero tablero = new Tablero();
    static int opcion = 0;
    static boolean partidaEnJuego;
    public static void main(String[] args) {
        do {
            menuPrincipal();
            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                opcion = 0;
            }
            opcion(opcion);
        } while (opcion != 3);


    }

    public static void menuPrincipal() {
        System.out.println("\nMenu Principal\n");
        System.out.println("1. Iniciar Nueva Partida");
        System.out.println("2. Continuar partida actual");
        System.out.println("3. Salir");
        System.out.println("Introduce opción: ");

    }

    public static void opcion(int opc) {
        switch (opcion) {
            case 1:
                iniciarPartida();
                break;
            case 2:
                if(partidaEnJuego)
                    continuarPartida();
                else
                    System.out.println("No hay partida en juego");
                break;
            case 3:
                System.out.println("Fin del juego");
                break;
            default:
                System.out.println("Opción desconocida");
        }
    }

    private static void continuarPartida() {
        iniciarPartida();
    }

    private static void iniciarPartida() {
        partidaEnJuego = true;
        String direccion;

        do {
            tablero.mostrar();
            System.out.println("izq (a) / der (d) / arriba (w) / abajo (s) / menu (m): ");
            direccion = scanner.nextLine().toLowerCase();

            switch (direccion) {
                case "w":
                    tablero.moverArriba();
                    break;
                case "s":
                    tablero.moverAbajo();
                    break;
                case "a":
                    tablero.moverIzquierda();
                    break;
                case "d":
                    tablero.moverDerecha();
                    break;
                case "m":
                    System.out.println("Volviendo al menu...");
                    break;
                default:
                    System.out.println("Opción desconocida");
            }

        } while(!direccion.equals("m") && !tablero.finPartida());

        if (tablero.finPartida()) {
            tablero.mostrar();
            String mensaje = tablero.ganador() ? "Has Ganado!!!" : "Has perdido";
            System.out.println(mensaje);
            partidaEnJuego = false;
        }


    }


}
