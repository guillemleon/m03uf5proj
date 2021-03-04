package rodatge_v2;

import rodatge_v2.ExceptionDniFormatError;
import rodatge_v2.Participante;

public abstract class Participante {

	protected String nombre;
	protected String apellidos;
	protected int edad;
	protected String dni;
	
	/**
	 * CONSTRUCTOR
	 * 
	 * @param nombre
	 * @param apellidos
	 * @param edad
	 * @param dni
	 */
	public Participante(String nombre, String apellidos, int edad, String dni) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		checkDNI(dni);
	}
	
	/*
	 * GETTERS
	 */
	public String getNombre() {
		return this.nombre;
	}
	
	public String getApellidos() {
		return this.apellidos;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	public String getDni() {
		return this.dni;
	}
	
	/**
	 * Method equals.
	 * 
	 * @param p 
	 * 
	 * @return true if two instances of Participante have the same DNI. False otherwise.
	 */
	@Override
	public boolean equals(Object o) {
		
		if (this == o) return true;
		if (!(o instanceof Participante)) return false;
		
		Participante p = (Participante)o;
		
		if (this.dni == p.dni) {
			throw new java.lang.Error("El participante que intentas añadir ya existe.");
		}
		
		return (this.dni == p.dni);
		
	}
	
	/**
	 * Method toString
	 * 
	 * returns Participant as a String.
	 */
	@Override
	public String toString() {
		// TODO
		return ""
				+ "PARTICIPANTE: \n"
				+ "====================\n"
				+ "Nombre: " + this.nombre + "\n"
				+ "Apellidos: " + this.apellidos + "\n"
				+ "Edad: " + this.edad + " \n"
				+ "DNI: " + this.dni + "\n";
	}
	
	public void checkDNI(String dni) {
		String dniPattern = "^[0-9]{8}[TRWAGMYFPDXBNJZSQVHLCKE]$";
		
		if ( dni.matches(dniPattern) ) {
			this.dni = dni;
		} else {
			throw new ExceptionDniFormatError();
		}
	}
	
	
}
