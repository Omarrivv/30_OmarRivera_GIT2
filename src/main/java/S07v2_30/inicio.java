/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S07v2_30;

/**
 *
 * @author Usuario
 */
public class inicio {
    public static void main(String[] args) {
        // Crear dos instancias de Persona
        Persona_30 persona1 = new Persona_30("Juan", 30, 1.75);
        Persona_30 persona2 = new Persona_30("María", 28, 1.60);
        

        // Utilizar el método con parámetros y argumentos
        persona1.cumplirAnios(2);

        // Utilizar el método con parámetros y argumentos
        persona1.crecer(0.1);
        
        // Métodos con valores de retorno para persona2
        String informacionPersona2 = persona2.obtenerInformacion();
        System.out.println(informacionPersona2);

        // Utilizar el método con valor de retorno
        int nuevaEdadPersona2 = persona2.calcularEdadEnFuturo(5);
        System.out.println("Edad de María en 5 años: " + nuevaEdadPersona2);

        // Utilizar el método con valor de retorno
        double nuevaAlturaPersona2 = persona2.predecirAltura(3);
        System.out.println("Altura de María en 3 años: " + nuevaAlturaPersona2);

        // Objetivo 3 para persona1
        persona1.objetivo3();

        // Llamar a métodos para cada persona
        persona1.saludar();
        persona1.cumplirAnios(1);
        persona1.crecer(0.03);
        persona1.saludar("¡Hola");

        String informacionPersona1 = persona1.obtenerInformacion();
        System.out.println(informacionPersona1);

        persona1.objetivo1();

        System.out.println();

        persona2.saludar();
        persona2.cumplirAnios(1);
        persona2.crecer(0.02);
        persona2.saludar("¡Hola");

        persona2.objetivo2();
    }
}
