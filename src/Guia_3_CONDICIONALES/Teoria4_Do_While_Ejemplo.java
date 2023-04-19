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
public class Teoria4_Do_While_Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
/*
Do / While
En este tipo de bucle, el bloque de instrucciones se ejecuta siempre al menos
una vez. El bloque de instrucciones se ejecutará mientras la condición se
evalúe a «true». Por lo tanto, entre las instrucciones que se repiten deberá
existir alguna que, en algún momento, haga que la condición se evalúe a
«false», de lo contrario el bucle será infinito.
do {
<sentencias>
} while (<condición>);
*/    
        
    Scanner leer = new Scanner(System.in);

    String respuesta;
    do {
    System.out.println("Desea continuar?");
    respuesta = leer.nextLine();
    } 
    while 
    (respuesta.equalsIgnoreCase("S"));

    
    }
    
}
