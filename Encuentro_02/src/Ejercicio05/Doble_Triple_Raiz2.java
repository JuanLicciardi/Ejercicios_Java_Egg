/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio05;

import java.util.Scanner;
/**
 *Escribir un programa que lea un número entero por teclado y muestre por 
 * pantalla el doble, el triple y la raíz cuadrada de ese número. 
 * Nota: investigar la función Math.sqrt().

 * @author Juan Licciardi
 */
public class Doble_Triple_Raiz2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number;
        double doble,triple,raiz2;
        System.out.print("Ingrese un número: ");
        number = input.nextFloat();
        doble = number * 2;
        triple = number * 3;
        raiz2 = Math.sqrt(number);
        System.out.println("____________________________________________________");
        System.out.println("El doble de " + number + " es " + doble);
        System.out.println("El triple de " + number + " es " + triple);
        System.out.println("La raiz cuadrada de  " + number + " es " + raiz2);
        
    }
    
}
