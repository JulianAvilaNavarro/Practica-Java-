package Punto10;

import javax.swing.*;
import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce una frase: ");
        String frase= leer.nextLine();
        String newCadena = frase.replace(" ", "");
        System.out.println(newCadena);
    }
}
