package negocios.empresaprogramador;

import java.util.Comparator;


public abstract class AbstractEmpleado implements Comparable<AbstractEmpleado> {
    protected String dni;
    protected String nombre;
    protected double sueldo;
    protected TipoEmpleado tipoEmpleado;


    protected AbstractEmpleado(String dni, String nombre, double sueldo,TipoEmpleado tipoEmpleado) throws ParametroInvalidoException {
        final String REGEX_DNI = "[0-9]{1,8}[a-zA-Z]";
        if (dni.toUpperCase().matches(REGEX_DNI)&& checkValidezDNI(dni) ) {
            this.dni = dni.toUpperCase();
        } else {
            throw new ParametroInvalidoException("DNI no válido: El DNI '" + dni
                    + (!dni.matches(REGEX_DNI) ? "' no cumple el patrón de 8 números y una letra mayúscula al final.\n" :
                    checkValidezDNI(dni) ? "' no cumple el patrón de 8 números y una letra mayúscula al final.\n" :
                            "' no tiene una letra válida.\n"));
        }
        if(nombre.isEmpty()){
            throw new ParametroInvalidoException("Nombre no válido.");
        }
        this.nombre = nombre;
        if(sueldo<=0){
            throw new ParametroInvalidoException("Sueldo no válido: sueldo no puede ser negativo.\n");
        }
        this.sueldo = sueldo;
        this.tipoEmpleado = tipoEmpleado;
    }

    public int compareTo(AbstractEmpleado o1) {
        return dni.compareTo(o1.dni);
    }
    //Comparator usando expresion lambda
    public static final Comparator<AbstractEmpleado> ORDENAR_POR_SUELDO = (o1, o2) -> Double.compare(o2.sueldo, o1.sueldo);

    public TipoEmpleado getTipoEmpleado() {
        return tipoEmpleado;
    }

    private boolean checkValidezDNI(String dni){
        final String LETRAS_DNI = "TRWAGMYFPDXBNJZSQVHLCKE";
        final int DIVISOR_MODULO_DNI = 23;
        int numero = Integer.parseInt(dni.substring(0,dni.length()-1));
        char letra = dni.toUpperCase().charAt(dni.length()-1);
        return letra == LETRAS_DNI.charAt(numero%DIVISOR_MODULO_DNI);
    }

    @Override
    public String toString() {
        return dni + "," + nombre + "," + sueldo;
    }

}
