import java.util.*;
import java.text.SimpleDateFormat;

public class UsoSimpleDateFormat {
	public static SimpleDateFormat sdf = new  SimpleDateFormat ("dd/mm/yyyy");
	public static SimpleDateFormat sf2 = new  SimpleDateFormat ("hh:mm:ss");
	public static SimpleDateFormat anno = new  SimpleDateFormat ("yyyy");
	public static SimpleDateFormat mes = new  SimpleDateFormat ("mm");
	public static SimpleDateFormat dia = new  SimpleDateFormat ("dd");	
	public static SimpleDateFormat hora = new  SimpleDateFormat ("hh");
	public static SimpleDateFormat minutos = new  SimpleDateFormat ("mm");
	public static SimpleDateFormat segundos = new  SimpleDateFormat ("ss");	

	public static void main (String args[]){
		
		
		Date fechaActual = new Date();
		System.out.println(Fecha(fechaActual));
		System.out.println(Hora(fechaActual));
		System.out.println("EL AÑO ES: "+anno.format(fechaActual));
		System.out.println("EL MES ES: "+mes.format(fechaActual));
		System.out.println("EL DIA ES: "+dia.format(fechaActual));
		System.out.println("LA HORA ES: "+hora.format(fechaActual)+" horas "+minutos.format(fechaActual)+" minutos "+segundos.format(fechaActual)+" segundos ");
		
	}
	
	public static String Fecha (Date fecha){
		return sdf.format(fecha);
		
	}
	
	public static String Hora (Date fecha){
		return sf2.format(fecha);
		
	}
}