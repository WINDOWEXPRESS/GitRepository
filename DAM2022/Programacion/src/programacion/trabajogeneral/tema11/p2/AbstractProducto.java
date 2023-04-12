package trabajogeneral.tema11.p2;

import java.time.LocalDate;
import java.util.*;

public abstract class AbstractProducto {
    protected String nombreProducto;
    protected int numeroLote;
    protected LocalDate fechaCaducidad;
    protected LocalDate fechaEnvasada;
    protected String paisOrigen;
    protected Set<Integer> arrayNumeroLote = new HashSet<>();
    public AbstractProducto() {}
    public AbstractProducto(String nombreProducto, int numeroLote, LocalDate fechaCaducidad, LocalDate fechaEnvasada, String paisOrigen) {
        this.nombreProducto = nombreProducto;
        this.numeroLote = numeroLote;
        this.fechaCaducidad = fechaCaducidad;
        this.fechaEnvasada = fechaEnvasada;
        this.paisOrigen = paisOrigen;
    }

    @Override
    public String toString() {
        return "AbstractProducto{" +
                "fechaCaducidad=" + fechaCaducidad +
                ", numeroLote=" + numeroLote +
                ", fechaEnvasada=" + fechaEnvasada +
                ", paisOrigen='" + paisOrigen + '\'' +
                '}';
    }

    public boolean addNumeroLote(int numeroLote) {
        return arrayNumeroLote.add(numeroLote);
    }
    public void showNum() {
        Iterator<Integer> ite = arrayNumeroLote.iterator();
        while (ite.hasNext()){
            System.out.println(ite.next());
        }
    }


}
