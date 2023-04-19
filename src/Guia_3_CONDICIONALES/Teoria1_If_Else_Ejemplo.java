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
public class Teoria1_If_Else_Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
/*
If/Else
La estructura if es la más básica de las estructuras de control de flujo. Esta
estructura le indica al programa que ejecute cierta parte del código sólo si la
condición evaluada es verdadera («true»). La forma más simple de esta
estructura es la siguiente:
if(<condición>){
<sentencias>
}
En donde, <condición> es una expresión condicional cuyo resultado luego de la
evaluación es un dato booleano(lógico) verdadero o falso. El bloque de
instrucciones <sentencias> se ejecuta si, y sólo si, la expresión (que debe ser
lógica) se evalúa a true, es decir, se cumple la condición.
Luego, en caso de que la condición no se cumpla y se quiera ejecutar otro
bloque de código, otra forma de expresar esta estructura es la siguiente:
if(<condición>){
<sentencias A>
} else {
<sentencias B>
}
El flujo de control del programa funciona de la misma manera, cuando se
ejecuta la estructura if, se evalúa la expresión condicional, si el resultado de la
condición es verdadero se ejecutan las sentencias que se encuentran
contenidas dentro del bloque de código if (<sentencias A>). Contrariamente,
se ejecutan las sentencias contenidas dentro del bloque else (<sentencias B>).
En muchas ocasiones, se anidan estructuras alternativas if-else, de forma que
se pregunte por una condición si anteriormente no se ha cumplido otra y así
sucesivamente.
if (<condicion1>) {
<sentencias A>
} else if(<condicion2>){
<sentencias B>
} else {
<sentencias C>
}        
*/
                
        Scanner var = new Scanner(System.in);
        
int num1;
System.out.println("Ingrese un numero");
    num1 = var.nextInt();

int num2;
System.out.println("Ingrese un numero");
    num2 = var.nextInt();


if (num1 < num2) 
{
System.out.println("La variable num1 aloja un número menor a la variable num2");
}
else 
{
System.out.println("La variable num1 aloja un número mayor a la variable num2");
}
        
        
        
       
       
        
    }
    
}
