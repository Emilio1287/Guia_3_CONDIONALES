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
public class Ejercicio_05_SumaMayorLimite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    /* 
        
        Bucles y sentencias de salto break y continue

    5. Escriba un programa en el cual se ingrese un valor limite positivo, 
    y a continuacion solicite numeros al usuario hasta que la suma de los
numeros introducidos supere el limite inicial.
    */
      
    Scanner leer = new Scanner(System.in);
    
    int Limite;
    int Num;
    int suma=0;
    
        System.out.println("Ingrese un limite");
        Limite = leer.nextInt();
 
    while (suma <= Limite) 
    {
        System.out.println("Ingrese numeros");
        
        Num = leer.nextInt ();
        suma = suma + Num;
    }
        System.out.println("La suma de todo sus numeros es: " +suma);
   
    }
    
}
