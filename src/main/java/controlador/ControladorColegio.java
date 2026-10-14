/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author alex
 */
import modelo.Colegio;
import modelo.Estudiante;
import modelo.Profesor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ControladorColegio {
    private Colegio colegio = new Colegio();

    public void agregarEstudiante(String nombre, String dir, String tel, String fecha, String codigo, String grado) {
        Estudiante e = new Estudiante(nombre, dir, tel, fecha, codigo, grado);
        colegio.agregarEstudiante(e);
    }
    

    
}
