/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_30_omarrivera;

/**
 *
 * @author Usuario
 */
public class Estudiante_30 {
    // Atributos
    private String nombre;
    private int edad;

    // Constructores
    public Estudiante_30() {
        // Constructor por defecto
    }

    public Estudiante_30(String nombre, int edad) {
        // Constructor con parámetros
        this.nombre = nombre;
        this.edad = edad;
    }

    // Métodos
    public void estudiar() {
        System.out.println(nombre + " está estudiando.");
    }

    // Sobrecarga de métodos
    public void estudiar(int horas) {
        System.out.println(nombre + " está estudiando durante " + horas + " horas.");
    }

    // Métodos con valor de retorno
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}
