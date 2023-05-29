package programacion.examenordinario;

public class ParametroInvalidoException extends RuntimeException{
    ParametroInvalidoException(){};
    ParametroInvalidoException(String mensaje){
        super(mensaje);
    }
}
