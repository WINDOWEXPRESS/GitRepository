import java.util.Arrays;

public class Alumno {
    private String nombre;
    private String apellidos;
    private String fecha;
    private String[] vector = new String[5];

    public Alumno(String nombre, String apellidos, String fecha, String[] vector) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fecha = fecha;
        this.vector = vector;
    }

    public Alumno(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public Alumno() {
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", fecha=" + fecha +
                ", vector=" + Arrays.toString(vector) +
                '}';
    }
}
