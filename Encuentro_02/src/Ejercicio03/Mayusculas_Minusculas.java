/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio03;

import java.util.Scanner;
/**
 * Escribir un programa que pida una frase y la muestre toda en mayúsculas
 * y después toda en minúsculas.
 * Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 * 
 * @author Juan Licciardi
 */
public class Mayusculas_Minusculas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String frase;
        System.out.print("Ingrese una frase: ");
        frase = input.nextLine();
        System.out.println("La frase ingresada : " + frase);
        System.out.println("La frase en MAYUSCULA: " + frase.toUpperCase());
        System.out.println("La frase en minuscula: " + frase.toLowerCase());
        
            
        
              
                
    }
    
}
