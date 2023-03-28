package com.hecho_yo;

public class VerificarFecha {

	public static boolean verificarAnioBisisto(int yyyy){
		if(yyyy % 4 == 0 && (yyyy % 100 != 0 || yyyy % 400 == 0 )){
			return true;
		}else{
			return false;
		}		
	}
	
	
	//Dependiento de anio y mes introducido
	public static int diaMaximo(boolean bisiesto , int mm){
		if(mm==1 || mm==3 || mm==5 || mm==7 || mm==8 || mm==10 || mm==12){
			return 31;
		}else if(mm==4 || mm==6 || mm==9 || mm==11){
			return 30;
		}else if(mm==2 && bisiesto ){
			return 29;
		}else{
			return 28;
		}
	}
	
}
