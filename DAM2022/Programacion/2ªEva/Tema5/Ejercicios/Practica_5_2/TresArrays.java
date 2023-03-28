public class TresArrays {
    static int[] numero = new int[20];
    static int[] cuadrado = new int[20];
    static int[] cubo = new int[20];
    public static void main(String[] args) {
        generarNumeros();
        visualizarTable(numero);
        visualizarTable(cuadrado);
        visualizarTable(cubo);
    }
    static void generarNumeros(){
        for (int i = 0; i < numero.length; i++) {
            numero[i]= (int) (Math.random()*101);
            cuadrado[i] = (int) Math.pow(numero[i],2);
            cubo[i] = (int) Math.pow(numero[i],3);
        }
    }
    static void visualizarTable(int[] arrays){
        int count = 0;
        for (int x:arrays) {
            System.out.printf("%9d ",x);
            count++;
            if(count%5==0){
                System.out.println();
            }
        }
        System.out.println();
    }
}
