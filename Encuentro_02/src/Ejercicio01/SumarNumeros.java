/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio01;

import java.util.Scanner;

/**
 *
 * @author Juan Licciardi
 */
public class SumarNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int numberA, numberB, addition;
        System.out.print("Ingrese el primer número a sumar: ");
        numberA= input.nextInt();
        System.out.print("Ingrese el segundo número a sumar: ");
        numberB= input.nextInt();
        addition=numberA+numberB;
        System.out.print("La suma de " + numberA + " y " + numberB + " es " + addition);
        System.out.println("");
    }
    
}
