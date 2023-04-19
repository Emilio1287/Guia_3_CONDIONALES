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
public class Ejercicios_02_Frase_CorrectaIncorrecta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        2. Crear un programa que pida una frase 
        y si esa frase es igual a “eureka” 
        el programa pondrá un mensaje de Correcto, 
        sino mostrará un mensaje de Incorrecto. 
        Nota: investigar la función equals() en Java.
        */
        
        Scanner leer = new Scanner (System.in);
        
    String Frase;
    System.out.println("Ingresa un clave");
    Frase = leer.nextLine();
   
        
    if (Frase.equals("eureka"))
    {
        System.out.println("Correcto");
    } 
    else
   
    {
        System.out.println("Incorrecto");
    }
        
     /*
    Equals() se usa para saber si dos objetos son del mismo tipo 
    y tienen los mismos datos. 
    Nos dara el valor true si son iguales y false si no. 
    Las subclases pueden sobreescribir el método equals() 
    parahacer una comparación entre dos objetos.
    */
 
    }
}
