/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S11_HERENCIA_30;

/**
 *
 * @author Usuario
 */
public class Empleado extends Persona{
    private String puesto;
    private double salario;
    private int antiguedad;

    public Empleado(String nombre, int edad, String puesto, double salario, int antiguedad) {
        super(nombre, edad);
        this.puesto = puesto;
        this.salario = salario;
        this.antiguedad = antiguedad;
    }

    public String getPuesto() {
        return puesto;
    }
        public double getSalario() {
        return salario;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void trabajar() {
        System.out.println("Estoy trabajando");
    }

    public void descansar() {
        System.out.println("Estoy descansando");
    }
}
