/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author alex
 */
import java.util.ArrayList;

public class Colegio {
    private ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
    private ArrayList<Profesor> listaProfesores = new ArrayList<>();

    public void agregarEstudiante(Estudiante e) {
        listaEstudiantes.add(e);
    }

    public void agregarProfesor(Profesor p) {
        listaProfesores.add(p);
    }

    public ArrayList<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public ArrayList<Profesor> getListaProfesores() {
        return listaProfesores;
    }
}
