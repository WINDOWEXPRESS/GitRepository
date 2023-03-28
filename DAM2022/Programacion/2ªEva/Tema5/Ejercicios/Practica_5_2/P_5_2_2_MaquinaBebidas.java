
import javax.swing.JOptionPane;
public class P_5_2_2_MaquinaBebidas {


	public static void main (String[]args){
		int opc=0,cambio,dineroIntroducido;
		boolean exacto;
		
		//Declaración e inicialización de Arrays
		int monedas[]={200,100,50,20,10,5};
		int cantidad[]={20,20,20,0,1,20};	
		String productos[]={"Agua","Refresco","Zumo"};
		int precio[]={50,75,95};
		
		//Calcular dinero inicial en la máquina
		int dineroInicial=0;
		for (int i = 0; i < monedas.length; i++) {
			dineroInicial+=monedas[i]*cantidad[i];
		}
		
		//Proceso de ventas hasta elegir opción 4:Salir
		while(opc!=4) {
			opc=menu(productos,precio);
			if (opc!=4) {
				exacto=importeExacto(monedas,cantidad);
				dineroIntroducido=realizarPago(monedas,cantidad,precio[opc-1]);
				cambio=dineroIntroducido-precio[opc-1];
				if(!exacto && cambio!=0) {
					devolverCambio(monedas,cantidad,cambio);
				}						
			}			
		}	
		
		//Mostrar informe de ventas y recaudación
		informeVentas(monedas,cantidad,dineroInicial);		
	}
	
	//Método de emisión de menú y validación de opción 
	public static int menu(String[] productos, int[] precio) {
		int op=0;
		String respuesta;
		String cadenaMenu=String.format("Introduzca una opcion valida\nLISTA DE PRODUCTOS\n1- %-15S -%5.2f\n2- %-15S -%5.2f\n3- %-15S -%5.2f\n4.- SALIR\nElija la opcion",productos[0],precio[0]/100.0,productos[1],precio[1]/100.0,productos[2],precio[2]/100.0);
		while (op<1 || op>4) {
			respuesta=JOptionPane.showInputDialog(cadenaMenu);
			op= Integer.parseInt(respuesta);
			//op= Integer.parseInt(JOptionPane.showInputDialog("Introduzca una opcion valida\nLISTA DE PRODUCTOS\n1-Agua\n2-Refresco\n3-Zumo\n4-Salir\nElija la opcion"););
		}
		return op;	
	}	
	
	public static boolean importeExacto(int[] m,int[]c) {
		int contMonedas=0;
		boolean exacto=false;
		for(int i=0;i<c.length && !exacto;i++) {
			if(c[i]==0) {
				contMonedas++;
				if(m[i]==5) exacto=true;				
			}
		}
		if(contMonedas>=2 || exacto) {
			exacto=true;
			JOptionPane.showMessageDialog(null, "INTRODUZCA IMPORTE EXACTO\n LA MÁQUINA NO DEVOLVERÁ CAMBIO");
		}
		return exacto;
	}
	
	
	public static int realizarPago(int[] m,int[] c,int precio) {
		int sumaDinero=0;
		int pago;
		do {
			JOptionPane.showMessageDialog(null, "Precio:"+((float)precio/100)+"euros \n Pendiente:"+((float)(precio-sumaDinero)/100)+" euros");
			pago=(int)(100*Double.parseDouble(JOptionPane.showInputDialog("Introduzca moneda en euros:")));
			//int i=0;
			boolean encontrado=false;
			for(int i=0;i<m.length && !encontrado;i++) {
				//while(i<m.length && !encontrado) {
			     if(pago==m[i]) {
			    	 encontrado=true;
			    	 sumaDinero+=pago;
			    	 c[i]++;
			     }
			    // i++;
			}
			if(!encontrado)System.out.println("La moneda no es válida");
		}while(sumaDinero<precio);
		return sumaDinero;		
	}
	
	public static void devolverCambio(int []m,int[] c,int cambio) {
		int i=0;
		while(cambio>0) {
			while(m[i]<=cambio && c[i]>0) {
				c[i]--;
				cambio-=m[i];
				System.out.println("Moneda devuelta: "+ ((float)m[i]/100)+" euros");
			}
			i++;			
		}		
	}
	
	public static void informeVentas(int[] m,int[] c,int dineroInicial) {
		System.out.println("INFORME DE VENTAS");
		int totalRecaudacion=0;
		for (int i = 0; i < m.length; i++) {
			System.out.printf("Moneda:%4.2f euros Cantidad:%3d\n",m[i]/100.0,c[i]);
			totalRecaudacion+=m[i]*c[i];
		}
		System.out.println("El dinero recaudado asciende a "+totalRecaudacion/100.0+" euros");
		System.out.println("El total de ventas asciende a "+(totalRecaudacion-dineroInicial)/100.0+" euros");
	}	

}




