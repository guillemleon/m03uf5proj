package rodatge_v2;

import rodatge_v2.Cloneable;
import rodatge_v2.DurationExceedsLimits;
import rodatge_v2.Escena;
import rodatge_v2.Tipo;

public class Escena implements Cloneable {
		
	private int id;
	private Tipo tipo;
	private int duracion;
	private double coste;
		
	/*
	* CONSTRUCTOR
	*/
	public Escena(int id, Tipo tipo, int duracion) {
		this.id = id;
		this.tipo = tipo;
		if(duracion > 20) {
			throw new DurationExceedsLimits();
		} else {
			this.duracion = duracion;
		}
		calculaCoste(tipo);
	}
	
	/*
	 * GETTERS
	 * 
	 * returns attribute value
	 */
	public int getId() {
		return this.id;
	}
	
	public Tipo getTipo() {
		return this.tipo;
	}
	
	public int getDuracion() {
		return this.duracion;
	}
	
	public double getCoste() {
		return this.coste;
	}
	
	/*
	 * SETTERS
	 * 
	 * set attribute value
	 */
	public void setDuracion(int duracion) {
		if(duracion > 20) {
			throw new DurationExceedsLimits();
		} else {
			this.duracion = duracion;
		}
	}
	
	public void setCoste(double coste) {
		this.coste = coste;
	}
	
	// OTHER METHODS
	 
	/**
	 * Calculate cost of scene
	 * 
	 * @param NO
	 * 
	 * no return
	 */
	public void calculaCoste(Tipo tipo) {
		int genero = 0;
		Tipo[] tCollection = {
				Tipo.Accion, 
				Tipo.Aventuras, 
				Tipo.Drama, 
				Tipo.Horror, 
				Tipo.Ficcion, 
				Tipo.Romantica, 
				Tipo.Terror
		};
		
		for(int i = 0; i < tCollection.length; i++ ) {
			if(tipo == tCollection[i]) genero = i;
		}
		
		switch(genero) {
			case 0:
				this.coste = 12000;
				break;
			case 1:
				this.coste = 8000;
				break;
			case 2:
				this.coste = 3000;
			case 3:
				this.coste = 7000;
				break;
			case 4:
				this.coste = 9000;
				break;
			case 5:
				this.coste = 2000;
				break;
			case 6:
				this.coste = 7500;
				break;
		}
	}
	
	public String toString() {
		// TODO
		return ""
				+ "ESCENA: \n"
				+ "====================\n"
				+ "id: " + this.id + "\n"
				+ "tipo: " + this.tipo + "\n"
				+ "duracion: " + this.duracion + "min  \n"
				+ "coste: " + this.coste + "\n";
	}
	
	@Override
	public Object clone(){
        Escena clone = new Escena(this.id, this.tipo, this.duracion);
        return clone;
    }


}
