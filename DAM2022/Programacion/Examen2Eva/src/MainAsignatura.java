import java.util.Scanner;

public class MainAsignatura {
	public static void main(String[] args) {
		//Variables locales
		int opc = 0;
		String nombreAsignatura;
		int nMaxEstudiantes;
		//Crear instancia de la clase Scanner
		Scanner dato = new Scanner(System.in);
		do {
			System.out.println("Introducir nombre de la asignatura");
			nombreAsignatura = dato.nextLine();
		} while (nombreAsignatura.isEmpty());
		do {
			System.out.println("Introducir numero maximo de estudiantes");
			nMaxEstudiantes = dato.nextInt();
		} while (nMaxEstudiantes<1);
		//Crear instancia de la clase Asignatura
		Asignatura asign = new Asignatura(nombreAsignatura, nMaxEstudiantes);
		while(opc!=4) {
			opc = 0;
			Asignatura.menu();
			while(opc<1 || opc >4) {
				System.out.print("Opción:");
				opc = dato.nextInt();
				if(opc<1 || opc >4) {
					System.out.println("Opción invalido.");
				}
			}
			switch (opc) {
			case 1:
				System.out.println(asign.toString());
				break;
			case 2:
				if(!asign.isAniadirEstudiante()) {
					System.out.println("Numero de estudiantes maximo.");
					break;
				}else {
					String nombreEstudiante;
					String apellidoEstudiante;
					int codigoEstudiante;
					//Aqui como examen no pide verificar si hay codigo igual no lo hago.
					do {
						System.out.println("Introducir codigo del estudiante:");
						dato.nextLine();
						codigoEstudiante = dato.nextInt();
					}while(codigoEstudiante<0 || codigoEstudiante>99999);
					do {
						System.out.println("Introducir nombre del estudiante:");
						dato.nextLine();
						nombreEstudiante = dato.nextLine();
					}while(nombreEstudiante.isEmpty());
					do {
						System.out.println("Introducir apellido del estudiante:");
						apellidoEstudiante = dato.nextLine();
					}while(apellidoEstudiante.isEmpty());
					
					asign.aniadirEstudiante(codigoEstudiante,nombreEstudiante,apellidoEstudiante);
					System.out.println(asign.toString());
					break;
				}
			case 3:
				int elegiEstudiante = -1;
				double notaAlumno = -1;
				int evaluacionTotal = 3;
				System.out.println("    NIA\t(Nombre y apellidos)\n");
				System.out.println(asign.toStringEstudiantes());
				
				while(elegiEstudiante<0 || elegiEstudiante>asign.getnEstudiante()-1) {
					System.out.print("Elegir estudiante:");
					elegiEstudiante = dato.nextInt();
				}
				for (int i = 0; i < evaluacionTotal; i++) {
					notaAlumno = -1;
					while (notaAlumno<0||notaAlumno>10) {
						System.out.println("Introducir nota de "+(i+1)+" evaluacion:");
						notaAlumno = dato.nextDouble();
					}
					asign.aniadirNota(elegiEstudiante, i, notaAlumno);
				}
				break;
				
			default:
				break;
			}
		}
	}
	
}
