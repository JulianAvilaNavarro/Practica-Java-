package Punto14;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        System.out.println("Ingresa un numero: ");
        Scanner leer = new Scanner(System.in);
        int numero= Integer.parseInt(leer.nextLine());
        int i=numero;
        for(i=numero; i<=1000;i=i+2)
            System.out.println(i);
            i++;
            if(i==999||i>1000){
                System.out.println(1000);
            }
    }
}
