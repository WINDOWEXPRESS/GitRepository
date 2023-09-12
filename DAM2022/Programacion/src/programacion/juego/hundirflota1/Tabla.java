package juego.hundirflota1;

import java.util.HashMap;
import java.util.Vector;

public class Tabla {
    private char[][] mapaJugador ;
    private char[][] mapaOrdenadorParaUsuario ;
    //Colecciones
    private final HashMap<Character,Integer> filaTablero;
    private final Vector<Integer> tamanioBarcos;
    private final Vector<Character> direcciones;

    //variables constante
    private final int TAMANIO = 10;
    private final char AGUA='A';
    private final char AGUA_NO_TOCADO='·';
    private final char TOCADO='X';
    public Tabla(){
        mapaJugador = new char[TAMANIO][TAMANIO];
        mapaOrdenadorParaUsuario = new char[TAMANIO][TAMANIO];
        //Iniciar posiciones en el que indicaremos la fila mediante una letra(A-J)
        filaTablero = new HashMap<>();
        filaTablero.put('A',0);
        filaTablero.put('B',1);
        filaTablero.put('C',2);
        filaTablero.put('D',3);
        filaTablero.put('E',4);
        filaTablero.put('F',5);
        filaTablero.put('G',6);
        filaTablero.put('H',7);
        filaTablero.put('I',8);
        filaTablero.put('J',9);
        //Iniciar tamanio de los barcos
        tamanioBarcos = new Vector<>();
        tamanioBarcos.add(5);
        tamanioBarcos.add(5);
        tamanioBarcos.add(3);
        tamanioBarcos.add(3);
        tamanioBarcos.add(3);
        tamanioBarcos.add(1);
        tamanioBarcos.add(1);
        tamanioBarcos.add(1);
        tamanioBarcos.add(1);
        tamanioBarcos.add(1);

        //Iniciar posicion horizontal y vertical (para generar direccion barco)
        direcciones = new Vector<>();
        direcciones.add('V');
        direcciones.add('H');
        //iniciar mapa
        inicializacionMapa(mapaJugador);
        inicializacionMapa(mapaOrdenadorParaUsuario);
        registrarBarcos(mapaJugador);

    }
    public void inicializacionMapa(char[][] mapa){
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                mapa[i][j] = AGUA_NO_TOCADO;
            }
        }
    }

    public void registrarBarcos(char[][] mapa) {
        int fila;
        int columna;
        int direccion;
        int tamanio;
        boolean puedePonerBarco;
        for (int tamanioBarco : tamanioBarcos
        ) {
            while (true) {
                //posiciones aleatorias entre 0 a 9
                fila = (int) (Math.random() * TAMANIO);
                columna = (int) (Math.random() * TAMANIO);
                //numero aleatorio entre 0 a 1 para indicar vertical o horizontal respectivamente.
                direccion = (int) Math.round(Math.random());
                tamanio = tamanioBarco;
                //condicion para ver si el barco, según su tamaño, cabe en la dirección que ha salido
                if ((fila + tamanioBarco) <= TAMANIO - 1 && (columna + tamanioBarco) <= TAMANIO - 1){
                    if(direcciones.get(direccion).equals('V')){
                        for (int i = fila; i < (fila + tamanioBarco); i++) {
                            if(mapa[i][columna] != AGUA_NO_TOCADO){
                                break;
                            }
                        }
                    }
                    if(direcciones.get(direccion).equals('H')){
                        for (int i = fila; i < (columna + tamanioBarco); i++) {
                            if(mapa[columna][i] != AGUA_NO_TOCADO){
                                break;
                            }
                        }
                    }
                }else {
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
    public void imprimirMapa(char[][] mapa) {
        for (int i = 0; i < mapa.length; i++) {
            System.out.print("\t["+i+"]");
        }
        System.out.println();
        for (int i = 0; i < mapa.length; i++) {
            System.out.print("["+filaTablero.get(i) +"]\t");
            for (int j = 0; j < mapa[i].length; j++) {
                System.out.print(" "+mapa[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
