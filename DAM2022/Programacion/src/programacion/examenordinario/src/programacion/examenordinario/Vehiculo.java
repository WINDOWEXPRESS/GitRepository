package programacion.examenordinario;

import java.util.Comparator;

public abstract class Vehiculo implements Comparable<Vehiculo>{
  private final String REGEX_MATRICULA="[0-9]{4}[B-DF-HJ-NP-TV-Z]{3}";
  private String marca;
  private String modelo;
  private Integer anioFabricacion;
  private String matricula;
  private TipoVehiculo tipo;

  public Vehiculo(String marca, String modelo, Integer anioFabricacion, String matricula, TipoVehiculo tipo)throws ParametroInvalidoException{
    if(marca.isEmpty()){
      throw new ParametroInvalidoException(" Vehiculo: argumento marca vacío");
    }
    this.marca = marca;
    if(modelo.isEmpty()){
      throw new ParametroInvalidoException(" Vehiculo: argumento modelo vacío");
    }
    this.modelo = modelo;
    if(anioFabricacion<1867){
      throw new ParametroInvalidoException(" Vehiculo: argumento año de fabricación inválido, debe ser mayor a 1867");
    }
    this.anioFabricacion = anioFabricacion;
    if(matricula.isEmpty()){
      throw new ParametroInvalidoException(" Vehiculo: argumento matricula vacío");
    }
   /* if(matricula.matches(REGEX_MATRICULA)){
      throw new ParametroInvalidoException(" Vehiculo: argumento matricula formato invalido");
    }*/
    this.matricula = matricula;
    this.tipo = tipo;
  }
  public static final Comparator<Vehiculo> ORDEN_MATRICULA = new Comparator<Vehiculo>() {
    @Override
    public int compare(Vehiculo o1, Vehiculo o2) {
      String tresLetraMatricula = o1.matricula.substring(4, o1.matricula.length());
      String tresLetraMatricula1 = o2.matricula.substring(4, o1.matricula.length());
      int cuatroNumeroMatricula = Integer.parseInt(o1.matricula.substring(0,4));
      int cuatroNumeroMatricula1 = Integer.parseInt(o2.matricula.substring(0,4));
      if(tresLetraMatricula.equals(tresLetraMatricula1)){
        if(cuatroNumeroMatricula>cuatroNumeroMatricula1){
          return 1;
        } else if (cuatroNumeroMatricula>cuatroNumeroMatricula1) {
          return -1;
        }
        return 0;
      }
      return tresLetraMatricula.compareTo(tresLetraMatricula1);
    }
  };

  public String getMatricula() {
    return matricula;
  }

  public String getMarca() {
    return marca;
  }

  public String getModelo() {
    return modelo;
  }

  public Integer getAnioFabricacion() {
    return anioFabricacion;
  }


  @Override
  public int compareTo(Vehiculo o) {
    if(anioFabricacion>o.anioFabricacion){
      return -1;
    }else if (anioFabricacion<o.anioFabricacion){
      return 1;
    }
    return 0;
  }
  @Override
  public String toString() {
    return tipo + ": " + marca + "/" + modelo + ", " + anioFabricacion + ", " + matricula;
  }

  //public String toCsvLine(String csvSeparator) { }
}
