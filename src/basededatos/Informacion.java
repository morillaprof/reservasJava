package basededatos;

import java.util.HashMap;

import modelo.Alojamiento;
import modelo.Persona;
import modelo.Viaje;

/**
 * Esta clase pretende alojar la información de alojamientos y clientes.
 * Simulamos lo que se almacenaría en una base de datos
 * @author morilla
 *
 */
public class Informacion {

	/**
	 * La clave sería el nombre del alojamiento
	 */
	public static HashMap<String, Alojamiento> alojamientosDisponibles;
	
	/**
	 * La clave sería el dni del cliente
	 */
	public static HashMap<String, Persona> clientela;
	
	/**
	 * En este atributo se almacenan los viajes de los clientes.
	 * Un solo viaje por cliente.
	 */
	public static HashMap<String, Viaje> viajes;
	
	/**
	 * Este método debe generar la información necesaria de manera adecuada y almacenarla en los atributos de la clase.
	 * 
	 * Por ejemplo, vamos a crear 50 alojamientos con datos genéricos del tipo nombre1, dirección1, ciudad1, pais1.
	 * Muy importante: es necesario rellenar el atributo plazasLibres de cada alojamiento. lo haremos con los 
	 * datos de los meses de julio y agosto de 2022 y un número aleatorio comprendido entre 0 y 54.
	 * 
	 * Para los clientes bastará con almacenar 30 registros con información genérica.
	 * 
	 */
	//TODO
	public void populate() {
		this.clientela = new HashMap<String, Persona>();
		this.alojamientosDisponibles = new HashMap<String, Alojamiento>();
		
		clientela.put("123", new Persona("Iván", "Morilla", "Párraga"));
		
		alojamientosDisponibles.put("sitio1", new Alojamiento());
				
	}
}
