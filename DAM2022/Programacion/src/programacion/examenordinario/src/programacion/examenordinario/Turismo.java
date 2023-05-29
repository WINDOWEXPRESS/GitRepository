package programacion.examenordinario;

public class Turismo extends Vehiculo{
    private int numeroPuertas;

    public Turismo(String marca, String modelo, Integer anioFabricacion, String matricula, int numeroPuertas) throws ParametroInvalidoException {
        super(marca, modelo, anioFabricacion, matricula, TipoVehiculo.TURISMO);
        if(numeroPuertas<1){
            throw new ParametroInvalidoException("Turismo: argumento numero de \n" +
                    "puertas inválido, debe ser mayor o igual que 1");
        }
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    @Override
    public String toString() {
        return super.toString() +", " + numeroPuertas +" puertas";
    }
}
