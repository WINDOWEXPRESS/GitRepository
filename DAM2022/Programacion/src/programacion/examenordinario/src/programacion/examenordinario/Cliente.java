package programacion.examenordinario;

import java.util.Comparator;

public class Cliente implements Comparable<Cliente>{
  private String dni;
  private String nombre;
  private String apellidos;

  public Cliente(String dni, String nombre, String apellidos) {
      if(dni.isEmpty()){
          throw new ParametroInvalidoException(" Cliente: argumento dni vacío");
      }
    this.dni = dni;
      if(nombre.isEmpty()){
          throw new ParametroInvalidoException(" Cliente: argumento nombre vacío");
      }
    this.nombre = nombre;
      if(apellidos.isEmpty()){
          throw new ParametroInvalidoException(" Cliente: argumento apellidos vacío");
      }
    this.apellidos = apellidos;
  }
  public static final Comparator<Cliente> ORDEN_POR_DNI = new Comparator<Cliente>() {
      @Override
      public int compare(Cliente o1, Cliente o2) {
          return o1.dni.compareTo(o2.dni);
      }
  };

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }
    @Override
    public int compareTo(Cliente o) {
        if(apellidos.equals(o.apellidos)){
            return nombre.compareTo(o.getNombre());
        }
        return apellidos.compareTo(o.apellidos);
    }
    @Override
   public String toString() {
    return dni+" - "+apellidos+", "+nombre;
   }
}
