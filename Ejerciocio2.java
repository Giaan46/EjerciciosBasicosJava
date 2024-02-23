package com.tokioschool.ejerciociotp4;

import java.util.Scanner;

public class Ejerciocio2 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        //pedir el numero por teclado al usuario
        System.out.print("Introduce un numero de mas de 3 digitos ");
        String number = keyboard.nextLine();
        int digiCount = number.length();
        System.out.println("El numero introducido tiene "+ digiCount + " digitos");







    }


}
