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
public class Gato {

    Gato(String misi, int i, String pescado, String verde) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void mostrarDatos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public class gato extends Animal {

    private String color_ojos;

    public gato(String nombre, int edad, String alimento, String color_ojos) {
        super(nombre, edad, alimento);
        this.color_ojos = color_ojos;
    }

    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Color de ojos: " + color_ojos);
    }
}
}
