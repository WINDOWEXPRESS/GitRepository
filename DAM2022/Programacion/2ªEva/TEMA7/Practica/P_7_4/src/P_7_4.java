public class P_7_4 {
    public static void main(String[] args) {
        int[] array = new int[40];
        OperacionesVector vect = new OperacionesVector();
        vect.cargar(array);
        vect.visualizar(array);
        System.out.println("Maximo:"+vect.maximo(array));
        System.out.println("Minimo:"+vect.minimo(array));
        System.out.println("Media:"+vect.media(array));
        System.out.println("Mediana:"+vect.mediana(array));
        System.out.println("Suma:"+vect.suma(array));
        
        
    }
}