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
public class Ejercicio_08_CuadradoDeNelementos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        /*
        8-
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar
lo siguiente:
* * * *
*     *
*     *
* * * *

        */
        
        Scanner leer = new Scanner (System.in);
        
        
        int n;
        
        System.out.println("Ingrese un numero para el cuadrado");
        n= leer.nextInt();
        
// ¨¨¨¨¨¨LINEA SUPERIOR¨¨¨¨¨¨
for (int i = 0; i < n; i++) 
{
System.out.print("#"); 
}       
System.out.println("1"); //Salte a la proxima linea "LN"
//****************************************************************
         
        //CENTRO DEL CUADRADO
        for (int i = 0; i < n-2; i++) //n-2 (n es el alto) y -2 que es menos la parte superior y la parte inferior
            {
            System.out.print("$"); // EL PRIMER * DE LA COLUMNA
            
        for (int j=0; j<n-2; j++) // j-2 (j es el ancho) y - 2 para que quede todo el espacio del centro menos los costados 
            {
            System.out.print("-"); // VACIO DEL CENTRO                
            
         }
         System.out.println("%"); // EL ULTIMO * DE LA COLUMNA y "LN" salta a la proxima linea
         }    

//******************************************************************

//¨¨¨¨¨¨¨¨PARTE INFERIOR DEL CUADRADO¨¨¨¨¨¨¨¨
for (int i = 0; i < n; i++) 
{
System.out.print("+");
}System.out.println("1"); //Salte a la proxima linea "LN"

        }
    }

