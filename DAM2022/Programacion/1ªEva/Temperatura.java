import java.util.Scanner;
import java.io.IOException;
public class Temperatura{
	public static void main(String[] args)throws IOException{
		//Declarar variables
		String nombreResponsable;
		short temperaturaDiurna;
		int temperaturaDiurnaTotal = 0;
		float temperaturaDiurnaMedia = 0f;
		short temperaturaNocturna = 0;
		int temperaturaNocturnaTotal = 0;
		int temperaturaNocturnaMasBaja = 0;
		int temperaturaNocturnaMasBajaMes = 0;
		float temperaturaNocturnaMedia = 0f;
		int dia = 1;
		char seguir = 'S';
		//Crear obj de la clase Scanner
		Scanner datoNumerico = new Scanner(System.in);
		Scanner datoLetra = new Scanner(System.in);
		
		//Capturar datos
		
		while(dia<31 && (seguir=='s' || seguir == 'S')){
			System.out.print("Introducir el nombre del responsable del dia "+dia+": ");
			nombreResponsable = datoLetra.nextLine();
			for(int i = 1 ; i<=4 ;i++){		//bucle para capturar 4 veces temperatura diurna
				do{
					System.out.print("Introducir "+i+"º temperatura diurna:");
					temperaturaDiurna = datoNumerico.nextShort();
					if(temperaturaDiurna>0 || temperaturaDiurna <-20){
						System.out.println("Temperatura superior a 0º o inferior a -20º por favor vuelve a introducir.");
					}
				}while(temperaturaDiurna>0 || temperaturaDiurna <-20);
				temperaturaDiurnaTotal += temperaturaDiurna;
			}
				temperaturaDiurnaMedia = temperaturaDiurnaTotal/4;
	
			for(int j = 1 ; j<=4 ;j++){		//bucle para capturar 4 veces temperatura nocturna
				do{
					System.out.print("Introducir "+j+"º temperatura nocturna:");
					temperaturaNocturna = datoNumerico.nextShort();
					if(temperaturaNocturna>0 || temperaturaNocturna <-20){
						System.out.println("Temperatura superior a 0º o inferior a -20º por favor vuelve a introducir.");
					}
				}while(temperaturaNocturna>0 || temperaturaNocturna <-20);
				//Sacar temperatura mas baja
				if(temperaturaNocturna<=temperaturaNocturnaMasBaja){
					temperaturaNocturnaMasBaja = temperaturaNocturna;
				}
				//Sacar temperatura mas baja de mes
				if(temperaturaNocturnaMasBajaMes>=temperaturaNocturnaMasBaja){
					temperaturaNocturnaMasBajaMes = temperaturaNocturnaMasBaja;
				}
				temperaturaNocturnaTotal += temperaturaNocturna;
			}
				temperaturaNocturnaMedia = temperaturaNocturnaTotal /4;
				//visualizar datos
				System.out.println("La temperatura media diurna es :"+temperaturaDiurnaMedia);
				System.out.println("La temperatura media nocturna es :"+temperaturaNocturnaMedia);
				System.out.println("La temperatura nocturna mas baja es :"+temperaturaNocturnaMasBaja);
				System.out.println("El responsable :"+nombreResponsable);
				dia++;
				System.out.print("Deseas continuar? S/n: ");
				seguir = (char)System.in.read();
				datoLetra.nextLine();
		}
			System.out.println("La temperatura nocturna mas baja del mes es :"+temperaturaNocturnaMasBajaMes);
	}
}