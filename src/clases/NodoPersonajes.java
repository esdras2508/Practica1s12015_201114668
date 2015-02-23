/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author esdras
 */
public class NodoPersonajes {
    
    String nombre, img, tipo;
    int puntos, cantidad;
    NodoPersonajes siguiente, anterior;
    
    public NodoPersonajes(String nombre, String img, String tipo, int puntos, int cantidad){
        this.nombre = nombre;
        this.img = img;
        this.tipo = tipo;
        this.puntos = puntos;
        this.cantidad = cantidad;
        this.siguiente = null;
        this.anterior = null;
    }
    
    public void enlazar(NodoPersonajes n){
        siguiente = n;
    }
    
}
