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
public class Ejercicios_01_ParImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        1. Crear un programa que 
        dado un número determine 
        si es par o impar.
        */
     
        Scanner leer = new Scanner (System.in);
        
     int num;
   System.out.println("Ingrese un numero");
   num = leer.nextInt();
        
        if (num %2==0)
            System.out.println("El numero ingresado es PAR");
        else
            System.out.println("El numero ingresado es IMPAR");
    }
    
}
    
