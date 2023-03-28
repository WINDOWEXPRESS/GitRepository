import java.util.Arrays;

public class Asignatura {
	//Atributos
	private static int nEstudiante = 0;
	private String nombre;
	private Estudiante[] estudiantes;
	private double[][] nota ;
	private double[] notaFinal ;
	
	public Asignatura(String nombre, int nEstudiantes) {
		this.nombre = nombre;
		this.estudiantes = new Estudiante[nEstudiantes];
		this.nota = new double[nEstudiantes][3];
		this.notaFinal = new double[nEstudiantes];
		
	}
	
	public static int getnEstudiante() {
		return nEstudiante;
	}

	public boolean isAniadirEstudiante() {
		if(nEstudiante>=estudiantes.length) {
			return false;
		}else
			return true;
	}
	public void aniadirEstudiante( int codigo,String nombre, String apellido) {
		Estudiante estudiante = new Estudiante(codigo,nombre,apellido);
		estudiantes[nEstudiante] = estudiante;
		nEstudiante++;
	}
	public void aniadirNota( int nAlumno,int eva,double nota) {
			this.nota[nAlumno][eva] = nota;
	}



	public static void menu() {
		System.out.println("==================================MENU=====================================");
		System.out.println("1)Imprimir los detalles de la asignatura,incluyendo los estudiantes registrados y sus notas.");
		System.out.println("2)Añadir estudiantes");
		System.out.println("3)Añadir nota estudiante");
		System.out.println("4)Salir");
	}
	public double calcularNotaFinal(int nEstudiante) {

		double notaFinal = 0;
		double peso1Eva = 20;
		double peso2Eva = 30;
		double peso3Eva = 50;
		for (int i = nEstudiante; i <= nEstudiante; i++) {
			notaFinal = 0;
			for (int j = 0; j < nota[i].length; j++) {
				if(j == 0){
					notaFinal +=nota[i][j]*peso1Eva/100;
				}
				if(j == 1){
					notaFinal +=nota[i][j]*peso2Eva/100;
				}
				if(j == 2){
					notaFinal +=nota[i][j]*peso3Eva/100;
				}
			}
		}
		return notaFinal;
	}
	public String toStringEstudiantes() {
		String cadena = "";
		for (int i = 0; i < estudiantes.length; i++) {
			if(!(estudiantes[i] == null))
			cadena += i+")"+estudiantes[i].toString()+"\n";
		}
		return cadena;
	}
	
	public String toStringNota() {
		String cadena = "" ;
		for (int i = 0; i < getnEstudiante(); i++) {
			for (int j = 0; j < nota[i].length; j++) {
				if(nota[i][j] == 0) {
					cadena += "* ";
				}else {
					cadena +=  nota[i][j] +" ";
				}
			}
			cadena +=  " ==> "+calcularNotaFinal(i)+" | "+Arrays.toString(estudiantes);
		}
		
		
		
		return cadena;
	}
		
	@Override
	public String toString() {
		String cadena ="Asignatura '" + nombre + "'. "+getnEstudiante()+" estudiantes registrados (máximo" + estudiantes.length + ")\n"
				+"1aEv 2aEv 3aEv \t FINAl | NIA\t(Nombre y apellidos)\n"
				+ toStringNota() ;
		return cadena;
	}
}
