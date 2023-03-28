import javax.swing.*;

public class P_5_0_2A4 {
    public static void main(String[] args) {
        //Declarar variables
//        int[] array = new int[10];
        int[] array = new int[Integer.parseInt(JOptionPane.showInputDialog("Introducir dimension de arrays"))];
        int max;
        int min;

        array[0] = Integer.parseInt(JOptionPane.showInputDialog("Introduce 10 valores de tipo entero"));
        max = array[0];
        min = array[0];
        for (int i = 1; i < array.length; i++) {
            array[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduce 10 valores de tipo entero"));
            if (max > array[i]) {
                max = array[i];
            }
            if (min < array[i]) {
                min = array[i];
            }
        }
        for (int x : array) {
            System.out.println(x);
        }
        System.out.printf("mayor %d menor %d",max,min);

    }
}
