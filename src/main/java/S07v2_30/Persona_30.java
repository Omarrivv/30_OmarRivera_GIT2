/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S07v2_30;

/**
 *
 * @author Usuario
 */
public class Persona_30 {
    // Atributos
    private String nombre;
    private int edad;
    private double altura;
    // Constructor por defecto
    public Persona_30() {
    }

    // Constructor con parámetros
    public Persona_30(String nombre, int edad, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    // Métodos
    public void saludar() {
        System.out.println("Hola, soy " + nombre + ".");
    }

    // Sobrecarga de métodos
    public void saludar(String saludo) {
        System.out.println(saludo + ", soy " + nombre + ".");
    }
    
        public void saludar(String saludo, String cordial) {
        System.out.println(saludo + ", soy " + nombre + "." + "y fue muy" + cordial);
    }

    // Método con valor de retorno
    public String obtenerInformacion() {
        return "Nombre: " + nombre + ", Edad: " + edad + " años, Altura: " + altura + " metros.";
    }

    // Métodos con parámetros y argumentos
    public void cumplirAnios(int cantidadAnios) {
        edad += cantidadAnios;
        System.out.println("¡Feliz cumpleaños! Ahora tengo " + edad + " años.");
    }

    public void crecer(double cantidadAltura) {
        altura += cantidadAltura;
        System.out.println("He crecido " + cantidadAltura + " metros. Ahora mido " + altura + " metros.");
    }

    // Objetivos ficticios
    public void objetivo1() {
        System.out.println("Objetivo 1: Aprender nuevas habilidades.");
    }

    public void objetivo2() {
        System.out.println("Objetivo 2: Contribuir positivamente a la comunidad.");
    }
    // (Código previo de la clase Persona)

    // Nuevo método con parámetros para persona1
    public void saludarConSaludoPersonalizado(String saludoPersonalizado) {
        System.out.println(saludoPersonalizado + " Soy " + nombre + ".");
    }

    // Nuevo método con parámetros para personal

    // Nuevos métodos con valores de retorno para persona2
    public int calcularEdadEnFuturo(int aniosEnFuturo) {
        return edad + aniosEnFuturo;
    }

    // Nuevos métodos con valores de retorno para persona2
    public double predecirAltura(int aniosEnFuturo) {
        return altura + (0.02 * aniosEnFuturo); // Simulación de crecimiento de altura en el futuro
    }

    // Objetivo 3 para persona1
    public void objetivo3() {
        System.out.println("Objetivo 3: Aprender nuevas habilidades.");
    }
}
