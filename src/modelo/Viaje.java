package modelo;

import java.util.ArrayList;

public class Viaje {
	
	private double precio;
	private Persona cliente;
	private ArrayList<Alojamiento> destinos;
	
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public Persona getCliente() {
		return cliente;
	}
	public void setCliente(Persona cliente) {
		this.cliente = cliente;
	}
	public ArrayList<Alojamiento> getDestinos() {
		return destinos;
	}
	public void setDestinos(ArrayList<Alojamiento> destinos) {
		this.destinos = destinos;
	}
	
	/**
	 * Este método devolverá por consola un resumen del viaje en el que deberá mostrarse el nombre 
	 * completo del cliente, el precio final del viaje y el nombre de cada alojamiento junto con su dirección 
	 * y número de noches en cada alojamiento. 
	 */
	//TODO
	public String toString(){
		String salida = "";
		return salida;
	}
	
	/**
	 * Este método debe añadir el alojamiento a la lista de destinos del viaje
	 * También debe actualizar las plazas libres del alojamiento en esa fecha.
	 * @param a
	 * @param fecha
	 * @param noches
	 */
	//TODO
	public void reserva(Alojamiento a, String fecha, Integer noches) {
		
	}
	
 }
