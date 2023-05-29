import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import programacion.examen.ej1.ContadorLetra;
import programacion.examen.ej1.ContadorPalabra;


public class MainEjercicio1 {
    static final String REGEX = "[,.'\\s]";
    static TreeMap<String, Integer> listadoPalabras = new TreeMap<>();
    static TreeMap<String, Integer> listadoPalabras1 = new TreeMap<>();
    static TreeMap<Character, Integer> listadoLetras = new TreeMap<>();

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("No se ha recibido ningun argumento. Debe proporcionar la ruta relativa al fichero");
            return;
        }

        contarPalabras(args[0]);

        contarLetras(args[0]);

    }

    private static void contarLetras(String rutaFichero) {
        final int NUMERO_OCURRENCIAS = 6;

        try (FileReader nombreFichero = new FileReader(rutaFichero)) {
            int caracter;
            Character letra;
            while ((caracter = nombreFichero.read()) != -1) {
                letra = Character.toLowerCase((char) caracter);
                if (Character.isAlphabetic(letra) == true) {
                    if (listadoLetras.containsKey(letra)) {
                        listadoLetras.put(letra, listadoLetras.get(letra) + 1);
                    } else {
                        listadoLetras.put(letra, 1);
                    }
                }
            }
        } catch (IOException e1) {
            System.out.println("FileNotFoundException capturada:" + e1);
            System.out.println("No se ha podido abrir el fichero '" + rutaFichero + "'");
        }
        ArrayList<ContadorLetra> listaContadorLetras = new ArrayList<>();
        for (Map.Entry<Character, Integer> entry : listadoLetras.entrySet()) {
            listaContadorLetras.add(new ContadorLetra(entry.getKey(), entry.getValue()));
        }
        Collections.sort(listaContadorLetras, Comparator.reverseOrder());
        System.out.println("Imprimimos las 6 palabras con más ocurrencias:");
        for (int i = 0; i < NUMERO_OCURRENCIAS; i++) {
            System.out.println(listaContadorLetras.get(i).getLetra() + " -> "
                    + listaContadorLetras.get(i).getContador());
        }

    }

    private static void contarPalabras(String rutaFichero) {
        String[] arrayPalabras;
        final int NUMERO_OCURRENCIAS = 6;

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(rutaFichero))) {
            String cadenaTexto = "";
            while ((cadenaTexto = bufferedReader.readLine()) != null) {
                arrayPalabras = cadenaTexto.toLowerCase().split(REGEX);
                for (String palabra : arrayPalabras) {
                    if (palabra.isEmpty()) {
                        continue;
                    }
                    if (listadoPalabras.containsKey(palabra)) {
                        listadoPalabras.put(palabra, listadoPalabras.get(palabra) + 1);
                    } else {
                        listadoPalabras.put(palabra, 1);
                    }
                }
            }
        } catch (IOException e1) {
            System.out.println("FileNotFoundException capturada:" + e1);
            System.out.println("No se ha podido abrir el fichero '" + rutaFichero + "'");
        }
        ArrayList<ContadorPalabra> listaContadorPalabra = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : listadoPalabras.entrySet()) {
            listaContadorPalabra.add(new ContadorPalabra(entry.getKey(), entry.getValue()));
        }
        Collections.sort(listaContadorPalabra, Comparator.reverseOrder());
        System.out.println("Imprimimos las 6 palabras con más ocurrencias:");
        for (int i = 0; i < NUMERO_OCURRENCIAS; i++) {
            System.out.println(listaContadorPalabra.get(i).getPalabra() + " -> "
                    + listaContadorPalabra.get(i).getNumeroDeVeces());
        }
    }
}