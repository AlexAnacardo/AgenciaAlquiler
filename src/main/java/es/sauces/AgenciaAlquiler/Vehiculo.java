/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.sauces.AgenciaAlquiler;

import java.util.Objects;

/**
 *
 * @author daw1
 */
public class Vehiculo {
    private String matricula;
    private Grupo grupo;
    
    public Vehiculo (String matricula, Grupo Grupo){
        this.matricula=matricula;
        this.grupo=grupo;
    }
    
    @Override
    public String toString(){
        return "Vehiculo{"+"matricula: "+matricula+" grupo: "+grupo+'}';
    }
    
    @Override
    public boolean equals(Object o){
         if (this == o){
            return true;
        }
        if(o==null){
            return false;
        }
         if (getClass().getGenericSuperclass() != o.getClass().getGenericSuperclass()) {
            return false;
        }
        final Vehiculo other = (Vehiculo) o;
        return Objects.equals(this.matricula, other.matricula); 
    }
    
    @Override
        public int compareTo (Vehiculo v){
            return 0;
        }
        
        public float getPrecioAlquiler (int dias){
            return PrecioAlquiler;
        }
        
        public float getPrecioAlquiler(){
            return PrecioAlquiler;
        }
    
}
