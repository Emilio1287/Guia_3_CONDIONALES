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
public class Ejercicios_06_Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        Realizar un programa que pida dos números enteros positivos por
teclado y muestre por pantalla el siguiente menú:El usuario deberá elegir
una opción y el programa deberá mostrar el resultado por pantalla y
luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en
vez de salir del programa directamente, se debe mostrar el siguiente
mensaje de confirmación: ¿Está seguro que desea salir del programa
(S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso
contrario se vuelve a mostrar el menú.
        MENU
        1. SUMAR
        2. RESTAR
        3. MULTIPLICAR
        4. DIVIDIR
        5. SALIR
        Elija opción:
        
        */
        
        Scanner leer = new Scanner (System.in);
        
        
   int Opcion;
   int num1;
   int num2;
   String respuesta = "S";
   
        do {
            
            System.out.println("MENU ");
            System.out.println("1. SUMAR ");
            System.out.println("2. RESTAR ");
            System.out.println("3. MULTIPLICAR ");
            System.out.println("4. DIVIDIR ");
            System.out.println("5. SALIR ");
            System.out.println("Elija opción: ");
            
            Opcion=leer.nextInt();
             
            
                switch(Opcion) 
                {
                        case 1:
                        System.out.println("Ingrese un numero Entero");
                        num1=leer.nextInt();
                        System.out.println("Ingrese otro numero Entero");
                        num2=leer.nextInt();
                        System.out.println("La suma de los numeros es " + (num1+num2));
                        break;

                        case 2:
                        System.out.println("Ingrese un numero Entero");
                        num1=leer.nextInt();
                        System.out.println("Ingrese otro numero Entero");
                        num2=leer.nextInt();
                        System.out.println("La resta de los numeros es " + (num1-num2));
                        break;
                        
                        case 3:
                        System.out.println("Ingrese un numero Entero");
                        num1=leer.nextInt();
                        System.out.println("Ingrese otro numero Entero");
                        num2=leer.nextInt();
                        System.out.println("La multiplicación de los numeros es " + (num1*num2));
                        break;

                        case 4:
                        System.out.println("Ingrese un numero Entero");
                        num1=leer.nextInt();
                        System.out.println("Ingrese otro numero Entero");
                        num2=leer.nextInt();
                        System.out.println("La división de los numeros es " + (num1/num2));
                        break;

                        case 5 :
                        System.out.println("Desea salir del programa s=Si o n=NO :");
                        respuesta= leer.next();
                        if (respuesta.equalsIgnoreCase("S")) 
                        {
                            System.out.println("Saliendo del programa...");         
                          }
                        break;
                        
                    default:
                    System.out.println("Por favor ingrese un numero valido");
                }
                
           
         
            }
          while ((respuesta.equalsIgnoreCase("N")) || (Opcion>5 || Opcion<=0));
        
    }
    
}
