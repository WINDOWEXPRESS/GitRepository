package negocios.empresaprogramador;

public class Programador extends AbstractEmpleado {
    private String lenguaje;
    private boolean plusIdioma;

    public Programador(String nombre, double sueldo, String lenguaje, boolean plusIdioma) {
        super(nombre, sueldo);
        this.lenguaje = lenguaje;
        this.plusIdioma = plusIdioma;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public boolean isPlusIdioma() {
        return plusIdioma;
    }

    @Override
    public String toString() {
        return super.toString()+ "," + lenguaje + "," + plusIdioma;
    }

}
