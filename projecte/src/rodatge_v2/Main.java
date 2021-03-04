package rodatge_v2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.TreeMap; 

public class Main {

	public static void main(String[] args) throws IOException {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		/**
		 * PELICULA JUANA DE ARCO
		 */
		Pelicula juanaDeArco = new Pelicula(1, "Juana de Arco", "Historica", "Luc Besson", 1999, 50000);
		
		// AÑADIR ACTORES Y TECNICOS A LA PELICULA JUANA DE ARCO
		juanaDeArco.contratarActor("Milla", "Jovovich", 37, "48857263L", true, Papel.Principal);
		juanaDeArco.contratarActor("Marc", "Perez", 24, "48224263Y", true, Papel.Principal);
		juanaDeArco.contratarActor("Marti", "Martinez", 21, "48857244L", true, Papel.Secundario);
		juanaDeArco.contratarActor("Julia", "Casas", 25, "29583792G", true, Papel.Secundario);
		juanaDeArco.contratarActor("Anna", "Palau", 57, "92856283P", false, Papel.Secundario);
		juanaDeArco.contratarActor("Sasha", "Garcia", 53, "42257263L", true, Papel.Secundario);
		juanaDeArco.contratarActor("Pere", "Prats", 29, "84834289G", true, Papel.Extra);
		juanaDeArco.contratarActor("Mireia", "Gonzalez", 62, "39493583K", false, Papel.Extra);
		juanaDeArco.contratarActor("Adria", "Fernandez", 34, "83483492Y", true, Papel.Extra);
		juanaDeArco.contratarActor("Eric", "Querol", 36, "11254902T", true, Papel.Especialista);
		juanaDeArco.contratarActor("Alicia", "Tomas", 52, "48857221G", false, Papel.Doble);
		juanaDeArco.contratarTecnico("Paula", "Perez", 51, "42457221K", 5, Especialidad.Electrico);
		juanaDeArco.contratarTecnico("Enric", "Gomez", 42, "25123221G", 7, Especialidad.Luces);
		juanaDeArco.contratarTecnico("Victor", "Sanchez", 46, "82474284Y", 5, Especialidad.Luces);
		juanaDeArco.contratarTecnico("Javier", "Martinez", 33, "28214289P", 4, Especialidad.Sonido);
		juanaDeArco.contratarTecnico("Pol", "Pujol", 27, "27774721J", 5, Especialidad.Electrico);
		juanaDeArco.contratarTecnico("Hector", "Albert", 23, "92398489L", 4, Especialidad.Operador);
		juanaDeArco.contratarTecnico("Sergi", "Garcia", 44, "21734219G", 7, Especialidad.Foquista);
		juanaDeArco.contratarTecnico("Pablo", "Motos", 39, "92924821S", 4, Especialidad.Maquillaje);
		
		// AÑADIR ESCENAS A LA PELICULA JUANA DE ARCO
		juanaDeArco.rodarEscena(Tipo.Accion, 5);
		juanaDeArco.rodarEscena(Tipo.Drama, 6);
		juanaDeArco.rodarEscena(Tipo.Drama, 7);
		juanaDeArco.rodarEscena(Tipo.Aventuras, 5);
		juanaDeArco.rodarEscena(Tipo.Romantica, 4);
		juanaDeArco.rodarEscena(Tipo.Aventuras, 6);
		juanaDeArco.rodarEscena(Tipo.Accion, 8);
		juanaDeArco.rodarEscena(Tipo.Accion, 5);
		juanaDeArco.rodarEscena(Tipo.Accion, 7);
		juanaDeArco.rodarEscena(Tipo.Aventuras, 2);
		juanaDeArco.rodarEscena(Tipo.Aventuras, 6);
		juanaDeArco.rodarEscena(Tipo.Accion, 7);
		juanaDeArco.rodarEscena(Tipo.Drama, 9);
		
		
		/**
		 * PELICULA MR NOBODY
		 */
		Pelicula mrNobody = new Pelicula(2, "Las vidas posibles de Mr Nobody", "Ciencia Ficción", "Jaco Van Dormael", 2010, 90000);
		
		// AÑADIR ACTORES Y TECNICOS A LA PELICULA MR NOBODY
		mrNobody.contratarActor("Jared", "Leto", 24, "48224263Y", true, Papel.Principal);
		mrNobody.contratarActor("Marti", "Martinez", 21, "48857244L", true, Papel.Secundario);
		mrNobody.contratarActor("Anna", "Palau", 57, "92856283P", false, Papel.Secundario);
		mrNobody.contratarActor("Sasha", "Garcia", 53, "42257263L", true, Papel.Secundario);
		mrNobody.contratarActor("Pere", "Prats", 29, "84834289G", true, Papel.Extra);
		mrNobody.contratarActor("Adria", "Fernandez", 34, "83483492Y", true, Papel.Extra);
		mrNobody.contratarActor("Eric", "Querol", 36, "11254902T", true, Papel.Especialista);
		mrNobody.contratarActor("Alicia", "Tomas", 52, "48857221G", false, Papel.Doble);
		mrNobody.contratarTecnico("Paula", "Perez", 51, "42457221K", 5, Especialidad.Electrico);
		mrNobody.contratarTecnico("Enric", "Gomez", 42, "25123221G", 7, Especialidad.Luces);
		mrNobody.contratarTecnico("Pol", "Pujol", 27, "27774721J", 5, Especialidad.Electrico);
		mrNobody.contratarTecnico("Hector", "Albert", 23, "92398489L", 4, Especialidad.Operador);
		mrNobody.contratarTecnico("Sergi", "Garcia", 44, "21734219G", 7, Especialidad.Foquista);
		mrNobody.contratarTecnico("Pablo", "Motos", 39, "92924821S", 4, Especialidad.Maquillaje);
		
		// AÑADIR ESCENAS A LA PELICULA MR NOBODY
		mrNobody.rodarEscena(Tipo.Ficcion, 5);
		mrNobody.rodarEscena(Tipo.Drama, 8);
		mrNobody.rodarEscena(Tipo.Drama, 2);
		mrNobody.rodarEscena(Tipo.Aventuras, 4);
		mrNobody.rodarEscena(Tipo.Romantica, 6);
		mrNobody.rodarEscena(Tipo.Aventuras, 7);
		mrNobody.rodarEscena(Tipo.Romantica, 4);
		mrNobody.rodarEscena(Tipo.Ficcion, 9);
		mrNobody.rodarEscena(Tipo.Romantica, 10);
		mrNobody.rodarEscena(Tipo.Drama, 9);
		mrNobody.rodarEscena(Tipo.Aventuras, 7);
		mrNobody.rodarEscena(Tipo.Drama, 7);
		mrNobody.rodarEscena(Tipo.Ficcion, 9);

		
        System.out.println("1 - EXEMPLE ITERATOR");
        System.out.println("2 - MOSTRA MRNOBODY I ALGUNES ALTRES DADES");
        System.out.println("3 - MOSTRA JUANA DE ARCO I ALGUNES ALTRES DADES");
        System.out.println("4 - EJEMPLO CLONABLE");
        System.out.println("5 - EJEMPLO ESCENA CON HASHSET");
        System.out.println("6 - EJEMPLO TREEMAP");
        System.out.println("7 - EJEMPLO HASHMAP");
        System.out.println("8 - GUARDAR PARTICIPANTE EN UN FICHERO");
        System.out.println("9 - LEER FICHERO DE PARTICIPANTES");
        System.out.println("10 - GUARDAR ESCENA EN UN FICHERO");
        System.out.println("11 - LEER FICHERO DE ESCENAS");
        
        System.out.println("Selecciona una opcio: ");
        int option = sc.nextInt();
        
        switch(option) {
        	case 1:
                ListIterator<Participante> list_Iter = mrNobody.getParticipantes().listIterator(2); 
          
                System.out.println("ITERATOR:"); 
                while(list_Iter.hasNext()){ 
                   System.out.println(list_Iter.next().toString()); 
                } 
        		break;
        	case 2:
        		// MOSTRAR PELICULA MR NOBODY Y ALGUNOS OTROS DATOS
        		System.out.println("============== MR NOBODY ==============");
        		System.out.println(mrNobody.toString());
        		System.out.println(mrNobody.getEscenas().get(3).toString());
        		System.out.println(mrNobody.getParticipantes().get(1).toString());
        		System.out.println(mrNobody.getParticipantes().get(12).toString());
        		break;
        	case 3: 
        		// MOSTRAR PELICULA JUANA DE ARCO Y ALGUNOS OTROS DATOS
        		System.out.println("============== JUANA DE ARCO ==============");
        		System.out.println(juanaDeArco.toString());
        		System.out.println(juanaDeArco.getEscenas().get(1).toString());
        		System.out.println(juanaDeArco.getParticipantes().get(2).toString());
        		System.out.println(juanaDeArco.getParticipantes().get(13).toString());
        		break;
        	case 4:
        		Escena e = new Escena(1, Tipo.Accion, 10);
        		Escena e2 = new Escena(2, Tipo.Drama, 9);
        		Escena e3 = (Escena)e.clone();
        		
        		System.out.println("=========== EJEMPLO CLONEABLE ===========");
        		System.out.println(e.toString());
        		System.out.println(e2.toString());
        		System.out.println(e3.toString());
        		break;
        	case 5:
        		mrNobody.rodarEscenaHashSet(Tipo.Aventuras, 7);
        		mrNobody.rodarEscenaHashSet(Tipo.Aventuras, 7);
        		mrNobody.rodarEscenaHashSet(Tipo.Ficcion, 9);
        		
				System.out.println(mrNobody.getEscenasHashSet());
        		break;
        	case 6: 
                TreeMap<Integer, String> treeMapParticipants = new TreeMap<Integer, String>(); 
          
                // Inserting the Elements 
                treeMapParticipants.put(3, "Participant 3"); 
                treeMapParticipants.put(1, "Participant 2"); 
                treeMapParticipants.put(2, "Participant 1");
          
                System.out.println(treeMapParticipants); 
                break;
        	case 7:
        		 HashMap<String, String> hashMapParticipants = new HashMap<>(); 
        		  
    	        // Add elements to the map 
    		 	hashMapParticipants.put(mrNobody.getParticipantes().get(0).getNombre(), mrNobody.getParticipantes().get(0).getDni()); 
    	        hashMapParticipants.put(mrNobody.getParticipantes().get(1).getNombre(), mrNobody.getParticipantes().get(0).getDni()); 
    	        hashMapParticipants.put(mrNobody.getParticipantes().get(2).getNombre(), mrNobody.getParticipantes().get(0).getDni()); 
    	        
    	        System.out.println(hashMapParticipants);
    	        break;
        	case 8:
        		// create file
        		File file_participantes = new File("file_participantes.txt");
        		// create a file writer class
        		FileWriter fw = new FileWriter(file_participantes);
        		// create a print writer class
        		PrintWriter pw = new PrintWriter(fw);
        		
        		System.out.print("Nombre: ");
        		String name = sc.next();
        		System.out.print("Apellido: ");
        		String lastName = sc.next();
        		System.out.print("Edad: ");
        		int age = sc.nextInt();
        		System.out.print("DNI: ");
        		String dni = sc.next();
        		System.out.print("Experiencia?(S/N): ");
        		String experience = sc.next();
        		boolean exp = false;
        		if(experience.toLowerCase() == "s") {
        			exp = true; 
        		}
        		System.out.print("Papel?(P/S/D/E) ");
        		String role = sc.next();
        		Papel p = Papel.Principal;
        		if(role.toLowerCase() == "s") {
        			p = Papel.Secundario;
        		}
        		if(role.toLowerCase() == "d") {
        			p = Papel.Doble;
        		}
        		if(role.toLowerCase() == "e") {
        			p = Papel.Especialista;
        		}
        		pw.println("Nombre: " + name);
        		pw.println("Apellido: " + lastName);
        		pw.println("Edad: " + age);
        		pw.println("DNI: " + dni);
        		pw.println("Experiencia: " + exp);
        		pw.println("Papel: " + p);
        		pw.close();
        		break;
        	case 9:
        		File f = new File("file_participantes.txt");
        		Scanner scan = new Scanner(f);
        		while(scan.hasNextLine()) {
        			System.out.println(scan.nextLine());
        		}
        		break;
        	case 10:
        		File file_escenas = new File("file_escenas.txt");
        		FileWriter fwEscenas = new FileWriter(file_escenas);
        		PrintWriter pwEscenas = new PrintWriter(fwEscenas);
        		
        		System.out.print("Tipo (aventura/accion/drama/terror/...): ");
        		String tipo = sc.next();
        		System.out.print("Duracion: ");
        		String duracion = sc.next();
      
        		pwEscenas.println("Tipo: " + tipo + ", Duracion: " + duracion);
        		pwEscenas.close();
        		break;
        	case 11:
        		File fEscena = new File("file_escenas.txt");
        		Scanner scanEscena = new Scanner(fEscena);
        		while(scanEscena.hasNextLine()) {
        			System.out.println(scanEscena.nextLine());
        		}
        		break;
        	case 12:
        		Generica_1<Integer> i = new Generica_1<Integer>(1);
        		System.out.println(i.toString());
        		Generica_1<String> s = new Generica_1<String>("Projecte JAVA");
        		System.out.println(s);
        }
	}

}
