import java.util.Scanner;

class P_3_4_2{
	public static void main(String[] args){
		//Declarar variables
		final float PI = 3.14f;   //Math.PI
		float radio = 0;
		float longitud ;
		float area ;
		float volumen ;
		String terminarPrograma = "S";
		//Crear objeto de la clase Scanner
		Scanner dato = new Scanner(System.in);
		
		do{
			//Captura datos
			System.out.println("Calcular la longitud de una circunferencia, el área de un círculo "+
			"y volumen de una esfera, a partir del radio que se introducirá por teclado.");
			System.out.print("Radio:");
			radio= dato.nextFloat();
			
			//Calculo
			longitud = 2 * PI * radio;
			area = 4 * PI * (float)Math.pow(radio,2);
			volumen = (4 *PI * (float)Math.pow(radio,3))/3;
			
			//Salida
			System.out.println("La longitud de la circunferencia de radio " + radio +" es " +longitud);
			System.out.println("La are de la circunferencia de radio " + radio +" es " +area);
			System.out.println("La volumen de la circunferencia de radio " + radio +" es " +volumen);
			//Pregunta al usuario si quiere continuar con otro caso (S/N).
			do{
				System.out.println("Quieres continuar con otro caso : (S/N)");
				terminarPrograma=dato.next();
				System.out.println(!terminarPrograma.equalsIgnoreCase("S") +"-"+ !terminarPrograma.equalsIgnoreCase("N"));
			}while(!terminarPrograma.equalsIgnoreCase("S") && !terminarPrograma.equalsIgnoreCase("N"));
			
		}while(terminarPrograma.equalsIgnoreCase("S"));
	}
}

//System.out.println("");