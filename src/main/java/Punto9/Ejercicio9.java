package Punto9;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        String cadena="La sonrisa sera la mejor arma contra la tristeza";
        String newCadena = cadena.replace("a", "e");
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce una frase: ");
        String frase= leer.nextLine();
        frase=frase.toLowerCase();
        System.out.println(newCadena+" "+frase);
    }
}
