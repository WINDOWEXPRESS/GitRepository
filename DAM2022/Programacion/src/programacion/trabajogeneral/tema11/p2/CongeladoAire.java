package trabajogeneral.tema11.p2;

import java.time.LocalDate;

public final class CongeladoAire extends Congelado{
    public static final String[] AIRE_CONGELADO = {"Nitrogeno", "Oxigeno", "Dioxido de carbono", "Vapor de agua"};
 
    private float[] porcentajeCongeladoAire = new float[AIRE_CONGELADO.length];

    public CongeladoAire(String nombreProducto, int numeroLote, LocalDate fechaCaducidad, LocalDate fechaEnvasada,
                         String paisOrigen, float[] porcentajeAireCongelado) {
        super(nombreProducto, numeroLote, fechaCaducidad, fechaEnvasada, paisOrigen);
        this.porcentajeCongeladoAire = porcentajeAireCongelado;
    }
    

    public String listadoPorcentajeCongeladoAire() {
        String cadena="";
        for (int i = 0; i < porcentajeCongeladoAire.length; i++) {
            cadena+=AIRE_CONGELADO[i]+":"+porcentajeCongeladoAire[i]+",";
        }
        return cadena;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\n\t Porcentaje congelado aire=" + listadoPorcentajeCongeladoAire();
    }
}
