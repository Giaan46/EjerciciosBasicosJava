package com.tokioschool.ejerciociotp4;


import java.util.Scanner;

public class Ejerciocio4 {
    public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);
    float Base;
    float Altura;
    float Area;

    System.out.println("Introduzca la base del triangulo: ");
    Base = entrada.nextFloat();
    System.out.println("Introduzca la altura del triangulo: ");
    Altura = entrada.nextFloat();

    Area = (Base * Altura) / 2;

    System.out.println(" El area del triangulo es : " + Area );
    

    }


}
