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
public class Teoria3_While_Manos_A_La_Obra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Ejercicio 8
Escriba un programa que valide si una nota está entre 0 y 10, 
sino está entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.*/

         Scanner leer = new Scanner(System.in);

      /*int nota = 11;

        while (nota>10) {
            System.out.println("Ingrese una nota");
            nota = leer.nextInt();
    }*/
      int num1;
   System.out.println("Ingrese una nota (Numero)");
    num1 = leer.nextInt();
    
    while (num1<0 || num1>10) {
            System.out.println("Por favor ingresa una correcta (entre 0 y 10)");
            num1 = leer.nextInt();
    
    }
    }
}


