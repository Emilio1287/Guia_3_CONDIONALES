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
public class Ejericios_03_Frase8deLargo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
 3. Realizar un programa que solo permita introducir solo frases o palabras
 de 8 de largo.
Si el usuario ingresa una frase o palabra de 8 de largo se
deberá de imprimir un mensaje por pantalla que diga “CORRECTO”,
en caso contrario, se deberá imprimir “INCORRECTO”. 
Nota: investigar la función Lenght() en Java.
        */
    
    Scanner leer = new Scanner (System.in);
    
    String Frase; 
    
        System.out.println("Ingrese una Frase o Palabra de 8 caracteres de largo");
        Frase = leer.nextLine();
        if (Frase.length() == 8) {
        System.out.println("CORRECTO");
    }else{
        System.out.println("INCORRECTO");
        }
    }
}
 
    
     
   
    
  
    
        
        
    
    
    

