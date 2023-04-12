package trabajogeneral.tema11.p2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Congelado extends AbstractProducto {
    private int temperaturaRecomendada;
    protected ArrayList<Congelado> productoCongelado = new ArrayList<>();


    public Congelado(String nombreProducto, int numeroLote, LocalDate fechaCaducidad, LocalDate fechaEnvasada, String paisOrigen) {
        super(nombreProducto, numeroLote, fechaCaducidad, fechaEnvasada, paisOrigen);
    }
}
