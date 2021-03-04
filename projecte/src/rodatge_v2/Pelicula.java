package rodatge_v2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import rodatge_v2.Papel;

public class Pelicula {
	
	private int id;
	private String titulo;
	private String genero;
	private String director;
	private int ano;
	private double presupuesto;
	private ArrayList<Escena> escenas = new ArrayList<Escena>();
	private HashSet<Escena> escenasHashSet = new HashSet<Escena>();
	private LinkedList<Participante> participantes = new LinkedList<Participante>();
	
	/**
	 * CONSTRUCTOR
	 * 
	 * @param id
	 * @param titulo
	 * @param director
	 * @param ano
	 * @param pressupuesto
	 */
	public Pelicula(int id, String titulo, String genero, String director, int ano, double presupuesto) {
		this.id = id;
		this.titulo = titulo;
		this.genero = genero;
		this.director = director;
		this.ano = ano;
		this.presupuesto = presupuesto;
	}

	public int getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getAno() {
		return ano;
	}

	public double getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(double presupuesto) {
		this.presupuesto = presupuesto;
	}

	public ArrayList<Escena> getEscenas() {
		return escenas;
	}

	public LinkedList<Participante> getParticipantes() {
		return participantes;
	}
	
	public HashSet<Escena> getEscenasHashSet() {
		return escenasHashSet;
	}
	
	/**
	 * FILM NEW SCENE AND ADD IT TO ARRAYLIST
	 * 
	 * @param tipo
	 * @param duracion
	 */
	public void rodarEscena(Tipo tipo, int duracion) {
		 int id = this.escenas.size() + 1;
		 Escena es = new Escena(id, tipo, duracion);
		 this.escenas.add(es);
	}
	
	public void rodarEscenaHashSet(Tipo tipo, int duracion) {
		 int id = this.escenasHashSet.size() + 1;
		 Escena es = new Escena(id, tipo, duracion);
		 this.escenasHashSet.add(es);
	}
	
	/**
	 * CALCULATE TOTAL COST OF SCENES
	 * 
	 * @return costeTotal
	 */
	public double costeTotalEscenas() {
		//TODO
		double costeTotal = 0;
		for (int i = 0; i < this.escenas.size(); i++) {
			costeTotal += this.escenas.get(i).getCoste();
		}
		return costeTotal;
	}
	
	/**
	 * CREATE NEW ACTOR AND ADD IT TO ARRAYLIST
	 * 
	 * @param nombre
	 * @param apellidos
	 * @param edad
	 * @param dni
	 * @param rodadoAnteriormente
	 * @param papel
	 */
	public void contratarActor(String nombre, String apellidos, int edad, String dni, boolean rodadoAnteriormente, Papel papel) {
		Actor e = new Actor(nombre, apellidos, edad, dni, rodadoAnteriormente, papel);
		this.participantes.add(e);
	}
	
	/**
	 * CREATE NEW TECNIC AND ADD IT TO ARRAYLIST
	 * 
	 * @param nombre
	 * @param apellidos
	 * @param edad
	 * @param dni
	 * @param aExperiencia
	 * @param especialidad
	 */
	public void contratarTecnico(String nombre, String apellidos, int edad, String dni, int aExperiencia, Especialidad especialidad) {
		Tecnico t = new Tecnico(nombre, apellidos, edad, dni, aExperiencia, especialidad);
		this.participantes.add(t);
	}
	
	/**
	 * CALCULATE DURATION
	 */
	public String duracionPelicula() {
		int duracion = 0;
		for(Escena e : escenas) {
			duracion += e.getDuracion();
		}
		return duracion + "min";
	}
	
	/**
	 * CHECK IF IT'S POSSIBLE TO FILM THE MOVIE
	 */
	public boolean rodarPelicula() {
		if (this.costeTotalEscenas() > this.presupuesto) {
			return false;
		} else {
			return true;
		}
	}
	
	/**
	 * TO STRING 
	 */
	@Override
	public String toString() {
		return "" +
				"\n PELICULA \n" +
				"===================\n" +
				"id: " + this.id + "\n" +
				"Titulo: " + this.titulo + "\n" +
				"Genero: " + this.genero + "\n" +
				"Director: " + this.director + "\n" + 
				"Año: " + this.ano + "\n" +
				"Duracion: " + this.duracionPelicula() + "\n" +
				"Total participantes: " + this.getParticipantes().size() + "\n" +
				"Total escenas: " + this.getEscenas().size() + "\n" +
				"Presupuesto: " + this.presupuesto + "\n" +
				"Coste total: " + this.costeTotalEscenas() + "\n" +
				"Se puede rodar? " + this.rodarPelicula() + "\n";
	}
	
}

