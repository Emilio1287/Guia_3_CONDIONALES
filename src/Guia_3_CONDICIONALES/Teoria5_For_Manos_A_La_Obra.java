/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia_3_CONDICIONALES;

import java.util.Scanner;

/**
 *
 * @author kuchi
 */
public class Teoria5_For_Manos_A_La_Obra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        Ejercicio 10
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima
el número ingresado seguido de tantos asteriscos como indique su valor. Por
ejemplo:
5 *****
3 ***
11 ***********
2 **
        */
    
        Scanner Leer = new Scanner (System.in);
        
        int num1;
        int num2;
        int num3;
        int num4;
        
        do {
            System.out.println("Ingrese 4 numeros: ");
            num1=Leer.nextInt();
            num2=Leer.nextInt();
            num3=Leer.nextInt();
            num4=Leer.nextInt();
        } while 
                (
                (num1<0 && num1>20) ||
                (num2<0 && num2>20) ||
                (num3<0 && num3>20) ||
                (num4<0 && num4>20)
                );
        
            System.out.print(num1);
        for (int i = 0; i < num1; i++) {
            System.out.print("*");
        } 
        System.out.println("");    
     
            System.out.print(num2);
        for (int i = 0; i < num2; i++) {
            System.out.print("*");
        }
        System.out.println("");
        
           System.out.print(num3);
           for (int i = 0; i < num3; i++) {
            System.out.print("*");
        }
        System.out.println("");
           
           System.out.print(num4);
           for (int i = 0; i < num4; i++) {
            System.out.print("*");
        }
        
    }
    
}
