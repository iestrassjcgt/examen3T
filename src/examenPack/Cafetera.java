package examenPack;
/**
 * Genera un objeto de tipo Cafetera que implementa la interfaz InterfazCafetera
 * Añade sus propiedades capacidadMáxima y cantidadActual con sus métodos correspondientes
 * Con este objeto se podrá servirTaza, agregarCafe o bien servirTaza
 *
 * @author JoseCarlosGruesoToledano
 * @version Examen3T 1.0
 * @since 2021
 */
public class Cafetera implements InterfazCafetera {

    private int capacidadMaxima;
    private int cantidadActual;
    
    
    /**
     * Constructor de la clase Cafetera con dos parámetros. Genera un objeto 
     * Cafetera a partir de los parámetros indicados de capacidad y cantidad 
     * actual
     *
     * @param capacidadMaxima recibe la capacidad máxima de la nueva cafetera que será añadida a la propiedad capacidadMaxima
     * @param cantidadActual indica la cantidad actual con la que se genera la cafetera
     */
    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.cantidadActual = cantidadActual;
        this.capacidadMaxima = Math.max(capacidadMaxima, cantidadActual);
    }

    /**
     * Constructor de la clase Cafetera con un parámetro. Genera un objeto 
     * Cafetera a partir del parámetro capacidadMaxima
     *
     * @param capacidadMaxima recibe la capacidad máxima de la nueva cafetera 
     * que será añadida a la propiedad capacidadMaxima
     */
    public Cafetera(int capacidadMaxima) {
        this(capacidadMaxima, 0);
    }

    /**
     * Constructor de la clase Cafetera sin parámetros. Genera un objeto 
     * Cafetera default con una capacidadMaxima de 1000 y una cantidadActual 
     * de cero
     *
     */
    public Cafetera() {
        this(1000, 0);
    }


    /**
     * devuelve la capacidad máxima de un objeto Cafetera
     * @return devuelve un valor entero con la capacidad máxima de la cafetera
     */
    @Override
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    /**
     * modifica la capacidad máxima de café del objeto Cafetera
     * @param capacidadMaxima es un entero con la nueva capacidad de la cafetera
     */
    @Override
    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    /**
     * devuelve la cantidad actual de un objeto Cafetera
     * @return devuelve la cantidad actual de la cafetera
     */
    @Override
    public int getCantidadActual() {
        return cantidadActual;
    }

    /**
     * modifica la cantidad actual de café del objeto Cafetera
     * @param cantidadActual es un entero con la nueva cantidad de café 
     * de la cafetera
     */
    @Override
    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }


    /**
     * método que llena la cafetera igualando la capacidad máxima de la 
     * cafetera a la cantidad actual
     */
    @Override
    public void llenarCafetera() {
        setCantidadActual(getCapacidadMaxima());
    }



    /**
     * método que realiza el servido de una taza de café
     * resta de la cantidad actual un valor entero pasado por parámetro con 
     * el tamaño de la taza a llenar. Si la cantidad resultante es menor de 
     * cero devuelve una excepción
     * 
     * @param tamanoTaza es la cantidad de cafe a servir en la taza
     * @throws Exception si no hay café devuelve el mensaje No hay café
     */
    @Override
    public void servirTaza(int tamanoTaza) throws Exception {
        setCantidadActual(getCantidadActual() - tamanoTaza);
		if (getCantidadActual() <0){
			setCantidadActual(0);
 			throw new Exception("No hay café");
		}
    }
    
    /**
     * método que deja la cantidad de café a cero vaciando la Cafetera
     */
    @Override
    public void vaciarCafetera() {
        setCantidadActual(0);
    }

    /**
     * Método que llena la Cafetera con una cantidad entera recibida por parámetro
     * Si la nueva cantidad es mayor al máximo de capacidad, devuelve un error
     * 
     * @param cantidad cantidad con la que llenaremos la cafetera a sumar a la cantidadActual
     * @throws Exception si la nueva cantidad es mayor que el máximo, devuelve el mensaje, REBOSA
     */
    @Override
    public void agregarCafe(int cantidad) throws Exception {
        setCantidadActual(getCantidadActual() + cantidad);
		if (getCantidadActual() > getCapacidadMaxima()){
			setCantidadActual(getCapacidadMaxima());
 			throw new Exception("Rebosa");
		}

    }
}
