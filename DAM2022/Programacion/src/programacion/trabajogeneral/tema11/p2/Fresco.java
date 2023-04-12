package trabajogeneral.tema11.p2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Fresco extends AbstractProducto {
    protected ArrayList<Fresco> productoFresco = new ArrayList<>();

    public Fresco() {
        super();
    }

    public Fresco(String nombreProducto, int numeroLote, LocalDate fechaCaducidad, LocalDate fechaEnvasada, String paisOrigen) {
        super(nombreProducto, numeroLote, fechaCaducidad, fechaEnvasada, paisOrigen);
        this.productoFresco = productoFresco;
    }

    @Override
    public String toString() {
        return "Fresco{" +
                "nombreProducto='" + nombreProducto + '\'' +
                ", numeroLote=" + numeroLote +
                ", fechaCaducidad=" + fechaCaducidad +
                ", fechaEnvasada=" + fechaEnvasada +
                ", paisOrigen='" + paisOrigen + '\'' +
                ", arrayNumeroLote=" + arrayNumeroLote +
                '}';
    }
}
