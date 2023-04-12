package trabajogeneral.tema11.p2;

import java.time.LocalDate;
import java.util.Date;

public class CongeladoAgua extends Congelado{
    //En gramo de sal por litro de agua
    private int salinidadAgua;

    public CongeladoAgua(String nombreProducto, int numeroLote, LocalDate fechaCaducidad, LocalDate fechaEnvasada, String paisOrigen) {
        super(nombreProducto, numeroLote, fechaCaducidad, fechaEnvasada, paisOrigen);
    }


    public void setSalinidadAgua(int salinidadAgua) {
        this.salinidadAgua = salinidadAgua;
    }

    @Override
    public String toString() {
        return "CongeladoAgua{" +
                "salinidadAgua=" + salinidadAgua +
                ", fechaCaducidad=" + fechaCaducidad +
                ", numeroLote=" + numeroLote +
                ", fechaEnvasada=" + fechaEnvasada +
                ", paisOrigen='" + paisOrigen + '\'' +
                '}';
    }


}
