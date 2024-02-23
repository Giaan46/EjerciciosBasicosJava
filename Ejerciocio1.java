package com.tokioschool.ejerciociotp4;

import java.util.Scanner;

public class Ejerciocio1 {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        //introducir los dos valores
        System.out.println("introduce el primer valor ");
        String valor1 = teclado.nextLine();
        System.out.println("Introduce el segundo valor ");
        String valor2 = teclado.nextLine();

        //sumar los dos valores
        int value1 = Integer.parseInt(valor1);
        int value2 = Integer.parseInt(valor2);
        int result = value1 + value2;



        //Mostrar el resultado por pantalla
        System.out.println("El resultado de la suma de los 2 valores es =" + result);







    }


}
