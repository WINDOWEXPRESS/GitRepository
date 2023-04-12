package trabajogeneral.tema11.p2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Refrigerado extends AbstractProducto {
    private int codigoOrganismo;
    private int temperaturaRecomendada;
    private ArrayList<Refrigerado> productoRefrigelado = new ArrayList<>();


    public Refrigerado(String nombreProducto, int numeroLote, LocalDate fechaCaducidad, LocalDate fechaEnvasada, String paisOrigen) {
        super(nombreProducto, numeroLote, fechaCaducidad, fechaEnvasada, paisOrigen);
    }
}
