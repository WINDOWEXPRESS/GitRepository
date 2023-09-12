package negocios.empresamantenimiento;

import java.time.LocalDate;

public class RevisionAlarma extends Servicio{
    private int numeroAlarmas;

    public RevisionAlarma(LocalDate fechaInicio, String cliente,int numeroAlarmas) {
        super( "Revisor Especialista Contraincendios", fechaInicio, cliente);
        this.numeroAlarmas = numeroAlarmas;
    }

    public int getNumeroAlarmas() {
        return numeroAlarmas;
    }

    public void setNumeroAlarmas(int numeroAlarmas) {
        this.numeroAlarmas = numeroAlarmas;
    }

    @Override
    public double costeMaterial() {
        return 0;
    }

    @Override
    public double costeManoObra() {
        return  (numeroAlarmas / 3) * 40;
    }

    @Override
    public double costeTotal() {
        return costeManoObra();
    }

    @Override
    public String detalleServicio() {
        String cadena = "";

        cadena += "REVISIÓN PERIÓDICA ALARMAS CONTRAINCENDIOS\n";
        cadena += "Cliente: "+cliente+"e\n";
        cadena += "Fecha: "+fechaInicio+"e\n";
        cadena += "----------------------\n";
        cadena += "TOTAL: "+String.format("%.2f",costeTotal())+"e\n";
        cadena += "----------------------\n";
        return  cadena;
    }
}
