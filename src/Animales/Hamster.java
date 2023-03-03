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
public class Hamster {

    Hamster(String pelusa, int i, String semillas, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void mostrarDatos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public class hamster extends Animal {

    private int cantidad_pulgas;

    public hamster(String nombre, int edad, String alimento, int cantidad_pulgas) {
        super(nombre, edad, alimento);
        this.cantidad_pulgas = cantidad_pulgas;
    }

    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Cantidad de pulgas: " + cantidad_pulgas);
    }
}
}
