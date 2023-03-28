import java.util.Date;
import java.util.GregorianCalendar;

public class Fecha {

	public static void main(String[] args) {
		
		//CLASE DATE
		
		  System.out.println("EJEMPLOS CON LA CLASE Date"); Date f1 = new Date();
		  System.out.
		  println("Fecha instanciada con el constructor por defecto Date(): "+f1);
		  System.out.println("La fecha inicial se toma en el 1/1/1900\n"); Date f2 =
		  new Date(82,4,1); System.out.
		  println("Fecha instanciada con el constructor Date(año,mes,dia) en el ejemplo Date(82,4,1): "
		  +f2); System.out.
		  println("El año en el constructor debe ser contado a partir de 1900");
		  System.out.
		  println("Los meses se numeran desde el 0 correspondiente a enero\n");
		  
		  System.out.println("Fecha 1 Local(método toLocaleString()): "+f1.
		  toLocaleString());
		  System.out.println("Fecha 1 en GMT (método toGMTSTring): "+f1.toGMTString());
		  System.out.println("Fecha 1 (método toSTring): "+f1.toString()+"\n");
		  
		  System.out.println("Fecha 1:"+f1.toLocaleString());
		  System.out.println("Fecha 2:"+f2.toLocaleString()); System.out.
		  println("¿Es la fecha 1 posterior a la fecha 2? (método after(objeto Date): "
		  +f1.after(f2));
		 

			   
		//CLASE GregorianCalendar()
			String meses[] = { "Ene", "Feb", "Mar", "Abr", "May", "Jun", "Jul", "Ago", "Sep", "Oct", "Nov", "Dic" };
		    System.out.println("\n\n");
		    System.out.println("CLASE GregorianCalendar");
		    System.out.println("=======================\n");
		    GregorianCalendar fgc1 = new GregorianCalendar();
		    System.out.println("Fecha instanciada con el constructor por defecto de GregorianCalendar() : "+fgc1.get(GregorianCalendar.DATE)+"/"+meses[fgc1.get(GregorianCalendar.MONTH)]+"/"+fgc1.get(GregorianCalendar.YEAR));
		    GregorianCalendar fgc2 = new GregorianCalendar(2021,2,1);
		    System.out.println("Fecha instanciada con el constructor GregorianCalendar(año,mes,dia), en el ejemplo Date(2021,2,1): "+fgc2.get(GregorianCalendar.DATE)+"/"+meses[fgc2.get(GregorianCalendar.MONTH)]+"/"+fgc2.get(GregorianCalendar.YEAR));
		   
			System.out.println();
		
			
			System.out.println(fgc1.getTime());
			System.out.println("ERA              : "+fgc1.get(GregorianCalendar.ERA));
			System.out.println("DIA DE LA SEMANA : "+fgc1.get(GregorianCalendar.DAY_OF_WEEK));
			System.out.println("DIA DEL MES      : "+fgc1.get(GregorianCalendar.DAY_OF_MONTH));
			System.out.println("MES              : "+fgc1.get(GregorianCalendar.MONTH));
			System.out.println("AÑO              : "+fgc1.get(GregorianCalendar.YEAR));
			System.out.println("DIA DEL MES      : "+fgc1.get(GregorianCalendar.DATE));
			System.out.println("Hora             : "+fgc1.get(GregorianCalendar.HOUR_OF_DAY));
			System.out.println("DIA DEL AÑO             : "+fgc1.get(GregorianCalendar.DAY_OF_YEAR));
			System.out.println();
			
			System.out.println("Tiempo en milisegundos de la fecha 1, (método getTimeInMillis()):"+fgc1.getTimeInMillis());
			System.out.println("Tiempo en milisegundos de la fecha 2, (método getTimeInMillis()):"+fgc2.getTimeInMillis());
			
			//DIAS TRANSCURRIDOS ENTRE FECHAS
			long diasTranscurridos= (long)((fgc1.getTimeInMillis()-fgc2.getTimeInMillis())/(24*60*60*1000));
			System.out.println("Dias transcurridos entre la fecha 1 y 2 :"+diasTranscurridos);
			
	           
	        //Comprobar si el año es bisiesto
	        //int anyo=fgc1.get(GregorianCalendar.YEAR);
	        System.out.println("\n\nAÑO BISIESTO");
	        if (fgc1.isLeapYear(fgc1.get(GregorianCalendar.YEAR))) 
	        	System.out.println("El año de la fecha 1 es bisiesto"); 
	        else 
	        	System.out.println("El año de la fecha 1 no es bisiesto"); 
			
			//Sumar y restar días a una fecha
	        System.out.println("\n\n SUMAR Y RESTAR VALORES A FECHAS ");
	        fgc1.add(GregorianCalendar.DATE, 30);
	        System.out.println("Sumar 30 días a la fecha 1(9 de marzo de 2021): "+fgc1.getTime());
	        fgc1.add(GregorianCalendar.MONTH, 2);
	        System.out.println("Sumar 2 MESES a la fecha anterior: "+fgc1.getTime());
	        fgc1.roll(GregorianCalendar.YEAR, -1);
	        System.out.println("Restar 1 año a la fecha anterior)"+fgc1.getTime());
	}

}
