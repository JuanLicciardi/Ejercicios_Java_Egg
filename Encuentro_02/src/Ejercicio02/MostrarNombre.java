/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio02;

import java.util.Scanner;

/**
 * Rutina que ingresa nombre por teclado, lo asigna a una variable
 * luego lo muestra en pantalla
 * @author Juan Licciardi
 * 
 * OBSERVACION: se utiliza nextLine() por si el usuario desea ingresar 
 * mas de un nombre
 */
public class MostrarNombre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        System.out.print("Ingrese su nombre: ");
        name = input.nextLine();
        System.out.println("El nombre ingresado es: " + name);
        
    }
    
}
