/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S11_HERENCIA_30;

/**
 *
 * @author Usuario
 */
public class Estudiante extends Persona{
    private String carrera;
    private int semestre;
    private double promedio;

    public Estudiante(String nombre, int edad, String carrera, int semestre, double promedio) {
        super(nombre, edad);
        this.carrera = carrera;
        this.semestre = semestre;
        this.promedio = promedio;
    }

    public String getCarrera() {
        return carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    public double getPromedio() {
        return promedio;
    }

    public void estudiar() {
        System.out.println("Estoy estudiando");
    }

    public void presentarExamen() {
        System.out.println("Voy a presentar un examen");
    }
}
