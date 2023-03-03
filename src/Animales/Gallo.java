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
public class Gallo {

    Gallo(String piolín, int i, String maíz, String rojo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void mostrarDatos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public class gallo extends Animal {

    private String color_plumas;

    public gallo(String nombre, int edad, String alimento, String color_plumas) {
        super(nombre, edad, alimento);
        this.color_plumas = color_plumas;
    }

    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Color de plumas: " + color_plumas);
    }
}
}
