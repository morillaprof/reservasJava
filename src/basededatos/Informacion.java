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
	 * Para almacenar la información de los alojamientos utilizamos un Mapa.
	 * La clave sería el nombre del alojamiento y referenciaría un objeto de la clase Alojamiento
	 */
	public static HashMap<String, Alojamiento> alojamientos;
	
	/**
	 * Para almacenar la información de los clientes utilizamos un mapa.
	 * La clave sería el dni del cliente y referenciaría a un objeto de clase Persona.
	 */
	public static HashMap<String, Persona> clientela;
	
	/**
	 * En este atributo de tipo Mapa se almacenan los viajes de los clientes.
	 * Un solo viaje por cliente.
	 */
	public static HashMap<String, Viaje> viajes;
	
	/**
	 * Este método debe generar la información necesaria de manera adecuada y almacenarla en los atributos de la clase.
	 * 
	 * Por ejemplo, vamos a crear 50 alojamientos con datos genéricos del tipo nombre1, dirección1, ciudad1, pais1.
	 * Muy importante: es necesario rellenar el atributo plazasLibres de cada alojamiento. Lo haremos con los 
	 * datos de los meses de julio y agosto de 2022 y un número aleatorio comprendido entre 0 y 54. 
	 * Fuerza que algún alojamiento no tenga plazas libres alguno de los días.
	 * 
	 * Para los clientes bastará con almacenar 30 registros con información genérica.
	 * 
	 * Los viajes pueden dejarse vacíos
	 * 
	 */
	//TODO
	public void populate() {
		
				
	}
}
