package negocios.empresaprogramador;

public class Gerente extends AbstractEmpleado {
    private String departamento;

    public Gerente(String nombre, double sueldo, String departamento) {
        super(nombre, sueldo);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    @Override
    public String toString() {
        return super.toString() + ","+departamento;
    }

}
