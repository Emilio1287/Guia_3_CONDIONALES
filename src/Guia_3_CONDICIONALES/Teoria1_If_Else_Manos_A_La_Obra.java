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
public class Teoria1_If_Else_Manos_A_La_Obra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        
        /*Ejercicio 6
Implementar un programa que le pida dos números enteros al usuario y
determine si ambos o alguno de ellos es mayor a 25.*/
        
        Scanner var = new Scanner(System.in);
        
        
int num1;
System.out.println("Ingrese un numero ENTERO");
    num1 = var.nextInt();

int num2;
System.out.println("Ingrese otro numero ENTERO");
    num2 = var.nextInt();


if (num1 >25 || num2 >25)
{
System.out.println("De las variables ingresadas una o ambas es mayor a 25");
}

else {
System.out.println("De las variables ingresadas una o ambas NO son mayores a 25");
}

    }
}
