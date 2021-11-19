package Punto16;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int tipoPeso = 0;
        boolean esMayorDeEdad = true;
        Scanner leer=new Scanner(System.in);
        System.out.println("*****************************************************");
        System.out.println("Ingrese el nombre de la persona 1: ");
        String nombre1 = leer.next();
        System.out.println("Ingrese la edad de la persona 1: ");
        int edad1 = leer.nextInt();

        while (edad1 < 1)
        {
            System.out.println("La edad no es valida");
            System.out.println("Ingrese la edad de la persona: ");
            edad1 = leer.nextInt();
        }
        System.out.println("Ingrese el sexo de la persona 1 siendo \"H\" hombre y \"M\" mujer : ");
        char sexo1 = leer.next().charAt(0);
        System.out.println("Ingrese el peso de la persona 1 en KG: ");
        int peso1 = leer.nextInt();

        while (peso1 < 8)
        {
            System.out.println("El peso no es valido");
            System.out.println("Ingrese el peso de la persona 1 en KG: ");
            peso1 = leer.nextInt();
        }
        System.out.println("Ingrese la altura de la persona 1 en metros: ");
        String entrada = leer.next();
        entrada = entrada.replace(",", ".");
        float altura1 = Float.parseFloat(entrada);
        while (altura1 < 0.70)
        {
            System.out.println("la altura no es valida");
            System.out.println("Ingrese la altura de la persona 1 en metros: ");
            altura1 = leer.nextFloat();
        }
        System.out.println("*****************************************************");
        //datos persona 2
        System.out.println("Ingrese el nombre de la persona 2: ");
        String nombre2 = leer.next();
        System.out.println("Ingrese la edad de la persona 2: ");
        int edad2 = leer.nextInt();

        while (edad2 < 1)
        {
            System.out.println("La edad no es valida");
            System.out.println("Ingrese la edad de la persona 2: ");
            edad2 = leer.nextInt();
        }
        System.out.println("Ingrese el sexo de la persona 2 siendo \"H\" hombre y \"M\" mujer : ");
        char sexo2 = leer.next().charAt(0);
        System.out.println("Ingrese el peso de la persona 2 en KG: ");
        int peso2 = leer.nextInt();

        while (peso2 < 8)
        {
            System.out.println("El peso no es valido");
            System.out.println("Ingrese el peso de la persona 2 en KG: ");
            peso2 = leer.nextInt();
        }
        System.out.println("Ingrese la altura de la persona 2 en metros: ");
        String entrada2 = leer.next();
        entrada2 = entrada2.replace(",", ".");
        float altura2 = Float.parseFloat(entrada2);
        while (altura2 < 0.70)
        {
            System.out.println("la altura no es valida");
            System.out.println("Ingrese la altura de la persona 2 en metros: ");
            altura2 = leer.nextFloat();
        }
        System.out.println("*****************************************************");
        // Datos persona 3

        System.out.println("Ingrese el nombre de la persona 3: ");
        String nombre3 = leer.next();
        System.out.println("Ingrese la edad de la persona 3: ");
        int edad3 = leer.nextInt();

        while (edad3 < 1)
        {
            System.out.println("La edad no es valida");
            System.out.println("Ingrese la edad de la persona 3: ");
            edad3 = leer.nextInt();
        }
        System.out.println("Ingrese el sexo de la persona 3 siendo \"H\" hombre y \"M\" mujer : ");
        char sexo3 = leer.next().charAt(0);
        System.out.println("Ingrese el peso de la persona 3 en KG: ");
        int peso3 = leer.nextInt();

        while (peso3 < 8)
        {
            System.out.println("El peso no es valido");
            System.out.println("Ingrese el peso de la persona 3 en KG: ");
            peso3 = leer.nextInt();
        }
        System.out.println("Ingrese la altura de la persona 3 en metros: ");
        String entrada3 = leer.next();
        entrada3 = entrada2.replace(",", ".");
        float altura3 = Float.parseFloat(entrada3);
        while (altura3 < 0.70)
        {
            System.out.println("la altura no es valida");
            System.out.println("Ingrese la altura de la persona 3 en metros: ");
            altura3 = leer.nextFloat();
        }
        System.out.println("*****************************************************");


        //crear instancias de Persona
        Persona persona1 = new Persona(nombre1, edad1, peso1, altura1, sexo1);
        Persona persona2 = new Persona(nombre2, edad2, sexo2);
        Persona persona3 = new Persona();
        //Setear datos persona 3

        persona2.setPeso(peso2);
        persona2.setAltura(altura2);
        persona2.setSexo(sexo2);

        persona3.setNombre(nombre3);
        persona3.setEdad(edad3);
        persona3.setPeso(peso3);
        persona3.setAltura(altura3);
        persona3.setSexo(sexo3);

        //comprobar el peso de cada uno de las tres personas
        tipoPeso = persona1.calcularIMC();
        System.out.println("Persona 1 - " + comprobarPeso(tipoPeso));
        tipoPeso = persona2.calcularIMC();
        System.out.println("Persona 2 - " + comprobarPeso(tipoPeso));
        tipoPeso = persona3.calcularIMC();
        System.out.println("Persona 3 - " + comprobarPeso(tipoPeso));

        //indicar si las personas son mayores de edad o no
        esMayorDeEdad = persona1.esMayorDeEdad();
        if (esMayorDeEdad) {
            System.out.println("La persona 1 es mayor de edad");
        }
        esMayorDeEdad = persona2.esMayorDeEdad();
        if (esMayorDeEdad) {
            System.out.println("la persona 2 es mayor de edad");
        }
        esMayorDeEdad = persona3.esMayorDeEdad();
        if (esMayorDeEdad) {
            System.out.println("La persona 3 es mayor de edad");
        }

        //información general de todos
        System.out.println(persona1.toString());
        System.out.println(persona2.toString());
        System.out.println(persona3.toString());
    }

    public static String comprobarPeso(int n)
    {
        String mensaje;
        if (n == -1) {
            mensaje = "La persona está en su peso ideal";
        } else if (n == 0) {
            mensaje = "La persona está por debajo de su peso ideal";
        }
        else
            mensaje="La persona tiene  sobrepeso";
        return mensaje;
    }
}





