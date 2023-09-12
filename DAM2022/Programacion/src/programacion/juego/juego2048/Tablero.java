package juego.juego2048;

public class Tablero {
    private final int[][] tablero;
    private final int FILA = 4;
    private final int COLUMNA = 4;
    private final int espacioTotal = 10;
    private int[] listaNumero = new int[COLUMNA];

    public Tablero() {
        tablero = new int[FILA][COLUMNA];

        ponerDos();
        ponerDos();
    }

    public void ponerDos() {
        int fila;
        int columna;

        do {
            fila = (int) (Math.random() * FILA);
            columna = (int) (Math.random() * COLUMNA);
        } while (tablero[fila][columna] != 0);

        tablero[fila][columna] = 2;
    }

    public void mostrar() {

        for (int columna = 0; columna < COLUMNA; columna++) {
            //dibujarLineaHorizontal
            System.out.print("| —— —— —— ".repeat(4) + "|\n");
            for (int fila = 0; fila < FILA - 1; fila++) {
                if (fila != 1) {
                    dibujarLineaEspacioHorizontal();
                } else {
                    ponerNumeroEnCasilla(columna);
                }

            }
        }
        //dibujarLineaHorizontal
        System.out.print("| —— —— —— ".repeat(4) + "|\n");
    }

    public void ponerNumeroEnCasilla(int columna) {
        String longitudNumero;
        System.out.print("|");
        for (int fila = 0; fila < FILA; fila++) {
            longitudNumero = Integer.toString(tablero[columna][fila]);
            //los espacios que estan delante del numero
            System.out.print(" ".repeat(espacioTotal / 2 - longitudNumero.length() / 2) + tablero[columna][fila]);
            //los espacios que estan detras del numero    NO SE PORQUE RESTA 3 HACE QUE LA LINEA SEA JUSTO!!!
            System.out.print(" ".repeat(espacioTotal - (espacioTotal / 2 + longitudNumero.length()) / 2 - 3) + "|");
        }
        System.out.println();
    }

    public void dibujarLineaEspacioHorizontal() {

        System.out.print("|");
        for (int fila = 0; fila < FILA; fila++) {
            System.out.print(" ".repeat(espacioTotal) + "|");
        }
        System.out.print("\n");
    }

    public void moverArriba() {//sacar los numeros de una fila o columna en una lista ordena los numeros y sumarlo

        for (int columna = 0; columna < COLUMNA; columna++) {
            for (int fila = 0; fila < FILA; fila++) {
                listaNumero[fila] = tablero[fila][columna];
            }
            ordenarNumeros(listaNumero);
            sumarNumeros(listaNumero);
            //Poner los valores de lista en el tablero con posicion correspondiente
            for (int fila = 0; fila < FILA; fila++) {
                tablero[fila][columna] = listaNumero[fila];
            }

        }
        if(!finPartida())
        ponerDos();
    }

    public void ordenarNumeros(int[] listaColumna) {
        //menos uno por que no hay comprobar el ultimo posicion
        for (int posicion = 0; posicion < listaColumna.length - 1; posicion++) {
            if (listaColumna[posicion] == 0) {
                //buscar un numero que sea distinto que 0 y posicionar en dicha 0
                for (int posicionNoCero = posicion + 1; posicionNoCero < listaColumna.length; posicionNoCero++) {
                    if (listaColumna[posicionNoCero] != 0) {
                        listaColumna[posicion] = listaColumna[posicionNoCero];
                        listaColumna[posicionNoCero] = 0;
                        break;
                    }
                }
            }
        }
    }

    public void sumarNumeros(int[] listaColumna) {
    int maximoPosibilidadCambio = 4;
        do {
            for (int posicion = 0; posicion < listaColumna.length; posicion++) {
                for (int numeroIgual = posicion + 1; numeroIgual < listaColumna.length; numeroIgual++) {
                    if (listaColumna[numeroIgual] == 0) {
                        continue;
                    }
                    if (listaColumna[posicion] != listaColumna[numeroIgual]) {
                        break;
                    }
                    listaColumna[posicion] *= 2;
                    listaColumna[numeroIgual] = 0;

                }
            }
            maximoPosibilidadCambio--;
        } while (maximoPosibilidadCambio != 0);

    }
    public void moverAbajo() {

        for (int columna = 0; columna < COLUMNA; columna++) {
            for (int fila = 0; fila < FILA; fila++) {
                listaNumero[fila] = tablero[FILA-1-fila][columna];
            }
            ordenarNumeros(listaNumero);
            sumarNumeros(listaNumero);
            //Poner los valores de listaColumna en el tablero con posicion correspondiente
            for (int fila = 0; fila < FILA; fila++) {
                tablero[FILA-1-fila][columna] = listaNumero[fila];
            }

        }
        if(!finPartida())
        ponerDos();
    }

    public void moverDerecha() {

        for (int columna = 0; columna < COLUMNA; columna++) {
            for (int fila = 0; fila < FILA; fila++) {
                listaNumero[fila] = tablero[columna][FILA-1-fila];
            }
            ordenarNumeros(listaNumero);
            sumarNumeros(listaNumero);
            //Poner los valores de listaColumna en el tablero con posicion correspondiente
            for (int fila = 0; fila < FILA; fila++) {
                tablero[columna][FILA-1-fila] = listaNumero[fila];
            }

        }
        if(!finPartida())
        ponerDos();
    }

    public void moverIzquierda() {

        for (int columna = 0; columna < COLUMNA; columna++) {
            for (int fila = 0; fila < FILA; fila++) {
                listaNumero[fila] = tablero[columna][fila];
            }
            ordenarNumeros(listaNumero);
            sumarNumeros(listaNumero);
            //Poner los valores de listaColumna en el tablero con posicion correspondiente
            for (int fila = 0; fila < FILA; fila++) {
                tablero[columna][fila] = listaNumero[fila];
            }

        }
        if(!finPartida())
        ponerDos();
    }
    private int vacias() {
        int n=0;
        for(int f=0;f<FILA;f++) {
            for(int c=0;c<COLUMNA;c++) {
                if(tablero[f][c]==0) {
                    n++;
                }
            }
        }
        return n;
    }
    public boolean ganador() {
        for(int f=0;f<FILA;f++) {
            for(int c=0;c<COLUMNA;c++) {
                if(tablero[f][c]==2048) return true;
            }
        }
        return false;
    }

    //El juego se acaba cuando no hay casilla libre da igual si se puede fucionar los numeros o no
    public boolean finPartida() {
        return (ganador() || vacias()==0);
    }

}
