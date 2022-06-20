package modelo;

import java.util.HashMap;

import basededatos.Informacion;

public class Alojamiento {

	//Atributos
	private String nombre;
	private String direccion;
	private String ciudad;
	private String pais;
	/**
	 * Este atributo de tipo mapa almacena claves que representan fechas con formato: dd_mm_aa.
	 * El valor almacenado por cada key es el n�mero de plazas libres en dicha fecha.
	 */
	private HashMap<String, Integer> plazasLibres;
	
	//Getters and Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public HashMap<String, Integer> getPlazasLibres() {
		return plazasLibres;
	}
	public void setPlazasLibres(HashMap<String, Integer> plazasLibres) {
		this.plazasLibres = plazasLibres;
	}
	
	/**
	 * Este m�todo deber� buscar en la informaci�n disponible el alojamiento que tenga como nombre
	 * el que se le pasa como par�metro.
	 * OJO, hay que controlar el caso en el que no se encuentre el alojamiento 
	 */
	//TODO
	public static Alojamiento buscaAlojamiento(String nombre) {
		Alojamiento a = null;
		return a;
	}
	
	/**
	 * Este m�todo recibe un String con la fecha y el n�mero de plazas a reservar.
	 * Devolver� true si es posible atender la petici�n o false en otro caso.
	 */
	//TODO
	public Boolean consultaDisponibilidad(String fecha, Integer noches, Integer plazas){
		Boolean disponible = Boolean.FALSE;
		return disponible;
	}
	
		
}
