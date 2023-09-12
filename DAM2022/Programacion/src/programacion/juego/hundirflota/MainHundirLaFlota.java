package juego.hundirflota;

import java.util.Scanner;
import java.util.TreeMap;
import java.util.Vector;

public class MainHundirLaFlota {
    public static final char AGUA = 'A';
    public static final char AGUA_NO_TOCADO = '.';
    public static final char TOCADO = 'X';
    public static final int TAMANNIO = 10;
    public static Scanner scanner = new Scanner(System.in);
    public static final int INICIO_NUMERO_ASCII = 48;
    public static final int FIN_NUMERO_ASCII = 57;
    public static final int INICIO_ALPHABETA_MAYUSCULA_ASCII = 65;
    public static final int FIN_ALPHABETA_MAYUSCULA_ASCII = 74;

    public static void main(String[] args) {
        int puntosOrdenador = 24;
        int puntosJugador = 24;
        boolean juegoTerminado = false;
        boolean tiroCorrecto = false;
        char[][] mapaUsuario = new char[TAMANNIO][TAMANNIO];
        char[][] mapaOrdenador = new char[TAMANNIO][TAMANNIO];
        char[][] mapaOrdenadorParaUsuario = new char[TAMANNIO][TAMANNIO];
        //Inicializar el juego
        inicializacionMapa(mapaUsuario);
        inicializacionMapa(mapaOrdenador);
        inicializacionMapa(mapaOrdenadorParaUsuario);
        registrarBarcos(mapaUsuario);
        registrarBarcos(mapaOrdenador);
        while (!juegoTerminado) {
            tiroCorrecto = false;
            while(!tiroCorrecto){
                System.out.println("MAPA DEL USUARIO");
                imprimirMapa(mapaOrdenadorParaUsuario);
                System.out.println("MAPA DEL ORDENADOR");
                imprimirMapa(mapaOrdenador);
                System.out.println("PUNTOS RESTANTES DEL JUGADOR: "+puntosJugador);
                System.out.println("PUNTOS RESTANTES DEL OPONENTE: "+puntosOrdenador);
                System.out.println("TURNO DEL JUGADOR");
                System.out.println("Introduzca la casilla (por ejemplo A4):");
                Vector<Integer> disparo = pedirCasilla();
                if (disparo.get(0)!=-1){
                    char resultadoDisparo = evaluarDisparo(mapaOrdenador,disparo);
                    mapaOrdenadorParaUsuario[disparo.get(0)-INICIO_ALPHABETA_MAYUSCULA_ASCII][disparo.get(1)] = resultadoDisparo;
                    mapaOrdenador[disparo.get(0)-INICIO_ALPHABETA_MAYUSCULA_ASCII][disparo.get(1)] = resultadoDisparo;
                    if(resultadoDisparo == 'X'){
                        puntosOrdenador--;
                    }else{tiroCorrecto= true;};
                }else{
                    System.out.println("Coordenadas Incorrectas");
                }

            }
            System.out.println("=".repeat(30));
            tiroCorrecto = false;
            while(!tiroCorrecto){
                System.out.println("PUNTOS RESTANTES DEL ORDENADOR: "+puntosOrdenador);
                System.out.println("PUNTOS RESTANTES DEL JUGADOR: "+puntosJugador);
                System.out.println("TURNO DEL ORDENADOR");

                Vector<Integer> disparo = generarDisparoAleatorio();
                char resultadoDisparo = evaluarDisparo(mapaUsuario,disparo);
                mapaUsuario[disparo.get(0)-INICIO_ALPHABETA_MAYUSCULA_ASCII][disparo.get(1)] = resultadoDisparo;
                if(resultadoDisparo == 'X'){

                    puntosJugador--;
                }else{tiroCorrecto= true;}
                System.out.println("MAPA DEL USUARIO PARA ORDENADOR");
                imprimirMapa(mapaUsuario);
            }
            System.out.println("=".repeat(30));

        }
    }

