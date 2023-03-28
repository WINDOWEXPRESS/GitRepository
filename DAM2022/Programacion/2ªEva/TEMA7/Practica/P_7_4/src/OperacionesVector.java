import java.util.Arrays;

public class OperacionesVector {
    public void cargar(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 101);
        }
    }

    public void visualizar(int[] array) {
        System.out.println("Visualizar tabla:");
        int ctn = 0;
        for (int x : array) {
            System.out.printf("%3d ",x );
            ctn++;
            if (ctn == 5) {
                System.out.println();
                ctn = 0;
            }
        }
    }

    public int maximo(int[] array) {
        Arrays.sort(array);
        return array[array.length - 1];
    }

    public int minimo(int[] array) {
        Arrays.sort(array);
        return array[0];
    }

    public float media(int[] array) {
        float media = 0f;
        for (int x : array) {
            media += x;
        }
        return media = media / array.length;
    }
    public float mediana(int[] array) {
        float mediana = 0f;
        Arrays.sort(array);
        if (array.length%2 == 0){
            mediana = (array[array.length/2]+array[array.length/2+1])/2;
        }else{
            mediana = array[array.length/2+1];
        }
        return mediana;
    }
    public int suma(int[] array) {
    	int sumaTotal = 0;
    	 for (int x : array) {
    		 sumaTotal += x;
         }
         return sumaTotal;
    	
    }
    
}
