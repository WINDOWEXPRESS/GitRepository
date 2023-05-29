package negocios.empresaprogramador;

public class Gerente extends AbstractEmpleado {
    private String departamento;

    public Gerente(String dni, String nombre, double sueldo, String departamento) throws ParametroInvalidoException {
        super(dni, nombre, sueldo,TipoEmpleado.GERENTE);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    @Override
    public String toString() {
        return super.toString() + "," + departamento;
    }

}
