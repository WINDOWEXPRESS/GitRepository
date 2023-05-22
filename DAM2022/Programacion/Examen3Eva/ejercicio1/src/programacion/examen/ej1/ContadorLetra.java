package programacion.examen.ej1;

public class ContadorLetra implements Comparable<ContadorLetra> {
  Character letra;
  Integer contador;
  
  public ContadorLetra(Character letra, int contador) {
    //TODO
  }

  public Character getLetra() {
    //TODO
    return ' ';
  }

  public Integer getContador() {
    //TODO
    return 1;
  }

  @Override
  public int compareTo(ContadorLetra o) {
    return letra.compareTo(o.letra);
  }

}
