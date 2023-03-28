public class MainFibonacci {
    static int count = 0 ;
    public static void main(String[] args) {
        if(args.length>0){
            int n = Integer.parseInt(args[0]);
            System.out.println(fibonacci(n));
        }
    }
    static int fibonacci (int n){
        /* PARA SABER EL PROCESO Y  REPEETICION DE RECURSIVA  Y DE MOMENTO NO SE ME OCURRE NADA PARA OPTIMIZAR
        count++;
        System.out.println("count = "+count +" n = "+n);
        */
        if (n == 0 ) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
