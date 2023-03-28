class P_3_5_1{
	public static void main(String[]args){
		char caracter ;
		short saltoLinea = 0;
		for(caracter = 40 ; caracter <151 ; caracter++){
			System.out.print("num "+(int)caracter+": "+caracter+"\t");
			saltoLinea +=1;
			if(saltoLinea % 5 == 0){
				System.out.println("");	
			}
		}
	}
}
//  System.out.println("");	