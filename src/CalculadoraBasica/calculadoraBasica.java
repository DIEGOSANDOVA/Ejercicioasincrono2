/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculadoraBasica;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class calculadoraBasica {

    //Variables
    int num1, num2, operacion;

    //Constructor
    public calculadoraBasica() {

    }

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

    //procedimientos
    public void Suma() {
        Scanner reader = new Scanner(System.in);
        System.out.print("Digite dos numeros para sumar: ");
        num1 = reader.nextInt();
        num2 = reader.nextInt();

        operacion = num1 + num2;
        System.out.println("La suma es: " + operacion);
    }

    public void Resta() {
        Scanner reader = new Scanner(System.in);
        System.out.print("Digite dos numeros para restar: ");
        num1 = reader.nextInt();
        num2 = reader.nextInt();

        operacion = num1 - num2;
        System.out.println("La resta es: " + operacion);
    }

    public void Division() {
        Scanner reader = new Scanner(System.in);
        System.out.print("Digite dos numeros para dividir: ");
        num1 = reader.nextInt();
        num2 = reader.nextInt();

        operacion = num1 / num2;
        System.out.println("La division es: " + operacion);
    }

    public void Multiplicacion() {
        Scanner reader = new Scanner(System.in);
        System.out.print("Digite dos numeros para multiplicar: ");
        num1 = reader.nextInt();
        num2 = reader.nextInt();

        operacion = num1 * num2;
        System.out.println("La multiplicacion es: " + operacion);
    }
}