    public static void inicializacionMapa(char[][] mapa) {
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                mapa[i][j] = AGUA_NO_TOCADO;
            }
        }
    }

    public static void registrarBarcos(char[][] mapa) {
        Vector<Integer> numeroBarcos = new Vector<>();
        numeroBarcos.add(5);
        numeroBarcos.add(5);
        numeroBarcos.add(3);
        numeroBarcos.add(3);
        numeroBarcos.add(3);
        numeroBarcos.add(1);
        numeroBarcos.add(1);
        numeroBarcos.add(1);
        numeroBarcos.add(1);
        numeroBarcos.add(1);
        Vector<Character> direcciones = new Vector<>();
        direcciones.add('V');
        direcciones.add('H');
        for (int tamanioBarco : numeroBarcos
        ) {
            while (true) {
                int fila = (int) (Math.random() * 10);
                int columna = (int) (Math.random() * 10);
                int direccion = (int) (Math.random() + 0.5);
                int tamanio = tamanioBarco;

                boolean puedePonerBarco = true;
                if ((fila + tamanioBarco) <= TAMANNIO - 1 && (columna + tamanioBarco) <= TAMANNIO - 1){
                    if(direcciones.get(direccion).equals('V')){
                        for (int i = fila; i < mapa.length; i++) {
                            if(mapa[i][columna] != AGUA_NO_TOCADO){
                                puedePonerBarco= false;
                                break;
                            }
                        }
                    }
                    if(direcciones.get(direccion).equals('H')){
                        for (int i = fila; i < mapa.length; i++) {
                            if(mapa[columna][i] != AGUA_NO_TOCADO){
                                puedePonerBarco= false;
                                break;
                            }
                        }
                    }
                }else {
                    puedePonerBarco= false;
                }
                if(puedePonerBarco){
                    if(direcciones.get(direccion).equals('V')){
                        for (int i = fila; i < mapa.length; i++) {
                            mapa[i][columna] = (char)(tamanioBarco+48);
                            tamanio--;
                            if(tamanio == 0){
                                break;
                            }
                        }
                    }
                    if(direcciones.get(direccion).equals('H')){
                        for (int i = fila; i < mapa.length; i++) {
                            mapa[columna][i] = (char)(tamanioBarco+48);
                            tamanio--;
                            if(tamanio == 0){
                                break;
                            }
                        }
                    }
                    break;
                }
            }
        }
    }

    public static void imprimirMapa(char[][] mapa) {
        for (int i = 0; i < mapa.length; i++) {
            System.out.print("\t["+i+"]");
        }
        System.out.println();
        for (int i = 0; i < mapa.length; i++) {
            System.out.print("["+(char)(i+65)+"]\t");
            for (int j = 0; j < mapa[i].length; j++) {
                System.out.print(" "+mapa[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static Vector<Integer> pedirCasilla(){
        Vector<Integer> coordenada = new Vector<>(2);
        String coordenadas = scanner.nextLine();
        char coordenadaAlphabeta = coordenadas.charAt(0);
        int coordenadaNumerico = coordenadas.charAt(1);
        if ((coordenadaNumerico >= INICIO_NUMERO_ASCII &&  coordenadaNumerico<= FIN_NUMERO_ASCII) &&
                (coordenadaAlphabeta >= INICIO_ALPHABETA_MAYUSCULA_ASCII && coordenadaAlphabeta <= FIN_ALPHABETA_MAYUSCULA_ASCII)) {
            {
                coordenada.add((int) coordenadaAlphabeta);
                coordenada.add(coordenadaNumerico-INICIO_NUMERO_ASCII);
            }
        }else {
            //Si no lo son correctas se almacenarán sendos -1 en las dos posiciones del vector.
            coordenada.add(-1);
            coordenada.add(-1);
        }
        return coordenada;
    }
    public static char evaluarDisparo(char[][] mapa,Vector<Integer> coordenada){
        char datoDisparo;

        if(mapa[coordenada.get(0)-INICIO_ALPHABETA_MAYUSCULA_ASCII][coordenada.get(1)]==AGUA_NO_TOCADO){
            datoDisparo = AGUA;
        } else if (coordenada.get(0)-INICIO_ALPHABETA_MAYUSCULA_ASCII == -1 &&coordenada.get(1) == -1) {
            datoDisparo = 'E';
        }else {
            datoDisparo = 'X';

        }

        return  datoDisparo;
    }

    public static Vector<Integer> generarDisparoAleatorio(){
        Vector<Integer> coordenada = new Vector<>(2);
        char coordenadaAlphabeta = (char) ((Math.random()*9)+INICIO_ALPHABETA_MAYUSCULA_ASCII);
        int coordenadaNumerico = (int) ((Math.random()*9)+INICIO_NUMERO_ASCII);
        if ((coordenadaNumerico >= INICIO_NUMERO_ASCII &&  coordenadaNumerico <= FIN_NUMERO_ASCII) &&
                (coordenadaAlphabeta >= INICIO_ALPHABETA_MAYUSCULA_ASCII &&coordenadaAlphabeta <= FIN_ALPHABETA_MAYUSCULA_ASCII)) {
            {
                coordenada.add((int) coordenadaAlphabeta);
                coordenada.add(coordenadaNumerico-INICIO_NUMERO_ASCII);
            }
        }
        //SIENDO GENERADO NOSOTROS NO HAY ERROR DE COORDENADA
        return coordenada;
    }
}
