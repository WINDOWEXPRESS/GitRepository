package trabajogeneral.tema11.p2;

import java.time.LocalDate;

public class Congelado extends AbstractProducto {
    //FAlTA CAPTURAR temperaturaRecomendada
    protected int temperaturaRecomendada;
 
    public Congelado(String nombreProducto, int numeroLote, LocalDate fechaCaducidad, LocalDate fechaEnvasada, String paisOrigen) {
        super(nombreProducto, numeroLote, fechaCaducidad, fechaEnvasada, paisOrigen);
    }

    @Override
    String getFILENAME() {
        return null;
    }

    @Override
    String getFILEHEADER() {
        return null;
    }

    @Override
    public String toString() {
        return super.toString()+
                ", temperatura recomendada=" + temperaturaRecomendada;
    }
}
