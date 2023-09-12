package juego.diccionario;

import java.util.HashMap;
import java.util.Iterator;

public class Diccionario {
    private HashMap<String,String> diccionario;

    public Diccionario() {
        this.diccionario = new HashMap<>();
    }

    public void nuevoPar(String espaniol, String ingles) {
        diccionario.put(espaniol, ingles);
    }
    public String traducir(String espaniol) {
        return diccionario.get(espaniol);
    }

    public String palabraAleatoria() {
        int numeroPalabra = diccionario.size();
        int numAl = (int) (Math.random() * numeroPalabra);
        String listaPalabras = (String) diccionario.keySet().toArray()[numAl];

        return listaPalabras;
    }
    public String primeraLetraTraduccion(String espaniol) {
        String primeraLetra = diccionario.get(espaniol);
        return primeraLetra.substring(0,1);
    }

}
