package negocios.parking;

public class ParkingException extends Exception{
    private final String mensaje;
    private final String matricula;
    ParkingException(String mensaje,String matricula) {
        this.mensaje = mensaje;
        this.matricula = matricula;
    }

    public String getMensaje() {
        return mensaje;
    }

    public String getMatricula() {
        return matricula;
    }



}
