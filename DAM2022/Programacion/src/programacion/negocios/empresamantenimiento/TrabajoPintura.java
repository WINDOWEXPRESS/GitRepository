package negocios.empresamantenimiento;

import java.time.LocalDate;

public class TrabajoPintura extends Servicio {
    private double superficie;//– Es la superficie a pintar (metros cuadrados)
    private double precioPintura;

    public TrabajoPintura(String trabajador, LocalDate fechaInicio, String cliente,double superficie,double precioPintura) {
        super(trabajador, fechaInicio, cliente);
        this.superficie = superficie;
        this.precioPintura = precioPintura;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public double getPrecioPintura() {
        return precioPintura;
    }

    public void setPrecioPintura(double precioPintura) {
        this.precioPintura = precioPintura;
    }

    @Override
    public double costeMaterial() {
        return (superficie/7.8) * precioPintura;
    }

    @Override
    public double costeManoObra() {
        return (superficie / 10) * 9.5;
    }

    @Override
    public double costeTotal() {
        return costeMaterial() + costeManoObra() + costeAdicional();
    }
    private double costeAdicional() {
        if(superficie<50) {
            return (costeMaterial()+costeManoObra()) * 0.15;
        } else {
            return 0;
        }
    }

    @Override
    public String detalleServicio() {
        String cadena = "";

        cadena += "TRABAJO DE PINTURA\n";
        cadena += "Cliente: "+cliente+"\n";
        cadena += "Fecha de Inicio: "+fechaInicio+"\n";
        cadena += "------------------\n";
        cadena += "Pintor: "+trabajador+"\n";
        cadena += "Coste Material: "+String.format("%.2f",costeMaterial())+"e\n";
        cadena += "Coste Mano Obra: "+String.format("%.2f",costeManoObra())+"e\n";
        cadena += "Coste Adicional: "+String.format("%.2f",costeAdicional())+"e\n";
        cadena += "TOTAL: "+String.format("%.2f",costeTotal())+"\n";
        cadena += "------------------\n";
        return cadena;
    }



}
