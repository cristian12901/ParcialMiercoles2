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
    
    public void agregarProfesor(String nombre, String dir, String tel, String fecha, String cedula, String area, int horas, double salarioHora) {
        Profesor p = new Profesor(nombre, dir, tel, fecha, cedula, area, horas, salarioHora);
        colegio.agregarProfesor(p);
    }

    public String generarReporteEstudiantes() {
        StringBuilder sb = new StringBuilder();
        sb.append("Lista de estudiantes \n");
        for (Estudiante e : colegio.getListaEstudiantes()) {
            sb.append(e.mostrarInformacion()).append("\n");
        }
        return sb.toString();
    }
    
    public String generarReporteProfesores() {
        ArrayList<Profesor> profesoresOrdenados = new ArrayList<>(colegio.getListaProfesores());
        
        Collections.sort(profesoresOrdenados, new Comparator<Profesor>() {
            @Override
            public int compare(Profesor p1, Profesor p2) {
                return Double.compare(p2.getSalarioTotal(), p1.getSalarioTotal());
            }
        });
    
        StringBuilder sb = new StringBuilder();
        sb.append("Profesores ordenados por salario (Mayor a Menor) \n");
        for (Profesor p : profesoresOrdenados) {
            sb.append(p.mostrarInformacion())
              .append("Prestaciones: ").append(p.getPrestaciones()).append("\n");
        }
        return sb.toString();
    }
}
