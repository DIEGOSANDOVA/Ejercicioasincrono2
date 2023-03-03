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
public class Perro {

    Perro(String fido, int i, String croquetas, String café) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void mostrarDatos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public class perro extends Animal {

    private String color_pelaje;

    public perro(String nombre, int edad, String alimento, String color_pelaje) {
        super(nombre, edad, alimento);
        this.color_pelaje = color_pelaje;
    }

    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Color de pelaje: " + color_pelaje);
    }
}
}
