package rodatge_v2;

import rodatge_v2.Especialidad;
import rodatge_v2.Participante;

public class Tecnico extends Participante {

	private int aExperiencia;
	private Especialidad especialidad;
	
	/**
	 * CONSTRUCTOR
	 * 
	 * @param nombre
	 * @param apellidos
	 * @param edad
	 * @param dni
	 * @param aExperiencia
	 * @param especialidad
	 */
	public Tecnico(String nombre, String apellidos, int edad, String dni, int aExperiencia, Especialidad especialidad) {
		// TODO
		super(nombre, apellidos, edad, dni);
		puedeRealizarEspecialidad(aExperiencia, especialidad);
	}
 
	/**
	 * GETTERS & SETTERS
	 */
	public int getaExperiencia() {
		return aExperiencia;
	}

	public void setaExperiencia(int aExperiencia) {
		this.aExperiencia = aExperiencia;
	}

	public Especialidad getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	} 
	
	/**
	 * Method to see if has enough experience to do this job.
	 * 
	 * @param aExperiencia
	 * @param especialidad
	 */
	public void puedeRealizarEspecialidad(int aExperiencia, Especialidad especialidad) {
		
		int esp = 0;
		Especialidad[] eCollection = {
				Especialidad.Sonido, 
				Especialidad.Luces, 
				Especialidad.Electrico, 
				Especialidad.Foquista, 
				Especialidad.Maquillaje, 
				Especialidad.Operador
		};
		
		for(int i = 0; i < eCollection.length; i++ ) {
			if(especialidad == eCollection[i]) esp = i;
		}
		
		switch(esp) {
			case 0:
				if (aExperiencia < 2) {
					throw new java.lang.Error("No tiene suficiente experiencia para esta especialidad.");
				} else {
					this.aExperiencia = aExperiencia;
					this.especialidad = especialidad;
				}
				break;
			case 1:
				if (aExperiencia < 3) {
					throw new java.lang.Error("No tiene suficiente experiencia para esta especialidad.");
				} else {
					this.aExperiencia = aExperiencia;
					this.especialidad = especialidad;
				}
			case 2:
				if (aExperiencia < 1) {
					throw new java.lang.Error("No tiene suficiente experiencia para esta especialidad.");
				} else {
					this.aExperiencia = aExperiencia;
					this.especialidad = especialidad;
				}
			case 3:
				if (aExperiencia < 4) {
					throw new java.lang.Error("No tiene suficiente experiencia para esta especialidad.");
				} else {
					this.aExperiencia = aExperiencia;
					this.especialidad = especialidad;
				}
				break;
			case 4:
				if (aExperiencia < 3) {
					throw new java.lang.Error("No tiene suficiente experiencia para esta especialidad.");
				} else {
					this.aExperiencia = aExperiencia;
					this.especialidad = especialidad;
				}
				break;
			case 5:
				if (aExperiencia < 2.5) {
					throw new java.lang.Error("No tiene suficiente experiencia para esta especialidad.");
				} else {
					this.aExperiencia = aExperiencia;
					this.especialidad = especialidad;
				}
				break;
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
				+ "Años experiencia: " + this.aExperiencia + "\n"
				+ "Especialidad: " + this.especialidad + "\n";
	}
	
	@Override
	public boolean equals(Object o) {
		return super.equals(o);
	}
	 
}
