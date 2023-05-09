package trabajogeneral.tema11.p2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Refrigerado extends AbstractProducto {
    private int codigoOrganismo;
    private float temperaturaRecomendada;

    public Refrigerado(String nombreProducto, int numeroLote, LocalDate fechaCaducidad, LocalDate fechaEnvasada,
                       String paisOrigen, int codigoOrganismo, float temperaturaRecomendada) {
        super(nombreProducto, numeroLote, fechaCaducidad, fechaEnvasada, paisOrigen);
        this.codigoOrganismo = codigoOrganismo;
        this.temperaturaRecomendada = temperaturaRecomendada;
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
        return "Refrigerado{" +super.toString()+
                "codigoOrganismo=" + codigoOrganismo +
                ", temperaturaRecomendada=" + temperaturaRecomendada +
                '}';
    }
}
