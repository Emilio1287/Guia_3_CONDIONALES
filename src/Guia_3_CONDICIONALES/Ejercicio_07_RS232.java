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
public class Ejercicio_07_RS232 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        7.
Realizar un programa que simule el funcionamiento de un dispositivo RS232, 
este tipo de dispositivo lee cadenas enviadas por el usuario. 
Las cadenas deben llegar con un formato fijo: 
tienen que ser de un máximo de 5 caracteres de largo, 
el primer carácter tiene que ser X y el último tiene que ser una O.
Las sec5 caracteres de largouencias leídas que respeten el formato se consideran correctas,
la secuencia especial “&&&&&” marca el final de los envíos 
(llamémosla FDE), y toda secuencia distinta de FDE, que no respete el formato se
considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de
lecturas correctas e incorrectas recibidas. Para resolver el ejercicio
deberá investigar cómo se utilizan las siguientes funciones de Java
        Substring(a,b) --> Subtrae del texto 
                           desde el numero de caracter "a" hasta la "b"
        Length()-->cuenta la cantidad de caracteres 
                   incluyendo espacios vacios 
        equals()-->se usa para saber si dos objetos son del mismo tipo 
                   y tienen los mismos datos. 
                   Nos dara el valor true si son iguales y false si no.  
                   parahacer una comparación entre dos objetos.
        */
        
        Scanner leer = new Scanner (System.in);
        
        String frase;
        int falsa=0;
        int correcta=0;
        
        do {
                System.out.println("Ingrese una palabras de 5 caracteres, que comience con x y termine con O: ");
                frase= leer.next();
            
                if ((frase.length()==5 )) 
                {
                    if (frase.substring(0,1).equalsIgnoreCase("X"))
                    {
                        if (frase.substring(4,5).equalsIgnoreCase("O")) 
                        {correcta ++;} 
                        else {falsa ++;}
                     }
                     else {falsa ++;}
                }
                else {falsa ++;}
                    
            } while (!(frase.equals("&&&&&")));
        
        System.out.println("correctas ingresadas es: " +correcta);
        System.out.println("incorrectas ingresadas es: " +falsa);        
              
    }       
    }
    
