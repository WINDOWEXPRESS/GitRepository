import programacion.examen.ej3.ApuestaEuromillones;
import programacion.examen.ej3.ApuestaEuromillonesException;

public class MainEjercicio3 {
  public static void main(String[] args) {
    System.out.println("Creando apuesta Euromillones...");
    ApuestaEuromillones apuesta = new ApuestaEuromillones();

    int numeroAuxiliar = 0;
    numeroAuxiliar = 50;
    System.out.print("Añadimos el número " + numeroAuxiliar + "... ");
    try {
      apuesta.addNumero(numeroAuxiliar);
    } catch (ApuestaEuromillonesException e) {
      System.out.println(e);
    }

    numeroAuxiliar = 50;
    System.out.print("Añadimos el número " + numeroAuxiliar + "... ");
    try {
      apuesta.addNumero(numeroAuxiliar);
    } catch (ApuestaEuromillonesException e) {
      System.out.println(e);
    }

    numeroAuxiliar = 10;
    System.out.print("Añadimos el número " + numeroAuxiliar + "... ");
    try {
      apuesta.addNumero(numeroAuxiliar);
    } catch (ApuestaEuromillonesException e) {
      System.out.println(e);
    }

    numeroAuxiliar = -5;
    System.out.print("Añadimos el número " + numeroAuxiliar + "... ");
    try {
      apuesta.addNumero(numeroAuxiliar);
    } catch (ApuestaEuromillonesException e) {
      System.out.println(e);
    }

    numeroAuxiliar = 51;
    System.out.print("Añadimos el número " + numeroAuxiliar + "... ");
    try {
      apuesta.addNumero(numeroAuxiliar);
    } catch (ApuestaEuromillonesException e) {
      System.out.println(e);
    }

    numeroAuxiliar = 0;
    System.out.print("Añadimos el número " + numeroAuxiliar + "... ");
    try {
      apuesta.addNumero(numeroAuxiliar);
    } catch (ApuestaEuromillonesException e) {
      System.out.println(e);
    }

    numeroAuxiliar = 7;
    System.out.print("Añadimos el número " + numeroAuxiliar + "... ");
    try {
      apuesta.addNumero(numeroAuxiliar);
    } catch (ApuestaEuromillonesException e) {
      System.out.println(e);
    }

    numeroAuxiliar = 27;
    System.out.print("Añadimos el número " + numeroAuxiliar + "... ");
    try {
      apuesta.addNumero(numeroAuxiliar);
    } catch (ApuestaEuromillonesException e) {
      System.out.println(e);
    }

    numeroAuxiliar = 43;
    System.out.print("Añadimos el número " + numeroAuxiliar + "... ");
    try {
      apuesta.addNumero(numeroAuxiliar);
    } catch (ApuestaEuromillonesException e) {
      System.out.println(e);
    }

    numeroAuxiliar = 38;
    System.out.print("Añadimos el número " + numeroAuxiliar + "... ");
    try {
      apuesta.addNumero(numeroAuxiliar);
    } catch (ApuestaEuromillonesException e) {
      System.out.println(e);
    }

    numeroAuxiliar = -2;
    System.out.print("Añadimos la estrella " + numeroAuxiliar + "... ");
    try {
      apuesta.addEstrella(numeroAuxiliar);
    } catch (ApuestaEuromillonesException e) {
      System.out.println(e);
    }

    numeroAuxiliar = 13;
    System.out.print("Añadimos la estrella " + numeroAuxiliar + "... ");
    try {
      apuesta.addEstrella(numeroAuxiliar);
    } catch (ApuestaEuromillonesException e) {
      System.out.println(e);
    }

    numeroAuxiliar = 12;
    System.out.print("Añadimos la estrella " + numeroAuxiliar + "... ");
    try {
      apuesta.addEstrella(numeroAuxiliar);
    } catch (ApuestaEuromillonesException e) {
      System.out.println(e);
    }

    numeroAuxiliar = 7;
    System.out.print("Añadimos la estrella " + numeroAuxiliar + "... ");
    try {
      apuesta.addEstrella(numeroAuxiliar);
    } catch (ApuestaEuromillonesException e) {
      System.out.println(e);
    }

    numeroAuxiliar = 1;
    System.out.print("Añadimos la estrella " + numeroAuxiliar + "... ");
    try {
      apuesta.addEstrella(numeroAuxiliar);
    } catch (ApuestaEuromillonesException e) {
      System.out.println(e);
    }

    System.out.println("Apuesta Euromillones: " + apuesta);

    if (!apuesta.escribirEnFichero()) {
      System.out.println("Error en metodo escribirEnFichero()");
    }
    ;
  }

}
