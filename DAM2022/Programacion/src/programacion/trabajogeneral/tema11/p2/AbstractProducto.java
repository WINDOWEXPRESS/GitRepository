package trabajogeneral.tema11.p2;

import java.time.LocalDate;

public abstract class AbstractProducto {
    //Variables 
    protected String nombreProducto;
    protected int numeroLote;
    protected LocalDate fechaCaducidad;
    protected LocalDate fechaEnvasada;
    protected String paisOrigen;
    //Constructor vacio
    protected AbstractProducto() {}
    
    protected AbstractProducto(String nombreProducto, int numeroLote, LocalDate fechaCaducidad, LocalDate fechaEnvasada, String paisOrigen) {
        this.nombreProducto = nombreProducto;
        this.numeroLote = numeroLote;
        this.fechaCaducidad = fechaCaducidad;
        this.fechaEnvasada = fechaEnvasada;
        this.paisOrigen = paisOrigen;
    }

    abstract String getFILENAME();

    abstract String getFILEHEADER();
    public String toCSVLine(){
        return nombreProducto + ',' +
                numeroLote +
                "," + fechaCaducidad +
                ',' + fechaEnvasada +
                ',' + paisOrigen + '\n';
    }


    @Override
    public String toString() {
        return  "Producto='" + nombreProducto + '\'' +
                ", numero lote=" + numeroLote +
                ", fecha caducidad=" + fechaCaducidad +
                ", fecha envasada=" + fechaEnvasada +
                ", pais origen='" + paisOrigen + '\'';
    }
}
