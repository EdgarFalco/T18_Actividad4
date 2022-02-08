/* @autor: Edgar Falcó, Raúl Garrido, Abel Jornet
 * Fecha modificación: 08/02/2021
 */
package clases;

public class Inserciones {

	public static String tablaPeliculas = "(Codigo int unsigned NOT NULL AUTO_INCREMENT, "
			  + "Nombre varchar(100) DEFAULT NULL, "
			  + "CalificacionEdad int DEFAULT NULL, "
			  + "PRIMARY KEY (Codigo))";

	public static String tablaSalas = "(Codigo int unsigned NOT NULL AUTO_INCREMENT, "
			  + "Nombre varchar(100) DEFAULT NULL, "
			  + "Pelicula int unsigned DEFAULT NULL, "
			  + "PRIMARY KEY (Codigo), "
			  + "KEY Pelicula (Pelicula), "
			  + "CONSTRAINT Salas_ibfk_1 FOREIGN KEY (Pelicula) REFERENCES Peliculas (Codigo) "			  
			  + "ON DELETE CASCADE);";
				
	public static String insercionTablaPeliculas = "(Nombre, CalificacionEdad) values "
			+ "('Piratas', 18),"
			+ "('Giant', 18),"
			+ "('Oliver', 12),"
			+ "('Twist', 12),"
			+ "('Matriz', 18);";
	
	public static String insercionTablaSalas = "(Nombre, Pelicula) values "
			+ "('Sala1', 1),"
			+ "('Sala2', 3),"
			+ "('Sala5', 2),"
			+ "('SalaV', 4),"
			+ "('Sala9', 5);";	
}

