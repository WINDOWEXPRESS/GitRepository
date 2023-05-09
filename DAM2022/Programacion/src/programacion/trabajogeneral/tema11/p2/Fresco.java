package trabajogeneral.tema11.p2;

import java.time.LocalDate;

public class Fresco extends AbstractProducto {
    final String FILENAME = "archivosCSV/productoFresco.csv";
    final String FILEHEADER = "Nombre , Numero De Lote , Fecha De Caducidad , Fecha De Envasado, Pais De Origen ";

    public Fresco() {
        super();
    }

    public String getFILENAME() {
        return FILENAME;
    }

    public String getFILEHEADER() {
        return FILEHEADER;
    }

    public Fresco(String nombreProducto, int numeroLote, LocalDate fechaCaducidad, LocalDate fechaEnvasada, String paisOrigen) {
        super(nombreProducto, numeroLote, fechaCaducidad, fechaEnvasada, paisOrigen);
    }

    public String toCSVLine() {
        return nombreProducto + ',' + numeroLote + "," + fechaCaducidad + ','
                + fechaEnvasada + ',' + paisOrigen + '\n';
    }
}
