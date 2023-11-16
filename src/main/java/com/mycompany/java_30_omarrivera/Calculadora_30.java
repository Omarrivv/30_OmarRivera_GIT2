/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_30_omarrivera;

/**
 *
 * @author Usuario
 */
public class Calculadora_30 {
// Atributos
    private String marca;
    private int modelo;

    // Constructores
    public Calculadora_30() {
        // Constructor por defecto
    }

    public Calculadora_30(String marca, int modelo) {
        // Constructor con parámetros
        this.marca = marca;
        this.modelo = modelo;
    }

    // Métodos
    public void realizarOperacion() {
        System.out.println("Realizando operación con la calculadora.");
    }

    // Sobrecarga de métodos
    public void realizarOperacion(int veces) {
        System.out.println("Realizando operación con la calculadora " + veces + " veces.");
    }
    
        public void realizarOperacion(int veces, String marca) {
        System.out.println("Realizando operación con la calculadora " + veces + " veces." + marca);
    }

    // Métodos con valor de retorno
    public String getMarca() {
        return marca;
    }

    public int getModelo() {
        return modelo;
    }
}
