/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author laboratorio
 */
public class Profesor extends Persona {
    
    private String profesion;
    private String anioExperiencia;

    public Profesor(String profesion, String anioExperiencia) {
        this.profesion = profesion;
        this.anioExperiencia = anioExperiencia;
    }

    public Profesor(String profesion, String anioExperiencia, String nombre, int edad, char sexo) {
        super(nombre, edad, sexo);
        this.profesion = profesion;
        this.anioExperiencia = anioExperiencia;
    }

    
    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getAnioExperiencia() {
        return anioExperiencia;
    }

    public void setAnioExperiencia(String anioExperiencia) {
        this.anioExperiencia = anioExperiencia;
    }
    
      @Override
    public String toString() {
        return super.toString()
        +"\nProfesion : "+profesion+"\nAños de Experiencia : "+anioExperiencia;
    }
}
