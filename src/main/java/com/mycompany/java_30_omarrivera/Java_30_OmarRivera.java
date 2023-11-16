/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.java_30_omarrivera;

/**
 *
 * @author Usuario
 */
public class Java_30_OmarRivera {

    public static void main(String[] args) {
        Estudiante_30 estudiante1 = new Estudiante_30("Juan", 20);
        estudiante1.estudiar();
        estudiante1.estudiar(3);

        System.out.println("Nombre: " + estudiante1.getNombre());
        System.out.println("Edad: " + estudiante1.getEdad());
        
        Calculadora_30 calculadora1 = new Calculadora_30("Casio", 123);
        calculadora1.realizarOperacion();
        calculadora1.realizarOperacion(5);

        System.out.println("Marca: " + calculadora1.getMarca());
        System.out.println("Modelo: " + calculadora1.getModelo());
    }
}
