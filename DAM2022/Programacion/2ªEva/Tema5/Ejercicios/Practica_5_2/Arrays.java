public class Arrays {
    public static void main(String[] args) {
        String [][] arrays = new String[6][7];
        generarNumeros(arrays);
        calculoTotal(arrays);
        visualizarTabla(arrays);
    }
    static void generarNumeros(String[][] arrays){
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                if(i<4 && j<5  ){
                    arrays[i][j]= Integer.toString((int) (Math.random()*100));
                }
                if(j==5){
                    arrays[i][j]= "|";
                }
                if(i==4){
                    arrays[i][j]= "— ";
                }
            }
        }
    }
    static void visualizarTabla(String[][] arrays){
        for (String[] x: arrays) {
            for (String y: x) {
                System.out.printf("%4s  ",y);
            }
            System.out.println();
        }
    }
    static void calculoTotal(String[][] arrays){
        int horizontal = 0;
        int vertitcal = 0;
        int ultimaCasilla = 0;
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                //CALCULO HORIZONTAL
                if(i<4 && j<5  ){
                   horizontal += Integer.parseInt(arrays[i][j]);
                }
                if(j== arrays[i].length-1 && i <4) {
                    arrays[i][j] = Integer.toString(horizontal);
                    horizontal = 0;
                }
                //CALCULO VERTICAL
                if(i<5 && j<4  ){
                    vertitcal += Integer.parseInt(arrays[j][i]);
                }
                if(j== 5&&i<5 ) {
                    arrays[j][i] = Integer.toString(vertitcal);
                    ultimaCasilla += horizontal;
                    vertitcal = 0;
                }
                //Ultima Casilla
                if(i == arrays.length-1 &&j== arrays[i].length-1){
                    arrays[i][j] = Integer.toString(ultimaCasilla);
                }
            }
        }
    }


}
