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
public class Universidad {
    public static final String nombre = "UNEG";
    public static final String ubicacion = "Atlantico";
    
    private List<Carrera> carreras;//Lista declarada, está vacia
    
    public Universidad() {
        carreras = new ArrayList<>();//Lista creada
        carreras.add(new Carrera()); //Se le agrega un "nodo" de tipo carrera, pero esta carrera está vacía
    
    }

    public Universidad(List<Carrera> carreras) {
        this.carreras = carreras;
    }

    public List<Carrera> getCarreras() {
        return carreras;
    }

    public void setCarreras(List<Carrera> carreras) {
        this.carreras = carreras;
    }

    @Override
    public String toString() {
        String result = 
        
        return result
    }
    
    
 
}
