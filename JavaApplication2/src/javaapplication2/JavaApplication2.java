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
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Persona p1 = new Persona("Nahomi", 20,'f');
        Estudiante e1 = new Estudiante("2331324", "Ing. Informatica", p1.getNombre(), p1.getEdad(), p1.getSexo());
        Profesor pro1 = new Profesor("Ingeniero", "14", p1.getNombre(), p1.getEdad(),p1.getSexo());
        
        System.out.println("Persona: "+p1);
        System.out.println("Estudiante: "+p1);
        System.out.println("Profesor: "+p1);
        System.out.println("Universidad: "+Universidad.nombre);*/
        
        Universidad univ =Carrera(); //Creas Universidad
        Carrera carr = new Carrera(); //Creas Carrera
        carr.setNombre("Ing. Informatica");//Le cambias el nombre
        univ.getCarreras().add(carr);//Añades a la lista
        
        //Creas un Porfesor
        Persona p1 = new Persona("Nahomi", 20,'f');
        Profesor pro1 = new Profesor("Ingeniero", "14", p1.getNombre(), p1.getEdad(),p1.getSexo());
        
        
        Materia  materia = new Materia(); //Creas una Materia
        materia.setNombre("Programacion");//Le cambias el nombre
        
        for (int i= 0; i< 10; i++) {
         //Creas secciones y les asignas profesores  
         Seccion seccion  = new Seccion(); 
         seccion.setNumeroSeccion(i+1);
         seccion.setProfesorAsignado(pro1);
         
         //Agregas estudiantes
         for (int j = 0; j<10; j++){
             Estudiante e = new Estudiante("1123",carr.getNombre(), "estudiante"+j, 20, 'f');
             
             seccion.getEstudiantes().add(e);
         }
         
         materia.getSecciones().add(seccion);//Agregas secciones a las lista de materias
    }
        
        //Agregas materias a las lista de Pensum
        Pensum pensum = new Pensum();
        pensum.getSecciones().add(materia);
        carr.setPensum(pensum);
       
    }

    private static Universidad Carrera() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
