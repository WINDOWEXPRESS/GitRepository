package juego.diccionario;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class MainDiccionario {
    private static Diccionario diccionario = new Diccionario();
    private static Scanner lector = new Scanner(System.in);
    public static void main(String[] args) {
        rellenarDiccionario();
        juego();
    }

    private static void juego() {
        String palEsp;
        String letraIng;
        String respuesta;
        String palIng;

        int totPreg = 0;
        int totAciertos = 0;
        int totErrores = 0;
        double porcentaje = 0.0;

        do {
            palEsp = diccionario.palabraAleatoria();
            letraIng = diccionario.primeraLetraTraduccion(palEsp);

            System.out.println(palEsp + ": " + letraIng + "...");
            System.out.println("Indique la respuesta: ");
            respuesta = lector.nextLine();

            if(!respuesta.equalsIgnoreCase("fin")) {
                totPreg++;
                palIng = diccionario.traducir(palEsp);
                if (respuesta.equalsIgnoreCase(palIng)) {
                    System.out.println("¡¡CORRECTO!!");
                    totAciertos++;
                } else {
                    System.out.println("¡NO! La respuesta correcta es " + palIng);
                    totErrores++;
                }

            }

        } while (!respuesta.equalsIgnoreCase("fin"));

        porcentaje = ((double) totAciertos / (double) totPreg) * 100.0;

        System.out.println("Total de preguntas: "+totPreg);
        System.out.println("Total de aciertos: "+totAciertos);
        System.out.println("Totasl de errores: "+totErrores);
        System.out.printf("Aciertos: %.2f"+porcentaje+"%");

    }

    private static void rellenarDiccionario()  {
        File fileName = new File("Palabras.txt");
        try (FileReader lectorFichero = new FileReader(fileName)) {
            BufferedReader bufferedReader = new BufferedReader(lectorFichero);
            String linea = "";
            while ((linea = bufferedReader.readLine()) != null) {
                String[] palabras = linea.split(";");
                diccionario.nuevoPar(palabras[0],palabras[1]);

            }
        }catch (Exception e) {
            System.out.println("Error en la lectura desde el archivo");
        }
    }
}
