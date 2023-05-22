package programacion.examen.ej2;

import java.util.Comparator;

public abstract class Animal implements Comparable<Animal> {
  protected String nombre;
  protected int edad;

  public int getEdad() {
    return edad;
  }

  protected float peso;
  protected TipoAnimal tipo;

  public Animal(String nombre, int edad, float peso, TipoAnimal tipo) throws ParametroInvalidoException {
    if (nombre.isEmpty()) {
      throw new ParametroInvalidoException("Excepcion capturada creando " + tipo + ": NOmbre vacio");
    }
    this.nombre = nombre;
    if (edad < 0) {
      throw new ParametroInvalidoException("Excepcion capturada creando " + tipo + ": Edad invalido:" + edad);
    }
    this.edad = edad;
    if (peso <= 0) {
      throw new ParametroInvalidoException("Excepcion capturada creando " + tipo + " : Peso invaldio:" + peso);
    }
    this.peso = peso;
    this.tipo = tipo;
  }

  public static final Comparator<Animal> ORDEN_EDAD = new Comparator<Animal>() {
    @Override
    public int compare(Animal o1, Animal o2) {
      if (o1.edad > (o2.edad)) {
        return 1;
      }
      if (o1.edad < (o2.edad)) {
        return -1;
      }
      return 0;
    }
  };

  public static final Comparator<Animal> ORDEN_PESO = new Comparator<Animal>() {
    @Override
    public int compare(Animal o1, Animal o2) {
      if (o1.peso > (o2.peso)) {
        return 1;
      }
      if (o1.peso < (o2.peso)) {
        return -1;
      }
      return 0;
    }
  };

  public TipoAnimal getTipo() {
    return tipo;
  }

  public int compareTo(Animal a1) {
    return nombre.compareTo(a1.nombre);
  }

  @Override
  public String toString() {
    return String.format("%s: %s, %d años, %.2f kilos", tipo, nombre, edad, peso);
  }
}
