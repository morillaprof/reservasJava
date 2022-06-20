package basededatos;

import java.util.HashMap;

import modelo.Alojamiento;
import modelo.Persona;
import modelo.Viaje;

/**
 * Esta clase pretende alojar la informaci�n de alojamientos y clientes.
 * Simulamos lo que se almacenar�a en una base de datos
 * @author morilla
 *
 */
public class Informacion {

	/**
	 * Para almacenar la informaci�n de los alojamientos utilizamos un Mapa.
	 * La clave ser�a el nombre del alojamiento y referenciar�a un objeto de la clase Alojamiento
	 */
	public static HashMap<String, Alojamiento> alojamientos;
	
	/**
	 * Para almacenar la informaci�n de los clientes utilizamos un mapa.
	 * La clave ser�a el dni del cliente y referenciar�a a un objeto de clase Persona.
	 */
	public static HashMap<String, Persona> clientela;
	
	/**
	 * En este atributo de tipo Mapa se almacenan los viajes de los clientes.
	 * Un solo viaje por cliente.
	 */
	public static HashMap<String, Viaje> viajes;
	
	/**
	 * Este m�todo debe generar la informaci�n necesaria de manera adecuada y almacenarla en los atributos de la clase.
	 * 
	 * Por ejemplo, vamos a crear 50 alojamientos con datos gen�ricos del tipo nombre1, direcci�n1, ciudad1, pais1.
	 * Muy importante: es necesario rellenar el atributo plazasLibres de cada alojamiento. Lo haremos con los 
	 * datos de los meses de julio y agosto de 2022 y un n�mero aleatorio comprendido entre 0 y 54. 
	 * Fuerza que alg�n alojamiento no tenga plazas libres alguno de los d�as.
	 * 
	 * Para los clientes bastar� con almacenar 30 registros con informaci�n gen�rica.
	 * 
	 * Los viajes pueden dejarse vac�os
	 * 
	 */
	//TODO
	public void populate() {
		
				
	}
}
