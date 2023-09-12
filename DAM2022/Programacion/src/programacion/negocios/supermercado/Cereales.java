package negocios.supermercado;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Cereales implements EsAlimento {
    private String marca;
    private double precio;
    private String tipo;
    private LocalDate fechaCaducidad;
    private double calorias;

    public Cereales(String marca, double precio, String tipo) {
        this.marca = marca;
        this.precio = precio;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void setCaducidad(LocalDate fecha) {
        fechaCaducidad = fecha;
    }

    @Override
    public LocalDate getCaducidad() {
        return fechaCaducidad;
    }

    @Override
    public int getCalorias() {
        if(tipo.equalsIgnoreCase("espelta")) {
            return 5;
        } else if(tipo.equalsIgnoreCase("maíz")) {
            return 8;
        } else if(tipo.equalsIgnoreCase("trigo")) {
            return 12;
        } else {
            return 15;
        }
    }

    @Override
    public String toString() {
        return "Cereales{" + "marca=" + marca + ", tipoCereal=" + tipo + ", precio=" + precio +
                ", caducidad=" + fechaCaducidad.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) +
                ", calorías=" + getCalorias() + '}';
    }
}
