import java.util.Scanner;

import javax.swing.JOptionPane;

public class P_9_0 {
        public static void main(String[] args) {
            //Crear variables locales
            String[] asignaturas={"Programacion","Bases de Datos","Sistemas Operativos"};
            //Crear instancia de la clase Scanner;
            Scanner dato = new Scanner(System.in);
            //Instancia de la clase alumno
            Alumno alumno1 = new Alumno("Elle","Lawliet","24/12/2000",asignaturas ) ;
            Alumno alumno2 = new Alumno("Pepito","Perez");


        }



}
