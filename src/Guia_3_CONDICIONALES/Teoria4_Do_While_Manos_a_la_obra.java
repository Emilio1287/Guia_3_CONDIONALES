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
public class Teoria4_Do_While_Manos_a_la_obra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    /*
    Ejercicio 9
Escriba un programa que lea 20 números. 
Si el número leído es igual a cero se debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". 
El programa deberá calcular y mostrar el resultado de la suma de los números leídos, 
pero si el número es negativo no debe sumarse. 
Nota: recordar el uso de la sentencia break.  
    */

 Scanner leer = new Scanner(System.in);

    int num=1; 
    int suma=0;
    int cont=0;
            
    do {
         if (num!=0) //Si el Nro en diferente que "0" continua sino****             
         {
         System.out.println("Introdice un numero: ");    
         num=leer.nextInt();//se gusrda el numero asignado en la variable LEE 
         if (num>0) //Si el numero es mayor que 0 (no es negativo)
         {
         suma=suma+num; //Se suman los numero leidos (diferente que 0 y No negativo
         }
         cont++;
         }
         
         else { //Si el numero es "0"
System.out.println("Se capturó el numero cero"); 
break;
}    
 
    } while (cont<5); //Si es diferente de CERO vuelve a solicitar un nuevo numero
       System.out.println("Maximo de numero ingresados = 5");  
       System.out.println("La suma de todos los numero es " +suma);
     } 
     }


    
   


    
