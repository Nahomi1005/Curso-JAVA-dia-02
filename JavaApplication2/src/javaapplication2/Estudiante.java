/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.logging.Logger;

/**
 *
 * @author laboratorio
 */
public class Estudiante extends Persona {
    
    private String fichAcademica;
    private String carrera;

   
    public Estudiante(String fichAcademica, String carrera, String nombre, int edad, char sexo) {
        super(nombre, edad, sexo);
        this.fichAcademica = fichAcademica;
        this.carrera = carrera;
    }

    public Estudiante(String fichAcademica, String carrera) {
        super();
        this.fichAcademica = fichAcademica;
        this.carrera = carrera;
    }


    public Estudiante() {
        super();
    }
    
    public String getFichAcademica() {
        return fichAcademica;
    }

    public void setFichAcademica(String fichAcademica) {
        this.fichAcademica = fichAcademica;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return super.toString()
        +"\nFicha Academica : "+fichAcademica+"\nCarrera : "+carrera;
    }
    
    
    
}
