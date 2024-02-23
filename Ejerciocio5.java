package com.tokioschool.ejerciociotp4;


import java.util.Scanner;

public class Ejerciocio5 {
    public static void main(String[] args){
     Scanner cadena = new Scanner(System.in);



      System.out.println("Introduce una cadena : ");
        String cadena1 = cadena.nextLine();
      System.out.println("Introduce la segunda cadena : ");
        String cadena2 = cadena.nextLine();

      boolean encontro = cadena1.contains(cadena2);

      if(encontro == true){
          System.out.println(" El texto aparace en la cadena.  ");
      }else {
          System.out.println(" El texto no aparece en la cadena. ");

      }




    }


}
