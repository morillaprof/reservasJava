package modelo;

import java.util.ArrayList;
import java.util.Date;

public class Viaje {
	
	private double precio;
	private Persona cliente;
	private Date fechaI;
	private Date fechaF;
	/**
	 * En este atributo se almacenarán los diferentes alojamientos en los que dormirá el cliente.
	 * Si pasa más de una noche en el mismo Alojamiento se repetirá el objeto en la lista.
	 */
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
	public Date getFechaI() {
		return fechaI;
	}
	public void setFechaI(Date fechaI) {
		this.fechaI = fechaI;
	}
	public Date getFechaF() {
		return fechaF;
	}
	public void setFechaF(Date fechaF) {
		this.fechaF = fechaF;
	}
	public ArrayList<Alojamiento> getDestinos() {
		return destinos;
	}
	public void setDestinos(ArrayList<Alojamiento> destinos) {
		this.destinos = destinos;
	}
	
	
	/**
	 * Este método devolverá por consola un resumen del viaje en el que deberá mostrarse el nombre 
	 * completo del cliente, el precio final del viaje, el nombre de cada alojamiento junto con su dirección 
	 * y la fecha en la que el cliente se hospeda en cada alojamiento. 
	 */
	//TODO
	public String toString(){
		String salida = "";
		return salida;
	}
	
	/**
	 * Este método debe añadir el alojamiento a la lista de destinos del viaje siempre y cuando esté disponible.
	 * También debe actualizar las plazas libres del alojamiento en esa fecha.
	 * @param a
	 * @param fecha
	 * @param noches
	 */
	//TODO
	public void reserva(Alojamiento a, String fecha, Integer noches) {
		
	}
	
 }
