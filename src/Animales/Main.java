/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animales;

/**
 *
 * @author diego
 */
public class Main {  
    public static void Main(String[] args) {
        gallo miGallo = new gallo("pio", 2, "Maíz", "Rojo");
        miGallo.mostrarDatos();

        perro miPerro = new perro("Gracie", 5, "Croquetas", "Café");
        miPerro.mostrarDatos();

        gato miGato = new gato("Panini", 3, "Pescado", "Verde");
        miGato.mostrarDatos();

        hamster miHamster = new hamster("Pelusa", 1, "Semillas", 10);
        miHamster.mostrarDatos();
    }
}

