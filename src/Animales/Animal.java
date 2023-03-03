/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animales;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Animal {

    private String nombre;
    private int edad;
    private String alimento;

    public Animal(String nombre, int edad, String alimento) {
        this.nombre = nombre;
        this.edad = edad;
        this.alimento = alimento;
    }

    public void mostrarDatos() {
        System.out.println("nombre: " + nombre);
        System.out.println("edad: " + edad);
        System.out.println("alimento: " + alimento);
    }
}






    
   
     
  
    


