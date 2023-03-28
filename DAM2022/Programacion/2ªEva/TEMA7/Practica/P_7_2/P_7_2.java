import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class P_7_2 {
    public static void main(String[] args) throws IOException {
        //Declarar variables locales
        String[] listaDatos = {"Nombre", "Apellido","Dni","Direccion"};
        short opcion = 0;
        int dinero = 0;
        BufferedReader readerNumerico = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader readerLetra = new BufferedReader(new InputStreamReader(System.in));
        //instancias cliente1 de la clase CuentaCorriente con datos para constructor
        CuentaCorriente cliente1 = new CuentaCorriente("Zhouyi","Chen","X99999999","Tierra nª20 2b",123456789,50000);
        while (opcion!=5){
            CuentaCorriente.menu();//Menu
            opcion = Short.parseShort(readerNumerico.readLine()) ;
            System.out.println(opcion);
            switch (opcion){
                case 1:
                    System.out.println("Saldo disponible:"+cliente1.getSaldo());
                    System.out.println("Cantidad:");
                    dinero = Integer.parseInt(readerNumerico.readLine());
                    if (dinero<cliente1.getSaldo())
                        cliente1.sacarDinero(dinero);
                    else
                        System.out.println("Saldo insuficiente.");
                    System.out.println("Saldo disponible:"+cliente1.getSaldo());
                    break;
                case 2:
                    System.out.println("Saldo disponible:"+cliente1.getSaldo());
                    System.out.println("Cantidad:");
                    dinero = Integer.parseInt(readerNumerico.readLine());
                    cliente1.ingresarDinero(dinero);
                    System.out.println("Saldo disponible:"+cliente1.getSaldo());
                    break;
                case 3:
                    System.out.println("Saldo disponible:"+cliente1.getSaldo());
                    break;
                case 4:
                    System.out.println("Modificar dato.");
                    cliente1.mostrarDatos();
                    System.out.println("Opcion:");
                    opcion = Short.parseShort(readerNumerico.readLine()) ;
                    System.out.println("Nuevo "+listaDatos[opcion-1]+":");
                    String dato = readerLetra.readLine();
                    cliente1.modificarDatos(opcion,dato);
                    break;
                case 5:
                    System.out.println("Que tenga buen dia!");
            }
        }
    }
}
