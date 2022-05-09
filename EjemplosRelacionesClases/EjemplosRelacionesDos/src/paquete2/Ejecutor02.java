/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class Ejecutor02 {
    
    public static void main(String[] args) {
        
        //crear una persona de barrio el valle de la ciudad de loja
        // crear una persona del barrio central de la ciudad de cuenca
        //crear una persona del barrio centenario de la ciudad de guayaquil
        
        Ciudad ciudad1 = new Ciudad("Loja");
        Ciudad ciudad2 = new Ciudad("Cuenca");
        Ciudad ciudad3 = new Ciudad("Guayaquil");
        
        Barrio barrio1 = new Barrio("El Valle", ciudad1);
        Barrio barrio2 = new Barrio("Central", ciudad2);
        Barrio barrio3 = new Barrio ("Centenario",ciudad3);
        
        Persona persona1 = new Persona("René Elizalde", "1100909909", barrio1);
        Persona persona2 = new Persona("René Elizalde", "1100909909", barrio2);
        Persona persona3 = new Persona("René Elizalde", "1100909909", barrio3);
        
        System.out.println("------------------------------------------");
        System.out.printf("El barrio de la persona: \n%s es: %s\nY pertenece a la "
                + "ciudad: %s\n",persona1.obtenerNombre(),
                persona1.obtenerBarrio().obtenerNombre(),
                persona1.obtenerBarrio().obtenerCiudad().obtenerNombre());
        System.out.println("------------------------------------------");
        
        System.out.println("------------------------------------------");
        System.out.printf("El barrio de la persona: \n%s es: %s\nY pertenece a la "
                + "ciudad: %s\n",persona2.obtenerNombre(),
                persona2.obtenerBarrio().obtenerNombre(),
                persona2.obtenerBarrio().obtenerCiudad().obtenerNombre());
        System.out.println("------------------------------------------");
        
        System.out.println("------------------------------------------");
        System.out.printf("El barrio de la persona: \n%s es: %s\nY pertenece a la "
                + "ciudad: %s\n",persona3.obtenerNombre(),
                persona3.obtenerBarrio().obtenerNombre(),
                persona3.obtenerBarrio().obtenerCiudad().obtenerNombre());
        System.out.println("------------------------------------------");
       
     
    }
    
}

