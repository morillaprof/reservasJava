package modelo;

import java.util.ArrayList;
import java.util.Date;

public class Viaje {
	
	private double precio;
	private Persona cliente;
	private Date fechaI;
	private Date fechaF;
	/**
	 * En este atributo se almacenar�n los diferentes alojamientos en los que dormir� el cliente.
	 * Si pasa m�s de una noche en el mismo Alojamiento se repetir� el objeto en la lista.
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
	 * Este m�todo devolver� por consola un resumen del viaje en el que deber� mostrarse el nombre 
	 * completo del cliente, el precio final del viaje, el nombre de cada alojamiento junto con su direcci�n 
	 * y la fecha en la que el cliente se hospeda en cada alojamiento. 
	 */
	//TODO
	public String toString(){
		String salida = "";
		return salida;
	}
	
	/**
	 * Este m�todo debe a�adir el alojamiento a la lista de destinos del viaje siempre y cuando est� disponible.
	 * Tambi�n debe actualizar las plazas libres del alojamiento en esa fecha.
	 * @param a
	 * @param fecha
	 * @param noches
	 */
	//TODO
	public void reserva(Alojamiento a, String fecha, Integer noches) {
		
	}
	
 }
