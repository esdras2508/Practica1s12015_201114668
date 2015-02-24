/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author esdras
 */
public class listaUsr {
    
    NodoUsr raiz;
    int size;
    
    public listaUsr(){
        raiz = null;
        size = 0;
    }
    
    public boolean vacia(){
        return (raiz == null)?true:false;
    }
    
    public String obtenerTipo(int pos){
        int c = 0;
        NodoUsr temp = raiz;
        while(c<pos){
            temp = temp.siguiente;
            c++;
        }
        return temp.tipo;
    }
    
    public String obtenerJugador(int pos){
        int c = 0;
        NodoUsr temp = raiz;
        while(c<pos){
            temp = temp.siguiente;
            c++;
        }
        return temp.usuario;
    }
    
    public int obtenerPersonajes(int pos){
        int c = 0;
        NodoUsr temp = raiz;
        while(c<pos){
            temp = temp.siguiente;
            c++;
        }
        return temp.personajes;
    }
    
    
    public void add(String nombre, int personajes, String info){
        if(raiz == null){
            raiz = new NodoUsr(nombre, personajes, info);
            System.out.println("agregado en raiz");
        }else{
            NodoUsr temp = raiz;
            NodoUsr nuevo = new NodoUsr(nombre, personajes, info);
            nuevo.enlazar(temp);
            raiz = nuevo;
            System.out.println("agregado");
        }
        size++; 
    }
    
    public int size(){
        return size;
    }
    //crear lista usr para poder crear lista personajes
}
