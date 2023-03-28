package Ejercicios;

public class P_5_1_6 {

	public static void main(String[] args) {
		//Crear variables
		float[] nota = new float[40];
		float media = 0f;
		int nAprobados = 0;
		int nSuspensos = 0;
		int nNotaSuperiorMedia = 0;
		//Generar datos aleatorios para nota
		for(int i = 0 ;i<nota.length;i++) {
			nota[i]=(float) (Math.random()*10);
			media += nota[i];
			//calcular numero de aprobados y no
			if(nota[i]>=5) {
				nAprobados++;
			}else {
				nSuspensos++;
			}
		}
		
		media = media/ 40;
		for(float x : nota) {
			if(x>media) {
				nNotaSuperiorMedia++;
			}
		}
		System.out.printf("Media: %.2f \n",media);
		System.out.println("Numeros aprobados:"+nAprobados);
		System.out.println("Numeros no aprobados: "+nSuspensos);
		System.out.println("Numeros  de calificaciones superiores a la media: "+nNotaSuperiorMedia);
	}
}
