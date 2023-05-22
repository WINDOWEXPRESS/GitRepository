package programacion.examen.ej2;

public class Ave extends Animal {
    private boolean puedeVolar;

    public Ave(String nombre, int edad, float peso, boolean puedeVolar) throws ParametroInvalidoException {
        super(nombre, edad, peso, TipoAnimal.AVE);
        this.puedeVolar = puedeVolar;
    }

    @Override
    public String toString() {
        return super.toString() + (puedeVolar ? "puede volar" : "no puede volar");
    }

}