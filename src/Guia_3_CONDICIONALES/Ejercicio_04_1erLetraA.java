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
public class Ejercicio_04_1erLetraA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
4 - Escriba un programa que pida una frase o palabra y valide si la primera
letra de esa frase es una ‘A’. 
Si la primera letra es una ‘A’, 
se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso
contrario, se deberá imprimir “INCORRECTO”. 
Nota: investigar la funcion Substring y equals() de Java.
        */
    Scanner leer = new Scanner (System.in);

    String Frase;
    System.out.println("Por favor ingrese una frase");
    Frase = leer.nextLine();
    
    if (Frase.substring(0, 1).equalsIgnoreCase("A"))
    {
        System.out.println("Correcto");
    }
    else
    {
        System.out.println("Incorrecto");
    }
    }
    
    /*
    Substring (a,b) --> Subtrae del texto desde el numero de caracter "a" hasta la "b"
    */
}
