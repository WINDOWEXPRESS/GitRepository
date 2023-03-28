public class Fecha {
    private int anio;
    private int mes;
    private int dia;

    public Fecha(){

    }
    public Fecha(int anio, int mes, int dia) {
        this.anio = anio;
        this.mes = mes;
        this.dia = dia;
    }
    public boolean siBisiesto(){
        if((anio% 4 == 0 && anio % 100 != 0)||anio % 400 == 0)
            return true;
        else
            return false;
    }
    public int diaEntreDosFechas(Fecha fecha){
        int converetirDia = anio*365+mes*30+dia;
        int converetirDia1 = fecha.anio*365+fecha.mes*30+fecha.dia;
        int diaFinal = Math.abs(converetirDia-converetirDia1);
        return  diaFinal;
    }
    public String formatoFecha(){
        return String.format("%02d/%02d/%4d",dia,mes,anio);
    }
}
