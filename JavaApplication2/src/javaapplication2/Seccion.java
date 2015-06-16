/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author laboratorio
 */
public class Seccion {
    private int numeroSeccion;
    private Profesor profesorAsignado;
    private List<Estudiante> estudiantes;
    
    public Seccion(){
        estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante());
    }

    public Seccion(int numeroSeccion, Profesor profesorAsignado, List<Estudiante> estudiantes) {
        this.numeroSeccion = numeroSeccion;
        this.profesorAsignado = profesorAsignado;
        this.estudiantes = estudiantes;
    }

    public int getNumeroSeccion() {
        return numeroSeccion;
    }

    public void setNumeroSeccion(int numeroSeccion) {
        this.numeroSeccion = numeroSeccion;
    }

    public Profesor getProfesorAsignado() {
        return profesorAsignado;
    }

    public void setProfesorAsignado(Profesor profesorAsignado) {
        this.profesorAsignado = profesorAsignado;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
    
    
    
}
