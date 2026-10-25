/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author alex
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ControladorColegioTest {

    @Test
    public void testAgregarEstudiante() {
        System.out.println("Ejecutando prueba: testAgregarEstudiante");
        
        ControladorColegio controlador = new ControladorColegio();
        
        controlador.agregarEstudiante("Ana", "Calle 3", "123", "01/01/2000", "EST01", "10A");
        
        // Generamos el reporte para ver si el estudiante realmente se guardó
        String reporte = controlador.generarReporteEstudiantes();
        
        assertNotNull(reporte, "El reporte no debería ser nulo");
        assertTrue(reporte.contains("Ana"), "El reporte debería contener el nombre de Ana");
    }
    
    @Test
    public void testAgregarProfesor() {
        System.out.println("Ejecutando prueba: testAgregarProfesor");
        
        ControladorColegio controlador = new ControladorColegio();
        
        // Agregamos un profesor de prueba
        controlador.agregarProfesor("Carlos", "Calle 4", "456", "01/01/1970", "CED01", "Quimica", 15, 30000.0);
        
        String reporte = controlador.generarReporteProfesores();
        
        assertNotNull(reporte, "El reporte no debería ser nulo");
        assertTrue(reporte.contains("Carlos"), "El reporte debería contener el nombre de Carlos");
    }

    @Test
    public void testGenerarReporteProfesoresOrdenado() {
        System.out.println("Ejecutando prueba: testGenerarReporteProfesoresOrdenado");
        
        ControladorColegio controlador = new ControladorColegio();
        
        controlador.agregarProfesor("Profesor Pobre", "Calle 5", "111", "01/01/1980", "C1", "Arte", 10, 10000.0);
        controlador.agregarProfesor("Profesor Rico", "Calle 6", "222", "01/01/1980", "C2", "Ingenieria", 10, 50000.0);
        
        String reporte = controlador.generarReporteProfesores();
        
        
        int posicionRico = reporte.indexOf("Profesor Rico");
        int posicionPobre = reporte.indexOf("Profesor Pobre");
        

        assertNotNull(reporte, "El reporte no debería ser nulo");
        
        // Afirmamos que el rico aparezca primero en el texto (posición menor)
        assertTrue(posicionRico < posicionPobre, "El profesor con mayor salario debería aparecer primero en el reporte");
    }
}
