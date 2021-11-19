package Punto12;


import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("************* Comparador de palabras **************");
        System.out.println("Ingresa la palabra 1: ");
        String palabra1 = leer.next();
        System.out.println("Ingresa la palabra 2: ");
        String palabra2 = leer.next();
        if (siIguales(palabra1, palabra2)) {
            System.out.println("Las palabras son iguales");
        } else {
            System.out.println(diferenciaEntrePalabras(palabra1, palabra2));
        }
    }
    public static String direnciaPalabras(String palabra1, String palabra2) {
        String respuesta="";
        for (int i = 0; i < palabra1.length(); i++) {
            if (i < palabra2.length()) {
                if (palabra1.charAt(i) != palabra2.charAt(i)) {
                    respuesta += "En la Posicion "+i+" la letra  de la palabra 1 : " + palabra1.charAt(i) + " es diferente a la letra " + palabra2.charAt(i)+" de la palabra 2\n";
                }
            } else {
                respuesta += "En la Posicion " + i + " la letra de la palabra  1 es: " + palabra1.charAt(i) + " y no tiene una letra para compararse en la palabra 2\n";
            }
        }
        return respuesta;
    }
    public static String diferenciaEntrePalabras(String palabra1, String palabra2) {
        String respuesta = "";

        if (palabra1.length() > palabra2.length()) {
            respuesta=direnciaPalabras(palabra1,palabra2);
        } else if (palabra2.length() < palabra2.length()) {
            respuesta=direnciaPalabras(palabra2,palabra1);
        }else {
            for (int i = 0; i < palabra1.length(); i++) {
                if (palabra1.charAt(i) != palabra2.charAt(i)) {
                    respuesta += "En la posicion "+i+" la letra  de la palabra 1: " + palabra1.charAt(i) + ", es diferente a la letra: " + palabra2.charAt(i)+" de la palabra 2.\n";
                }
            }
        }
        return respuesta;
    }
    public static Boolean siIguales(String palabra1, String palabra2) {
        return palabra1.equals(palabra2) ? true : false;
    }

}

