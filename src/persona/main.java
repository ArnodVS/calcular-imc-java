package persona;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce tu nombre: ");
        String nombre = scanner.next();

        System.out.println("Introduce tu edad: ");
        int edad = scanner.nextInt();

        System.out.println("Introduce tu sexo (H o M): ");
        char genero = scanner.next().charAt(0);

        System.out.println("Introduce tu peso: ");
        double peso = scanner.nextDouble();

        System.out.println("Introduce tu altura: ");
        double altura = scanner.nextDouble();

        persona.Persona persona = new persona.Persona(nombre, edad, peso, altura, genero, "");
        persona.calcularIMC();
        persona.esMayorDeEdad();
        persona.comprobarGenero();

        System.out.println(persona);
    }
}
