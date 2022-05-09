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
public class Ejecutor02 {

    public static void main(String[] args) {
        // se crea un de tipo UnidadDVD
        String marca = "Toshiba";
        double costo = 200;
        UnidadDVD unidad = new UnidadDVD(marca, costo);

        // se crea el objeto de tipo Computadora
        String procesador = "Intel";
        
        Computadora computadora = new Computadora(procesador, unidad);
        
        String variable_marca = computadora.obtenerTipoProcesador();
        UnidadDVD variable_unidad = computadora.obtenerUnidadDvd();
        //String variable_unidad = computadora.obtenerUnidadDvd().obtenerMarca();
       
        System.out.printf("Computadora:\nProcesador: %s\n"
                + "Unidad de DVD: %s\n",
                variable_marca,
                variable_unidad.obtenerMarca());
        
        UnidadDVD unidad2 = new UnidadDVD("Sony", 20);
        computadora.establecerUnidadDvd(unidad2);
        System.out.println("---------------------------");
        System.out.printf("Computadora:\nProcesador: %s\n"
                + "Unidad de DVD: %s\n",
                variable_marca,
                variable_unidad.obtenerMarca()/*,variable_unidad*/);
    }

}
