import javax.swing.*;

public class P_5_1_9 {
    public static void main(String[] args) {
//        Declarar variables
        String numToString = JOptionPane.showInputDialog("Introducir un numero");
        int[] array = new int[numToString.length()];
        for (int i = 0; i < array.length; i++) {
            int x = numToString.charAt(i);
            array[i]=x-48 ;
        }
        for (int x :
                array) {
            System.out.println(x);
        }
    }
}
