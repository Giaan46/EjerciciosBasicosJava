package com.tokioschool.ejerciociotp4;

import java.util.Random;
import java.util.Scanner;

public class Ejerciocio3 {
    public static void main(String[] args){
      Scanner keyboard = new Scanner(System.in);

      System.out.print("Introduzca el primero numero ");
      String number1 = keyboard.nextLine();
      System.out.print("Introduzca el segundo numero ");
      String number2 = keyboard.nextLine();

      int value1 = Integer.parseInt(number1);
      int value2 = Integer.parseInt(number2);

      Random generator = new Random();
      int randomValue = generator.nextInt(value2 - value1 + value1);
      System.out.println("El numero aleatorio generado entre esos dos numero es : "+ randomValue);



    }


}
