/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2018_09_03_aplicacionvisualalumnos;

/**
 *
 * @author aa504
 */
public class Alumno {
    // atributos
    private String nombre;
    private int tareas;
    private int proyectos;
    private int examen;
    
    //Constructores
    public Alumno(){
        nombre="No-id";
        tareas=0;
        proyectos=0;
        examen=0;
    }
    public Alumno(String nom,int tar,int proy, int exa){
        nombre=nom;
        tareas=tar;
        proyectos=proy;
        examen=exa;
    }
    
    //métodos get/set
    
    public void setNombre(String nom)
    {
      nombre = nom;  
    }
    
    public void setTareas(int tar)
    {
        tareas = tar;
    }
    
    public void setProyectos(int proy)
    {
        proyectos = proy;
    }
    
    public void setExamen(int exa)
    {
        examen = exa;
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public int getTareas()
    {
        return tareas;
    }
    
    public int getProyectos()
    {
        return proyectos;
    }
    
    public int getExamen()
    {
        return examen;
    }
    
    
    public double calcularCalificacion()
    {
        return tareas * 0.20 + proyectos * 0.35 + examen * 0.45;
    }
    
    public String toString(){
        return nombre+" Tareas: "+tareas+
                      " Proyecto: "+proyectos+
                      " Examen: "+examen;
    }
}
