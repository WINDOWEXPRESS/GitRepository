package programacion.examenordinario;

public class Motocicleta extends Vehiculo{
    private  int cilindrada;

    public Motocicleta(String marca, String modelo, Integer anioFabricacion, String matricula, int cilindrada) {
        super(marca, modelo, anioFabricacion, matricula, TipoVehiculo.MOTOCICLETA);
        if(cilindrada<50){
            throw new ParametroInvalidoException("Motocicleta: argumento cilindrada \n" +
                    "inválido, debe ser mayor o igual que 50");
        }
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    @Override
    public String toString() {
        return super.toString() +", " + cilindrada +" cc";
    }
}
