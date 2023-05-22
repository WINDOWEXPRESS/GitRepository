import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import programacion.examen.ej1.ContadorPalabra;



public class MainEjercicio1 {
  static final String REGEX = "[,.' ]";

  public static void main(String[] args) {

    if(args.length == 0){
      System.out.println("No se ha recibido ningun argumento. Debe proporcionar la ruta relativa al fichero");
    }

    String[]  listaGeneralPalabras = new String[1000]; 
    try (BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]))) {
      String cadenaTexto = "";
      while((cadenaTexto= bufferedReader.readLine())!=null){
        listaGeneralPalabras = cadenaTexto.toLowerCase().split(REGEX);
      }
    } catch (IOException e1) {
      System.out.println("FileNotFoundException capturada:"+e1);
      System.out.println("No se ha podido abrir el fichero '"+args[0]+"'");
    }
    
    ContadorPalabra contadorPalabra = new ContadorPalabra(listaGeneralPalabras);
    
    
    //contarPalabras(args[0]);
    
    contarLetras(args[0]);

  }

  private static void contarLetras(String rutaFichero) {
    
  
    
  }

  private static void contarPalabras(String rutaFichero) {
    String[]  listaGeneralPalabras = new String[1000]; 

    try (BufferedReader bufferedReader = new BufferedReader(new FileReader(rutaFichero))) {
      String cadenaTexto = "";
      while((cadenaTexto= bufferedReader.readLine())!=null){
        listaGeneralPalabras = cadenaTexto.toLowerCase().split(REGEX);
      }
    } catch (IOException e1) {
      System.out.println("FileNotFoundException capturada:"+e1);
      System.out.println("No se ha podido abrir el fichero '"+rutaFichero+"'");
    }
    
  }
}