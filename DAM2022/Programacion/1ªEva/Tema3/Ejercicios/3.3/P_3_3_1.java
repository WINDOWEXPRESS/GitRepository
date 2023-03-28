import java.io.IOException;
public class P_3_3_1{
	public static void main (String []Args)throws IOException{
		//Declarar los variables 
		int valorNumerico ;
		//Entrada 
		System.out.println("Capturamos un carácter y debemos indicar si está en mayúscula, en minúscula, es un dígito ocualquier otro carácter.");
		valorNumerico = (char)System.in.read();
		
		//Condiciones 
		if(valorNumerico >= 48 && valorNumerico <= 57){
			System.out.println("El caracter "+(char)valorNumerico+" introducido es un numero.");
		}else if(valorNumerico >= 65 && valorNumerico <= 90){
			System.out.println("El caracter "+(char)valorNumerico+" introducido es una letra mayuscula.");
			}else if(valorNumerico >= 97 && valorNumerico <= 122){
				System.out.println("El caracter "+(char)valorNumerico+" introducido es una letra minuscula.");
				}else{
					System.out.println("El caracter "+(char)valorNumerico+" introducido es un caracter raro.");
				};
	}
}

//System.out.println();