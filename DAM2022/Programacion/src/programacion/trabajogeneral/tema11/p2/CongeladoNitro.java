package trabajogeneral.tema11.p2;

import java.time.LocalDate;
import java.util.Date;

public class CongeladoNitro extends Congelado {
    private String metodoCongelacion;
    //En segundo
    private int tiempoExposicionAlNitro;

    public CongeladoNitro(String nombreProducto, int numeroLote, LocalDate fechaCaducidad, LocalDate fechaEnvasada, String paisOrigen, String metodoCongelacion, int tiempoExposicionAlNitro) {
        super(nombreProducto, numeroLote, fechaCaducidad, fechaEnvasada, paisOrigen);
        this.metodoCongelacion = metodoCongelacion;
        this.tiempoExposicionAlNitro = tiempoExposicionAlNitro;
    }
}
