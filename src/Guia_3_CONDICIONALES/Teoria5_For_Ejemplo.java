/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia_3_CONDICIONALES;

/**
 *
 * @author kuchi
 */
public class Teoria5_For_Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   /*
       For
La estructura for proporciona una forma compacta de recorrer un rango de
valores cuando la cantidad de veces que se debe iterar un bloque de código es
conocida. 
        
La forma general de la estructura for se puede expresar del
siguiente modo:

for (<inicialización>; <terminación>; <incremento>) {
<sentencias>
}
        
La expresión <inicialización> inicializa el bucle y se ejecuta una sola vez al
iniciar el bucle. 
El bucle termina cuando al evaluar la expresión <terminación>
el resultado que se obtiene es false. 
La expresión <incremento> se invoca después de cada iteración que realiza el bucle; esta expresión incrementa o
decrementa un valor hasta que se cumpla la condición de <terminación> del
bucle.
        
Como regla general puede decirse que se utilizará el bucle for cuando se
conozca de antemano el número exacto de veces que ha de repetirse un
determinado bloque de instrucciones. Se utilizará el bucle do-while cuando no
se conoce exactamente el número de veces que se ejecutará el bucle, pero se
sabe que por lo menos se ha de ejecutar una. Se utilizará el bucle while cuando
es posible que no deba ejecutarse ninguna vez. 
   */
    System.out.println("For Creciendo");
    for (int i = 0; i < 10; i++) 
    {
    System.out.println("Imprimo el valor de i: " + i);
    }
    
    System.out.println("===================================");
    
    System.out.println("For decreciendo");
    for (int i = 10; i > 0; i--) {
    System.out.println("Imprimo el valor de i: " + i);
    }
}

        
        
        
    
    
    }
    

