/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProfesorTest1 {

    @Test
    public void testCalcularSalarioTotal() {
        System.out.println("Ejecutando prueba: testCalcularSalarioTotal");
        
        // Datos: 10 horas dictadas a $50.000 la hora
        Profesor profe = new Profesor(
                "Juan Perez", "Calle 1", "300123", "01/01/1980", 
                "12345", "Matematicas", 10, 50000.0
        );

        /* 
         Cálculo esperado:
         Salario Base: 10 * 50.000 = 500.000
         Bono Preparación (30%): 500.000 * 0.30 = 150.000
         Salario Devengado: 500.000 + 150.000 = 650.000
         Prestaciones (19% del devengado): 650.000 * 0.19 = 123.500
         Salario Total (Devengado + Prestaciones): 650.000 + 123.500 = 773.500
        */
        
        double resultadoEsperado = 773500.0;
        double resultadoReal = profe.getSalarioTotal();

        // El 0.01 es el "delta" (margen de error permitido por los decimales de tipo double)
        assertEquals(resultadoEsperado, resultadoReal, 0.01, "El salario total no es el esperado");
    }

    @Test
    public void testGetPrestaciones() {
        System.out.println("Ejecutando prueba: testGetPrestaciones");
        
        // Datos: 20 horas a $40.000
        Profesor profe = new Profesor(
                "Maria Gomez", "Calle 2", "310456", "02/02/1985", 
                "54321", "Fisica", 20, 40000.0
        );

        /* 
         Cálculo esperado:
         Salario Base: 20 * 40.000 = 800.000
         Devengado (Base + 30%): 800.000 * 1.30 = 1.040.000
         Prestaciones (19% del devengado): 1.040.000 * 0.19 = 197.600
        */
        
        double resultadoEsperado = 197600.0;
        double resultadoReal = profe.getPrestaciones();

        assertEquals(resultadoEsperado, resultadoReal, 0.01, "Las prestaciones no son las esperadas");
    }
}