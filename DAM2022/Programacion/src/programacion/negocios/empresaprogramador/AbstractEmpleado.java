package negocios.empresaprogramador;

import java.util.Comparator;

public abstract class AbstractEmpleado implements Comparable<AbstractEmpleado> {
    protected String nombre;
    protected double sueldo;

    public AbstractEmpleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public int compareTo(AbstractEmpleado o1) {
        return nombre.compareTo(o1.nombre);
    }

    public static final Comparator<AbstractEmpleado> ORDENAR_POR_SUELDO = (o1, o2) -> {
        if (o1.sueldo > o2.sueldo) {
            return -1;
        }
        if (o1.sueldo < o2.sueldo) {
            return 1;
        }
        return 0;
    };

    public String getNombre() {
        return nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    @Override
    public String toString() {
        return nombre + "," + sueldo;
    }

}
