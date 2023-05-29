package programacion.examenordinario;

import java.time.LocalDateTime;

public class Alquiler {
  private Cliente cliente;
  private Vehiculo vehiculo;
  private LocalDateTime inicio;
  private LocalDateTime fin;

  public Alquiler(Cliente cliente, Vehiculo vehiculo, LocalDateTime inicio) {
    this.cliente = cliente;
    this.vehiculo = vehiculo;
    this.inicio = inicio;
    fin = null;
  }

  public LocalDateTime getFin() {
    return fin;
  }

  public void finalizarAlquiler(LocalDateTime fin){
    this.fin = fin;
  }

  public LocalDateTime getInicio() {
    return inicio;
  }

  public Vehiculo getVehiculo() {
    return vehiculo;
  }

  public Cliente getCliente() {
    return cliente;
  }

  @Override
  public String toString() {
    return cliente.toString() +" | "+vehiculo.toString() +" | "+inicio +" -> " +(fin== null?" *":fin);
  }
}
