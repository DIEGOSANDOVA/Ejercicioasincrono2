/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculadorAvanzada;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class calculadoraAvanzada {
    //Variables

    private int num1, num2, operacion, factorial = 1;

    //Constructor
    public calculadoraAvanzada() {

    }

    //Metodo Get y Set
    public int getNumero1() {
        return num1;
    }

    public void setNumero1(int num1) {
        this.num1 = num1;
    }

    public int getNumero2() {
        return num2;
    }

    public void setNumero2(int num2) {
        this.num2 = num2;
    }

    public int getOperacion() {
        return operacion;
    }

    public void setOperacion(int operacion) {
        this.operacion = operacion;
    }

    //Procedimientos
    public void Potencia() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Digite dos numeros: ");
        num1 = reader.nextInt();
        num2 = reader.nextInt();

        operacion = (int) Math.pow(num1, num2);

        System.out.println("La potencia de los numeros que ingreso es: " + operacion);
    }

    public void Factorial() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Digite un numero: ");
        num1 = reader.nextInt();

        for (int i = 1; i <= num1; i++) {
            factorial = factorial * i;
        }

        System.out.println("El factorial del numero que ingreso es: " + factorial);
    }
}
