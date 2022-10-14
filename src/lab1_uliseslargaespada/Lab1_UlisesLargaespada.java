/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1_uliseslargaespada;

import java.util.Scanner;

/**
 *
 * @author ularg
 */
public class Lab1_UlisesLargaespada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("-- Bienvenido al sistema de calculo de promedio --");
        
        // Se ingresa el nombre
        System.out.print("Ingrese su nombre: ");
        String nombre = entrada.nextLine();
        
        // Se ingresan las notas de las cuatro clases
        System.out.print("Ingrese la nota final de la primera clase: ");
        double primeraClase = entrada.nextDouble();
        
        System.out.print("Ingrese la nota final de la segunda clase: ");
        double segundaClase = entrada.nextDouble();
        
        System.out.print("Ingrese la nota final de la tercera clase: ");
        double terceraClase = entrada.nextDouble();
        
        System.out.print("Ingrese la nota final de la cuarta clase: ");
        double cuartaClase = entrada.nextDouble();
        
        // Calculo del promedio
        double sumaNotasClases = primeraClase + segundaClase + terceraClase + cuartaClase;
        double promedio = sumaNotasClases / 4;
        
        // Publicar el resultado
        System.out.println("--- " + nombre + " tiene un promedio en sus clases de: " + promedio + " ---");
        
    }
    
}
