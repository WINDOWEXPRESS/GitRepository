package negocios.empresaprogramador;

public enum TipoEmpleado {
    GERENTE("gerente.csv"), PROGRAMADOR("programadores.csv");
    public final String guardarEnFichero;
    TipoEmpleado(String guardarEnFichero){
        this.guardarEnFichero = guardarEnFichero;
    }
}
