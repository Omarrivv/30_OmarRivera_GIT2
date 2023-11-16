/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S11_HERENCIA_30;

/**
 *
 * @author Usuario
 */
public class Profesor extends Persona{
    private String materia;
    private int experiencia;
    private double sueldo;

    public Profesor(String nombre, int edad, String materia, int experiencia, double sueldo) {
        super(nombre, edad);
        this.materia = materia;
        this.experiencia = experiencia;
        this.sueldo = sueldo;
    }

    public String getMateria() {
        return materia;
    }
    public int getExperiencia() {
        return experiencia;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void darClase() {
        System.out.println("Estoy dando una clase");
    }

    public void corregirExamen() {
        System.out.println("Estoy corrigiendo un examen");
    }
}
