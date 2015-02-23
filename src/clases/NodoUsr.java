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
    String usuario;
    int personajes;
    NodoUsr siguiente;
    NodoPersonajes der;
    
    public NodoUsr(String usr, int pers){
        this.usuario = usr;
        this.personajes = pers;
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
