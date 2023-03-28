
public class Estudiante {
	private String nombre;
	private String apellidos;
	private int nia;
	public Estudiante(int nia,String nombre, String apellidos) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nia = nia;
	}
	
	@Override
	public String toString() {
		return String.format("%6d (%s %s)",nia,nombre,apellidos);
	}
}
