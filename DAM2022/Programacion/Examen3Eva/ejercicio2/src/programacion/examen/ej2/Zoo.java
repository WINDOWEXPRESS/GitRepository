package programacion.examen.ej2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Zoo {
  String nombre;
  List<Animal> listaAnimales;

  public Zoo(String nombre) {
    this.nombre = nombre;
    listaAnimales = new ArrayList<>();
  }

  public void addAnimal(Animal animal) {
    listaAnimales.add(animal);
  }

  @Override
  public String toString() {
    String cadena = "## ZOO: " + nombre + "\n";

    cadena += "# " + listaAnimales.size() + " animales:\n";
    for (Animal animal : listaAnimales) {
      cadena += animal + "\n";
    }

    return cadena;
  }

  public String toStringMamiferos() {
    String cadena = "# Listado de Mamíferos:\n";
    for (Animal animal : listaAnimales) {
      if (animal instanceof Mamifero) {
        cadena += animal+"\n";
      }
    }
    return cadena;
  }

  public String toStringAves() {
    String cadena = "# Listado de Aves:\n";
    for (Animal animal : listaAnimales) {
      if (animal instanceof Ave) {
        cadena += animal+"\n";
      }
    }
    return cadena;
  }

  public String toStringOrdenEdad() {
    String cadena = "# Listado de animales por edad:\n";

    ArrayList<Animal> listaAnimalesOrdenEdad = new ArrayList<>(listaAnimales);

    // TODO: ordena la lista listaAnimalesOrdenEdad por la edad
    Collections.sort(listaAnimalesOrdenEdad, Animal.ORDEN_EDAD);

    for (Animal animal : listaAnimalesOrdenEdad) {
      cadena += animal + "\n";
    }
    return cadena;
  }

  public String toStringOrdenPeso() {
    String cadena = "# Listado de animales por peso:\n";

    ArrayList<Animal> listaAnimalesOrdenPeso = new ArrayList<>(listaAnimales);

    // TODO: ordena la lista listaAnimalesOrdenPeso por el peso
    Collections.sort(listaAnimalesOrdenPeso, Animal.ORDEN_PESO);
    for (Animal animal : listaAnimalesOrdenPeso) {
      cadena += animal + "\n";
    }
    return cadena;
  }

  public String toStringOrdenNatural() {
    String cadena = "# Listado de animales por su orden natural:\n";

    ArrayList<Animal> listaAnimalesOrdenNatural = new ArrayList<>(listaAnimales);

    // TODO: ordena la lista listaAnimalesOrdenNatural por el orden natural de la
    // clase Animal

    for (Animal animal : listaAnimalesOrdenNatural) {
      cadena += animal + "\n";
    }
    return cadena;
  }

}
