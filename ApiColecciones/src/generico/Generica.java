/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generico;

/**
 *
 * @author Alumno mañana
 */
public class Generica<T> {
 
    
  private T  objeto;

    public Generica(T objeto) {
        this.objeto = objeto;
    }
  
    public void obtenerTipo(){
      System.out.println("tipo" + objeto.getClass().getSimpleName());
        
        
    }
    
    
}
