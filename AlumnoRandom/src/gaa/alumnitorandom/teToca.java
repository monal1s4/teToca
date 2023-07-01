package gaa.alumnitorandom;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class teToca {
	public static void main(String[] args) {
		Map<String, String> alumnos = new HashMap<>();

		// Agregar alumnos al mapa
		alumnos.put("Alexander Castro Fuentes", "");
		alumnos.put("Arantza Valeria Mena Jorquera", "");
		alumnos.put("Axel Damian Llancapan Llancapan", "");
		alumnos.put("BASTIAN ALEXIS IBANEZ BOBADILLA", "");
		alumnos.put("Benjamin Delfín Riquelme Gómez", "");
		alumnos.put("Benjamín Ignacio Aliste Paredes", "");
		alumnos.put("Camilo Fabio Díaz Suárez", "");
		alumnos.put("Camilo Hormazabal", "");
		alumnos.put("Carla Laura de Lourdes Cabello Gálvez", "");
		alumnos.put("Catalina Javiera Choppelo Salazar", "");
		alumnos.put("Catalina Ignacia Diaz Rojas", "");
		alumnos.put("Catalina Katiuska Fuenzalida coli", "");
		alumnos.put("Cristóbal Moreno Henriquez", "");
		alumnos.put("Danae Mariel Miranda Navarro", "");
		alumnos.put("Daniel Ignacio Figueroa Alvarez", "");
		alumnos.put("Diego Alexis Durán Quintana", "");
		alumnos.put("Diego Isaac Alberto Rodríguez Montenegro", "");
		alumnos.put("Fabian Palma", "");
		alumnos.put("Fabiola Aracely Leal Comapayante", "");
		alumnos.put("Favio Vergara Diaz", "");
		alumnos.put("Felipe arriagada melo", "");
		alumnos.put("Germain Eliu Sepulveda Villalobos", "");
		alumnos.put("Ignacio Antonio Miranda Arévalo", "");
		alumnos.put("Isis Alondra Cea Lafferte", "");
		alumnos.put("Javier Eduardo Gomez Lopez", "");
		alumnos.put("Javiera Constanza Vásquez Astete", "");
		alumnos.put("Jean Gordóniz (Ipad de Rogier)", "");
		alumnos.put("Jesus Simon Villalobos Inostroza", "");
		alumnos.put("Jorge Ivan Chavez Vera", "");
		alumnos.put("kalfukoyam kiñetrur treuquil calfumil", "");
		alumnos.put("Leonardo Norambuena Brauer", "");
		alumnos.put("Lian Christopher Esperguells Torres", "");
		alumnos.put("Luis Antonio Cabrera Gómez", "");
		alumnos.put("Manuel Alejandro Jeldes Duran", "");
		alumnos.put("Marcela Sofía Mena González", "");
		alumnos.put("Mariana Catalina Morales Muñoz", "");
		alumnos.put("Mario Alonso Valdivia Galarce", "");
		alumnos.put("Mirko Aryan Ibañez Morales", "");
		alumnos.put("Natalia Soledad Hormazábal Núñez", "");
		alumnos.put("Nicolas David Araneda Castillo", "");
		alumnos.put("Nicolás Williams Perez Baeza", "");
		alumnos.put("Nils Ignacio Palma Ramos", "");
		alumnos.put("Patricio Abarca Guerra", "");
		alumnos.put("Renzo Gonzales Cuya", "");
		alumnos.put("Sebastián Javier González Lagos", "");
		alumnos.put("Thiare Molly Barrios Rubio", "");
		alumnos.put("Tomas Hertz Acevedo", "");

		String alumnoSeleccionado = seleccionarAlumnoAleatorio(alumnos);
		System.out.println("Alumno seleccionado: " + alumnoSeleccionado);
	}

	private static String seleccionarAlumnoAleatorio(Map<String, String> alumnos) {
		String[] keys = alumnos.keySet().toArray(new String[0]);
		Random random = new Random();
		int indiceAleatorio = random.nextInt(keys.length);
		return keys[indiceAleatorio];
	}
}
