import programacion.tiempo.Time;

public class MainTime {
  public static void main(String[] args) {
    Time medianoche = new Time(00, 00);
    Time mediodia = new Time(12, 00, 00);

    /*
     * TODO:
     * La línea que instancia el objeto de la clase Tiempo llamado tiempoPorDefecto, 
     * no compila. Al fallar la instanciación, tampoco podemos imprimir tiempoPorDefecto.
     * Encuentra el porqué y haz el cambio necesario **en el fichero Time.java**
     * para que descomentando las líneas que instancian e imprimen tiempoPorDefecto, el 
     * programa compile.
     */

    // Tiempo tiempoPorDefecto = new Tiempo();

    System.out.println("medianoche es " + medianoche);
    System.out.println("mediodia es " + mediodia);
    // System.out.println("El valor de tiempoPorDefecto es " + tiempoPorDefecto);

    final int quince = 15;
    final int treinta = 30;
    final int noventa = 90;

    if (medianoche.addMinutes(quince)) {
      System.out.println("Después de ejecutar medianoche.addMinutes(quince), medianoche es "
          + medianoche);
    } 
    else {
      System.err.println("Error: medianoche.addMinutes(quince) ha devuelto false. medianoche"
          + " es " + medianoche);
    }

    if (medianoche.addSeconds(treinta)) {
      System.out.println("Después de ejecutar medianoche.addSeconds(treinta), medianoche es "
          + medianoche);
    } 
    else {
      System.err.println("Error: medianoche.addSeconds(treinta) ha devuelto false. medianoche"
          + " es " + medianoche);
    }

    if (medianoche.addSeconds(noventa)) {
      System.out.println("Después de ejecutar medianoche.addSeconds(noventa), medianoche es "
          + medianoche);
    } 
    else {
      System.err.println("Error: medianoche.addSeconds(noventa) ha devuelto false. medianoche"
          + " es " + medianoche);
    }

    if (mediodia.addMinutes(noventa)) {
      System.out.println("Después de ejecutar mediodia.addMinutes(noventa), mediodia es "
          + mediodia);
    } 
    else {
      System.err.println("Error: mediodia.addMinutes(noventa) ha devuelto false. "
          + "mediodia es " + mediodia);
    }

    if (mediodia.addHoras(quince)) {
      System.out.println("Después de ejecutar mediodia.addHoras(quince)="
          + quince + "), mediodia es " + mediodia);
    }
     else {
      System.err.println("Error: mediodia.addHoras(quince) ha devuelto false. mediodia es " 
          + mediodia);
    }

    
    /*
     * TODO:
     * Añade el código que necesites para probar todos los casos de uso de los métodos addSeconds, 
     * addMinutes y addHoras, y comprobar que los incrementos de tiempo se comportan como se 
     * espera: el valor de hora se encuentra entre 0 y 23, el valor de minuto entre 0 y 59 y el 
     * de segundo también entre 0 y 59.
     */

  }
}