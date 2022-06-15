package pruebas;

import basededatos.Informacion;
import modelo.Alojamiento;
import modelo.Persona;
import modelo.Viaje;

public class Test {

	public static void main(String[] args) {
		
		//TODO
		//Consultamos la BBDD
		Informacion bbdd = new Informacion();
		bbdd.populate();
		
		
		//Creamos viaje
		Viaje v1 = new Viaje();
		
		//Asignamos cliente desde la lista de clientela
		//v1.setCliente();
		
		//Buscamos alojamiento por nombre
		Alojamiento.buscaAlojamiento(null);
		
		//Comprobamos disponibilidad
		Alojamiento.buscaAlojamiento(null).consultaDisponibilidad(null, null);
		
		//Reservamos
		v1.reserva(null, null, null);
		
		//Almacenamos el viaje en su sitio
		bbdd.viajes.put(null, v1);
	}

}
