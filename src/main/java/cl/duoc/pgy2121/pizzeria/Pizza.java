/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pgy2121.pizzeria;

/**
 *
 * @author Pedro
 */
public class Pizza {
    //atributos
    private String nombre, tamano, masa;

    public Pizza(String nombre, String tamano, String masa) {
        this.nombre = nombre;
        this.tamano = tamano;
        this.masa = masa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }
    
    //metodos
    public void preparar(){
        System.out.println("Se está preparando su Pizza");
    }
    
    public void calentar() {
        System.out.println("Se está horneando su Pizza");
    }
    
}
