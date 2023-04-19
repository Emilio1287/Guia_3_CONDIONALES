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
public class Teoria2_Switch_Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
/*
Switch
El bloque switch evalúa qué valor tiene la variable, y de acuerdo con el valor
que posee ejecuta las sentencias del bloque case correspondiente, es decir,
del bloque case que cumpla con el valor de la variable que se está evaluando
dentro del switch.
switch(<variable>) {
case <valor1>:
<sentencias1>
break;
case <valor2>:
<sentencias2>
break;
default:
<sentencias3>
}
El uso de la sentencia break que va detrás de cada case termina la sentencia
switch que la envuelve, es decir que el control de flujo del programa continúa
con la primera sentencia que se encuentra a continuación del cierre del bloque
switch. Si el programa comprueba que se cumple el primer valor (valor1) se
ejecutará el bloque de instrucciones <sentencias1>, pero si no se encuentra
inmediatamente la sentencia break también se ejecutaría las instrucciones
<sentencias2>, y así sucesivamente hasta encontrarse con la palabra
reservada break o llegar al final de la estructura.
Las instrucciones dentro del bloque default se ejecutan cuando la variable que
se está evaluando no coincide con ninguno de los valores case. Esta sentencia
equivale a else de la estructura if-else.
*/   
        
        Scanner leer = new Scanner(System.in);
        
        
int opcion;
System.out.println("Ingrese una opción");
opcion = leer.nextInt();

switch (opcion) {
case 1:
System.out.println("Esta línea de código se ejecuta si opcion = 1");
break;

case 2:
System.out.println("Esta línea de código se ejecuta si opcion = 2");
break;

default:
System.out.println("El valor ingresado en la variable opcion es diferente" + "a todos los casos analizados por el switch");
}
}
           
        
    }
    
