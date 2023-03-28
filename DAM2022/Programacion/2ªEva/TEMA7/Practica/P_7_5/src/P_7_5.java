import java.util.Scanner;

import javax.swing.JOptionPane;

public class P_7_5 {

	public static void main(String[] args) {
		//Crear variables locales
		String[] asignaturas ;
		//Crear array para la instancia alumno1 para la clase Alumno
		String[] asignAlumno1={"Programación","Bases de Datos","Sistemas Operativos"};
		//Crear instancia de la clase Scanner;
		Scanner dato = new Scanner(System.in);
		//Instancia de la clase alumno 
		Alumno alumno1 = new Alumno("Elle","Lawliet",24,asignAlumno1 ) ;
		Alumno alumno2 = new Alumno("Pepito","Pérez");
		
		alumno2.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Introducir la edad de Pepito Pérez:")));
		System.out.println("Numero de modulo:");
		asignaturas = new String[dato.nextInt()];
		
		for (int i = 0; i < asignaturas.length; i++) {
			asignaturas[i] = JOptionPane.showInputDialog("Introducir las asignaturas de Pepito Pérez:");
		}
		alumno2.setAsignatura(asignaturas);
		
		//Visualizar datos de los alumnos
		alumno2.visualizarDatosAlumno();
		alumno1.visualizarDatosAlumno();
	}

}
