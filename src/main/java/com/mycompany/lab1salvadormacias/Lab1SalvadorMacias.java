/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab1salvadormacias;

import java.util.Scanner;
/**
 *
 * @author user
 */
public class Lab1SalvadorMacias {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("--Bienvenido al sistema de calculo de promedio--");
        System.out.print("Ingrese su nombre: ");//Se ingresa el nombre del usuario
        String nombre = entrada.nextLine();
        System.out.println("Hola " + nombre);
        
        //se ingresan las notas de las cuatro clases
        System.out.println("Ingrese la primera nota final: ");
        double primeraClase = entrada.nextDouble();
        
        System.out.println("Ingrese la segunda nota final: ");
        double SegundaClase = entrada.nextDouble();
        
        System.out.println("Ingrese la tercera nota final: ");
        double TerceraClase = entrada.nextDouble();
        
        System.out.println("Ingrese la cuarta nota final: ");
        double CuartaClase = entrada.nextDouble();
     
        //calculo del promedio
        double sumaClase= primeraClase + SegundaClase + TerceraClase + CuartaClase;
        double promedio = sumaClase / 4;
        
        //Se imprime el calculo del promedio
        System.out.println("----" + nombre + " el promedio de las cuatro clases es: " + promedio);
                
    }
}
