/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S11_HERENCIA_30;

/**
 *
 * @author Usuario
 */
public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Juan", 20, "Ingeniería", 3, 9.5);
        Profesor profesor = new Profesor("María", 35, "Matemáticas", 10, 5000);
        Empleado empleado = new Empleado("Pedro", 25, "Recepcionista", 2000, 2);

        System.out.println(estudiante.getNombre() + " está estudiando " + estudiante.getCarrera());
        System.out.println(profesor.getNombre() + " está dando clase de " + profesor.getMateria());
        System.out.println(empleado.getNombre() + " trabaja como " + empleado.getPuesto());
    }
}
