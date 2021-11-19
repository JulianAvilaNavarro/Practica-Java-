package Punto15;

import java.util.Scanner;

public class Ejercicio152 {
    public static void main(String[] args) {


    int datoIngresado = 0;
    do {
        try {
            System.out.println("************* GESTION CINEMATOGRAFICA ***************");
            System.out.println(" 1-NUEVO ACTOR                                       ");
            System.out.println(" 2-BUSCAR ACTOR                                      ");
            System.out.println(" 3-ELIMINAR ACTOR                                    ");
            System.out.println(" 4-MODIFICAR ACTOR                                   ");
            System.out.println(" 5-VER TODOS LOS ACTORES                             ");
            System.out.println(" 6-VER PELICULAS DE LOS ACTORES                      ");
            System.out.println(" 7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES     ");
            System.out.println(" 8-SALIR                                             ");
            System.out.println("*********************** // **************************");
            System.out.print("Favor ingresa una opcion de la lista :");
            Scanner leer=new Scanner(System.in);
            datoIngresado = leer.nextInt();
            switch (datoIngresado) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                default:
                    System.out.println("Dato incorrecto");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Advertecia:  Opcion no valida. " + e );
            //leer.next();
        }
    } while (datoIngresado != 8);
    }
}

