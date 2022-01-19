package bootcamp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) { //psvm

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese un nombre");
        String nombre = teclado.nextLine(); //.next() solo para una palabra

        System.out.println("Ingrese la fecha de hoy");
        int numero = teclado.nextInt();

        System.out.println("Es soleado ahi?");
        boolean comprobar = teclado.nextBoolean();

        System.out.println("Hola " + nombre + ", ¿Como estas?");//sout
        System.out.println("La fecha de hoy es: " + numero);
        System.out.println("Es soleado? " + comprobar);

    }
}
