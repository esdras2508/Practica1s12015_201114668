/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author esdras
 */
public class NodoUsr {
    String usuario, tipo;
    int personajes;
    NodoUsr siguiente;
    NodoPersonajes der;
    
    public NodoUsr(String usr, int pers, String tipo){
        this.usuario = usr;
        this.personajes = pers;
        this.tipo = tipo;
        this.siguiente = null;
        this.der = null;
    }
    
    public void enlazar(NodoUsr n){
        siguiente = n;
    }
    
    public String obtenerUsr(){
        return usuario;
    }
    
    public int obtenerPers(){
        return personajes;
    }
}
