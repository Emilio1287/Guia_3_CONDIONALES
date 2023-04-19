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
public class Teoria3_While_Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

/*
While
La estructura while ejecuta un bloque de instrucciones mientras se cumple una
condición. La condición se comprueba antes de empezar a ejecutar por
primera vez el bucle, por lo tanto, si la condición se evalúa a «false» en la
primera iteración, entonces el bloque de instrucciones no se ejecutará ninguna
vez.
while (<condición>) {
<sentencias>
}
*/
        
        Scanner leer = new Scanner(System.in);

        String respuesta = "S";

        while (respuesta.equalsIgnoreCase("S")) {
            System.out.println("Desea continuar?");
            respuesta = leer.nextLine();
        
    }
    
}
}
