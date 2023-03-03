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

    public Animal() {
        Scanner reader = new Scanner(System.in);
        System.out.print("Ingrese  nombre de Animal : ");
        nombre = reader.next();

        System.out.print("Ingrese edad de Animal : ");
        edad = reader.nextInt();

        System.out.print("Alimento de mascota : ");
        alimento = reader.next();

        System.out.println("nombre: " + nombre);
        System.out.println("edad: " + edad);
        System.out.println("alimento: " + alimento);
    }
    public String getNombreA() {
        return nombre;
    }

    public void setNombreA(String nombre) {
        this.nombre = nombre;
    }
    
        public int getEdadA() {
        return edad;
    }

    public void setEdadA(int edad) {
        this.edad = edad;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

}
