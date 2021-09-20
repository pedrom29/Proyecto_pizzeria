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
public class Pizzeria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Bienvenido a mi pizzeria");

        
        Pizza pizza1 = new Pizza("Pollo Barbeqque", "grande", "gruesa");
        pizza1.calentar();
        pizza1.preparar();

        String nombre = pizza1.getNombre();
        System.out.println("El nombre de la pizza es: "+nombre);
        String tamanoInicial = pizza1.getTamano();
        System.out.println("El tamaño inicial de la pizza es: "+tamanoInicial);
        //Cambio de tamaño de pizza
        pizza1.setTamano("Chica");
        
        //Imprime nuevo tamaño
        String tamano = pizza1.getTamano();
        System.out.println("El tamaño final de su pizza es: "+tamano);

    }
    
}
