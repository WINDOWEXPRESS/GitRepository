import javax.swing.*;

public class P_5_0_5 {
    public static void main(String[] args) {
        String[] paises = new String[5];
        for (int i = 0; i < paises.length; i++) {
            paises[i] = JOptionPane.showInputDialog("Introducir el nombre del pais.");
        }
        for (String x : paises
        ) {
            System.out.print(x+"\t");
        }
    }
}
