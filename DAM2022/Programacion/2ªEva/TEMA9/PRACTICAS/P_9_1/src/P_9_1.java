import java.util.Scanner;

public class P_9_1 {
    public static void main(String[] args) {
        //Instancia de la clase Scanner
        Scanner dato = new Scanner(System.in);
        //Crear instancia persona de la clase Persona
        Persona persona = new Persona();
        System.out.println("Introducir el nombre:");
        persona.setNombre(dato.nextLine());
        System.out.println("Introducir el telefono:");
        persona.setTelefono(dato.nextLine());
        System.out.println("Introducir el edad:");
        persona.setEdad(dato.nextInt());
        System.out.println(persona.toString());
        //Crear instancia persona1 de la clase Persona
        dato.next();
        System.out.println("======================");
        Persona persona1 = new Persona();
        System.out.println("Introducir el nombre:");
        persona1.setNombre(dato.nextLine());
        System.out.println("Introducir el telefono:");
        persona1.setTelefono(dato.nextLine());
        System.out.println("Introducir el edad:");
        persona1.setEdad(dato.nextInt());
        System.out.println(persona1.toString());
        if(persona1.getEdad()< persona.getEdad()){
            System.out.println("El nombre de menor edad es "+persona1.getNombre());
        }else{
            System.out.println("El nombre de menor edad es "+persona.getNombre());
        }
    }
}
