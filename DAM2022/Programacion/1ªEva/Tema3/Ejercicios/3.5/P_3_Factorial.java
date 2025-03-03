
public class P_3_Factorial {
	private int fact1 ; //x
	private int fact2 ; //y
	private int fact3 ; //x-y
	private int posiblesCombinaciones ;
	
	public int getPosiblesCombinaciones() {
		return posiblesCombinaciones;
	}
	
	public void calcularFactorial(int x,int y) {
		int factoria1= 1;
		int factoria2= 1;
		int factoria3= x-y;
		
		for(int i = x ; i > 1; i--){
			factoria1 *= i;
		}
		for(int i = y ; i > 1; i--){
			factoria2 *= i;
		}
		for(int i = factoria3 ; i > 1; i--){
			factoria3 *= i;
		}
		this.fact1=factoria1;
		this.fact2=factoria2;
		this.fact3=factoria3;
	}
	
	public void posiblesCombinaciones(){
		this.posiblesCombinaciones = fact1/(fact2*(fact3));
	}
}
