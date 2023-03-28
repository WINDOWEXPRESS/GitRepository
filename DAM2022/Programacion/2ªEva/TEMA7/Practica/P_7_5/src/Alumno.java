
public class Alumno {
	private String nombre;
	private String apellidos;
	private int edad;
	private String[] asignatura;
	//Setter
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public void setAsignatura(String[] asignatura) {
		this.asignatura = asignatura;
	}
	public Alumno() {
		
	}
	public Alumno(String nombre, String apellidos) {
		this.nombre = nombre;
		this.apellidos = apellidos;
	}
	public Alumno(String nombre, String apellidos,  int edad,String[] asignatura) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.asignatura = asignatura;
		this.edad = edad;
	}
	public void visualizarAsignatura() {
		for (String string : asignatura) {
			System.out.println("* "+string);
		}
	}
	public void visualizarDatosAlumno() {
		System.out.printf("NOMBRE: %s\nAPELLIDO: %s\nEDAD: %d\nMÓDULOS:\n",nombre,apellidos,edad);
		visualizarAsignatura();
		System.out.println();
	}
}
