package rodatge_v2;

import rodatge_v2.Papel;
import rodatge_v2.Participante;

public class Actor extends Participante {

	private boolean rodadoAnteriormente;
	private Papel papel;
	
	/**
	 * CONSTRUCTOR
	 * 
	 * @param nombre
	 * @param apellidos
	 * @param edad
	 * @param dni
	 * @param rodadoAnteriormente
	 * @param papel
	 */
	public Actor(String nombre, String apellidos, int edad, String dni, boolean rodadoAnteriormente, Papel papel) {
		// TODO Auto-generated constructor stub
		super(nombre, apellidos, edad, dni);
		if (puedeRodar(edad)) {
			this.rodadoAnteriormente = rodadoAnteriormente;
			this.papel = papel;
		} else {
			throw new java.lang.Error("El actor no cumple los requisitos de edad para participar en la pelicula.");
		}
	}
	
	/*
	 * GETTERS & SETTERS
	 */
	public boolean getRodadoAnteriormente() {
		return this.rodadoAnteriormente;
	}
	
	public void setRodadoAnteriormente(boolean rodadoAnteriormente) {
		this.rodadoAnteriormente = rodadoAnteriormente;
	}
	
	public Papel getPapel() {
		return this.papel;
	}
	
	public void setPalel(Papel papel) {
		this.papel = papel;
	}
	
	public boolean puedeRodar(int edad) {
		if (edad >= 18) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * TO STRING
	 */
	@Override
	public String toString() {
		// TODO
		return ""
				+ super.toString() + "\n"
				+ "Rodado anteriormente: " + this.rodadoAnteriormente + "\n"
				+ "Papel: " + this.papel + "\n";
	} 
	
	@Override
	public boolean equals(Object o) {
		return super.equals(o);
	}

}
