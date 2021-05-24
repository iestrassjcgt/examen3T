/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenPack;

/**
 * Genera una interfaz del objeto de tipo Cafetera con todos sus métodos
 *
 * @author JoseCarlosGruesoToledano
 * @version Examen3T 1.0
 * @since 2021
 */
public interface InterfazCafetera {

    /**
     * Método que llena la Cafetera con una cantidad entera recibida por parámetro
     * Si la nueva cantidad es mayor al máximo de capacidad, devuelve un error
     * 
     * @param cantidad cantidad con la que llenaremos la cafetera a sumar a la cantidadActual
     * @throws Exception si la nueva cantidad es mayor que el máximo, devuelve el mensaje, REBOSA
     */
    void agregarCafe(int cantidad) throws Exception;

    /**
     * devuelve la cantidad actual de un objeto Cafetera
     * @return devuelve la cantidad actual de la cafetera
     */
    int getCantidadActual();

    /**
     * devuelve la capacidad máxima de un objeto Cafetera
     * @return devuelve un valor entero con la capacidad máxima de la cafetera
     */
    int getCapacidadMaxima();

    /**
     * método que llena la cafetera igualando la capacidad máxima de la 
     * cafetera a la cantidad actual
     */    
    void llenarCafetera();

    /**
     * método que realiza el servido de una taza de café
     * resta de la cantidad actual un valor entero pasado por parámetro con 
     * el tamaño de la taza a llenar. Si la cantidad resultante es menor de 
     * cero devuelve una excepción
     * 
     * @param tamanoTaza es la cantidad de cafe a servir en la taza
     * @throws Exception si no hay café devuelve el mensaje No hay café
     */    
    void servirTaza(int tamanoTaza) throws Exception;

    /**
     * modifica la cantidad actual de café del objeto Cafetera
     * @param cantidadActual es un entero con la nueva cantidad de café 
     * de la cafetera
     */
    void setCantidadActual(int cantidadActual);

    /**
     * modifica la capacidad máxima de café del objeto Cafetera
     * @param capacidadMaxima es un entero con la nueva capacidad de la cafetera
     */
    void setCapacidadMaxima(int capacidadMaxima);

    /**
     * método que deja la cantidad de café a cero vaciando la Cafetera
     */    
    void vaciarCafetera();
    
}
