package programacion.examen.ej2;

public class Mamifero extends Animal {
    private int numeroPatas;

    public Mamifero(String nombre, int edad, float peso, int numeroPatas) throws ParametroInvalidoException {
        super(nombre, edad, peso, TipoAnimal.MAMIFERO);
        if (numeroPatas < 0) {
            throw new ParametroInvalidoException(
                    "Excepcion capturada creando " + TipoAnimal.MAMIFERO + " : Numero de patas invalido:" + peso);
        }
        this.numeroPatas = numeroPatas;
    }

    @Override
    public String toString() {
        return super.toString() + numeroPatas + " patas";
    }
}