/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

/**
 *
 * @author reroes
 */
public class Ejecutor03 {

    public static void main(String[] args) {
        
        // se crea un de tipo UnidadDVD
        String marca = "Toshiba";
        double costo = 8500.24;
        UnidadDVD unidad = new UnidadDVD(marca, costo);

        // se crea el objeto de tipo Computadora
        String procesador = "Intel";
        
       
        
        Computadora computadora = new Computadora(procesador, unidad);
        
        System.out.printf("Computadora:\nProcesador: %s\n"
                + "Unidad de DVD: %s\n"
                + "Costo de Unidad DVD: %.2f\n",
                computadora.obtenerTipoProcesador(),
                computadora.obtenerUnidadDvd().obtenerMarca(),
                computadora.obtenerUnidadDvd().obtenerCosto());
        
    }

}
