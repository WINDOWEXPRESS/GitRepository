package negocios.empresaelectrodomestico;

public class Lavadora extends ElectroDomestico {
    private double precio;
    //agua caliente (true) o fría (false)
    private boolean aguaCaliente;

    public Lavadora(String marca, double potencia) {
        super("Lavadora", marca, potencia);
        precio = 0;
        aguaCaliente = false;

    }
    public Lavadora(double precio, String marca, double potencia,boolean aguaCaliente) {
        super("Lavadora", marca, potencia);
        this.precio = precio;
        this.aguaCaliente = aguaCaliente;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isAguaCaliente() {
        return aguaCaliente;
    }

    public void setAguaCaliente(boolean aguaCaliente) {
        this.aguaCaliente = aguaCaliente;
    }

    @Override
    public double getConsumo(int horas) {
        if (aguaCaliente) {
            return  (getPotencia() + getPotencia()*0.20) * horas;
        } else {
            return getPotencia() * horas;
        }
    }

    @Override
    public String toString() {

        return "Lavadora{" + super.toString() +", "+
                "precio=" + precio +
                ", aguaCaliente=" + aguaCaliente +
                '}';
    }
}
