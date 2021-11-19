package Punto11;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce una frase: ");
        String cadena= leer.nextLine();
        int longitudSinEspacios = cadena.replace(" ", "").length();
        int longitud = cadena.length();
        for (int x = 0; x < longitud; x++) {
            char texto = cadena.toLowerCase().charAt(x);
            switch (texto) {
                case 'a':
                    a++;
                    break;
                case 'e':
                    e++;
                    break;
                case 'i':
                    i++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'u':
                    u++;
                    break;
                default:
                    break;
            }
        }
        System.out.println("Total de vocales: " + (a+e+i+o+u));
        System.out.println("Cantidad de a: " + a);
        System.out.println("Cantidad de e: " + e);
        System.out.println("Cantidad de i: " + i);
        System.out.println("Cantidad de o: " + o);
        System.out.println("Cantidad de u: " + u);
        System.out.println("La longitud de la cadena de texto es: "+longitud);
        System.out.println("La longitud de la cadena de texto sin espacios es: "+longitudSinEspacios);
    }

}
