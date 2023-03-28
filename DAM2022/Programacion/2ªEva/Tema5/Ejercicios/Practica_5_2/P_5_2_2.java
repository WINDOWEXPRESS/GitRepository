import java.util.Scanner;

public class P_5_2_2 {
    static Scanner sc = new Scanner(System.in);
    public static final int AGUA = 50;
    public static final int REFRESCO = 75;
    public static final int ZUMO = 95;
    private static int cant_DosE = 20;
    public static int cant_UnoE = 20;
    public static int cant_CinqCent = 20;
    public static int cant_VeintCent = 20;
    public static int cant_DiezCent = 20;
    public static int cant_CincoCent = 20;
    public static int importe = 0;
    public static int cambio = 0;
    private static short opc = 0;

    public static void main(String[] args) {
        while (opc!=4){
            opc = 0;
            importe = 0;
            menu ();
            System.out.print("Opcion: ");
            while (opc<1 || opc>4){
                opc=sc.nextShort();
            }
            switch (opc) {
                case 1:
                    cambio = importeIntroducido(AGUA)-AGUA;
                    break;
                case 2:
                    cambio = importeIntroducido(REFRESCO)-REFRESCO;
                    break;
                case 3:
                    cambio = importeIntroducido(ZUMO)-ZUMO;
                    break;
                default:
                    System.out.println("Fin del programa.");
            }
            if (opc != 4) {
                if (cant_CincoCent == 0 || (cant_DiezCent == 0 && cant_VeintCent == 0)) {
                    System.out.println("INTRODUZCA IMPORTE EXACTO");
                } else {
                    monedaDevuelto(cambio);
                }
            }
        }
        visualizarCantidadMoneda();
    }

    public static void visualizarCantidadMoneda() {
        System.out.println("==============================================");
        System.out.println("Monedas total de 2 euro: "+cant_DosE);
        System.out.println("Monedas total de 1 euro: "+cant_UnoE);
        System.out.println("Monedas total de 50 centimos : "+cant_CinqCent);
        System.out.println("Monedas total de 20 centimos : "+cant_VeintCent);
        System.out.println("Monedas total de 10 centimos : "+cant_DiezCent);
        System.out.println("Monedas total de 5 centimos : "+cant_CincoCent);

    }
    private static void aumentarCantMonedaIntroducido(int valorMoneda) {
        if (valorMoneda == 200) {
            cant_DosE +=1;
        }else if (valorMoneda == 100) {
            cant_UnoE +=1;
        } else if (valorMoneda ==50) {
            cant_CinqCent +=1;
        } else if (valorMoneda ==20) {
            cant_VeintCent +=1;
        } else if (valorMoneda ==10) {
            cant_DiezCent +=1;
        } else if (valorMoneda ==5) {
            cant_CincoCent +=1;
        }

    }
    private static void monedaDevuelto(int cambio) {

        if (cambio >= 200 && cant_DosE!=0) {
            System.out.println("Monedas de 2 euros: " + cambio / 200);
            cambio %= 200;
        }
        if (cambio >= 100 && cant_UnoE!=0) {
            System.out.println("Monedas de 1 euro: " + cambio / 100);
            cambio %= 100;
            cant_UnoE-=1;
        }
        if (cambio >= 50 && cant_CinqCent!=0) {
            System.out.println("Monedas de 50 centimos: " + cambio / 50);
            cambio %= 50;
            cant_CinqCent-=1;
        }
        if (cambio >= 20 && cant_VeintCent!=0) {
            System.out.println("Monedas de 20 centimos " + cambio / 20);
            cambio %= 20;
            cant_VeintCent-=1;
        }
        if (cambio >= 10 && cant_DiezCent!=0) {
            System.out.println("Monedas de 10 centimos: " + cambio / 10);
            cambio %= 10;
            cant_DiezCent-=1;
        }
        if (cambio >= 5 && cant_CincoCent != 0) {
            System.out.println("Monedas de 5 centimos: " + cambio / 5);
            cambio %= 5;
            cant_CincoCent -= 1;
        }
    }

    private static int importeIntroducido(int bebida) {
        int valorMoneda = 1;
        //bucle para obtener importe introducido
        while (valorMoneda != 0 && valorMoneda <= bebida && importe<=bebida){
            //obtener importe
            valorMoneda = 1;
            System.out.println("Introducir el valor de cada moneda expresada en céntimos (0 para terminar).");
            System.out.println("Maquina no acepta de los 2 cts y 1 cts.");
            while (valorMoneda != 200 && valorMoneda != 100 && valorMoneda != 50 && valorMoneda != 20 && valorMoneda != 10 && valorMoneda != 5 && valorMoneda != 0){
                valorMoneda = sc.nextInt();
                if (valorMoneda != 200 && valorMoneda != 100 && valorMoneda != 50 && valorMoneda != 20 && valorMoneda != 10 && valorMoneda != 5 && valorMoneda != 0 ){
                    System.out.println("Valor introducido incorrecto por favor vuelve a introducirlo.");
                }
            }
            aumentarCantMonedaIntroducido(valorMoneda);
            importe += valorMoneda;
            System.out.println("Has introducido "+valorMoneda+" cts, total "+importe+",cambio "+(importe-bebida));
        }
        return importe;
    }

    public static void menu () {
        System.out.println("=======Máquina automática de venta de bebidas=======");
        System.out.printf("1.AGUA       -------------------     0.%d cts\n",AGUA);
        System.out.printf("2.REFRESCO   -------------------     0.%d cts\n",REFRESCO);
        System.out.printf("3.ZUMO       -------------------     0.%d cts\n",ZUMO);
        System.out.println("4.SALIR");
    }
}
