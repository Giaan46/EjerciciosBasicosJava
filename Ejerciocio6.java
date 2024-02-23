package com.tokioschool.ejerciociotp4;


import java.util.Scanner;

public class Ejerciocio6 {
    public static void main(String[] args){
     Scanner entrada = new Scanner(System.in);
     String str1;
     int car1;
     int car2;

     System.out.println("introduzca la cadena:  ");
     str1 = entrada.nextLine();
     System.out.println("Introduzca la posicion donde quiere iniciar la imprecion de la cadena  : ");
     car1 = entrada.nextInt();
     System.out.println("Introduzca la posicion donde quiere terminar la cadena : ");
     car2 = entrada.nextInt();
     int cantidadLetras = str1.length();



     if(car1 + car2 <= cantidadLetras  ){

      System.out.println(str1.substring(car1,car2));

     }else{
      System.out.println("Las posiciones indicadas no son correctas !! intentelo denuevo... ");
     }


      }




    }



