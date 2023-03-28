import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Crear variables locales
        int dia;
        int mes;
        int annio;

        //crear instancia de la clase Scanner;
        Scanner dato = new Scanner(System.in);

        Fecha miFechaNacimiento = new Fecha(2000, 01, 22);
        do {
            System.out.println("Introducir dia de la referencia:");
            dia = dato.nextInt();
        } while (dia < 1 || dia > 30);
        do {
            System.out.println("Introducir mes de la referencia:");
            mes = dato.nextInt();

        } while (mes < 1 || mes > 12);
        System.out.println("Introducir año de la referencia:");
        annio = dato.nextInt();
        Fecha fechaReferencia = new Fecha(annio, mes, dia);
        System.out.println("Bisiesto? miFechaNacimiento :"+miFechaNacimiento.siBisiesto());
        System.out.println("Bisiesto? fechaReferencia :"+fechaReferencia.siBisiesto());
        System.out.println("Devuelva el tiempo transcurrido entre dos fechas:"+miFechaNacimiento.diaEntreDosFechas(fechaReferencia));
        System.out.println("Formato DD/MM/AAAA : "+miFechaNacimiento.formatoFecha());
    }
}