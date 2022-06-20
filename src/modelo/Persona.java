package modelo;

public class Persona {
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String dni;

	// Visualizadores y modificadores
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	// toString
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + "]";
	}

	// Constructor sin parámetros
	public Persona() {}
	
	// Constructor con parámetros
	public Persona(String nombre, String apellido1, String apellido2) {
		this.nombre 	= nombre;
		this.apellido1 	= apellido1;
		this.apellido2 	= apellido2;
	}
	
	/**
	 * Este método deberá buscar al cliente en la clientela de la empresa y devolverlo.
	 * @param dni - Para buscar el cliente trabajaremos con su dni
	 * @return - Instancia de la clase Persona con la información del cliente buscado
	 */
	//TODO
	public static Persona buscarCliente(String dni) {
		return new Persona();
	}

}
