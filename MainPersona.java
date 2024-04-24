import java.util.Scanner;

public class MainPersona {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("introduzce tu nombre ");
        String nombre = reader.next();
        System.out.println("introduzce tu apellido ");
        String apellido = reader.next();
        System.out.println("introduce tu Edad ");
        int edad = reader.nextInt();
        System.out.println("Introduce tu altura");  
        double altura = reader.nextDouble();
        
        Persona p1 = new Persona();
        p1.nombre = nombre;
        p1.apellido = apellido;
        p1.edad = edad;
        p1.altura = altura;
        p1.mostrarNombre();
        p1.mostrarApellido();
        p1.mostrarEdad();
        p1.mostrarAltura();
    }
}
