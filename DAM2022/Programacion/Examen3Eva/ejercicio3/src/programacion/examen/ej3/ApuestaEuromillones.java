package programacion.examen.ej3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeSet;

public class ApuestaEuromillones {
  private TreeSet<Integer> listaNumeros = new TreeSet<>();
  private TreeSet<Integer> listaEstrellas = new TreeSet<>();
  private final int TAMANIO_MAXIMO_NUMEROS = 4;
  private final int TAMANIO_MAXIMO_ESTRELLAS = 1;

  public void addNumero(int numero) throws ApuestaEuromillonesException {
    int numeroMinimo = 1;
    int numeroMaximo = 50;
    if (numero < numeroMinimo || numero > numeroMaximo) {
      throw new ApuestaEuromillonesException("Error: el numero '" + numero
          + "' esta fuera del rango permitido [1,50]");
    }
    if (listaNumeros.contains(numero)) {
      throw new ApuestaEuromillonesException("Error: el numero '" + numero
          + "' ya se ha añadido a la apuesta");
    }
    if (listaNumeros.size() > TAMANIO_MAXIMO_NUMEROS) {
      throw new ApuestaEuromillonesException("Error: La apuesta ya tiene 5 numeros.");
    }
    listaNumeros.add(numero);
    System.out.println("OK");
  }

  public void addEstrella(int numero) {
    int numeroMinimo = 0;
    int numeroMaximo = 12;
    if (numero < numeroMinimo || numero > numeroMaximo) {
      throw new ApuestaEuromillonesException("Error: el numero '" + numero
          + "' esta fuera del rango permitido [1,12]");
    }
    if (listaEstrellas.contains(numero)) {
      throw new ApuestaEuromillonesException("Error: el numero '" + numero
          + "' ya se ha añadido a la apuesta");
    }
    if (listaEstrellas.size() > TAMANIO_MAXIMO_ESTRELLAS) {
      throw new ApuestaEuromillonesException("Error: La apuesta ya tiene 2 estrellas");
    }
    listaEstrellas.add(numero);
    System.out.println("OK");
  }

  public boolean escribirEnFichero() {
    try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("apuestas.txt"))) {
      bufferedWriter.write(toString());
    } catch (IOException e) {
      System.out.println("Excepcion capturada:" + e);
      return false;
    }
    return true;

  }

  @Override
  public String toString() {
    String cadena = "Numeros:";

    for (int numero : listaNumeros) {
      cadena += numero + ",";
    }
    cadena += " Estrellas:";
    for (int numero : listaEstrellas) {
      cadena += numero + ",";
    }
    // TODO

    return cadena;
  }

}
