 /* @autor: Edgar Falcó, Raúl Garrido, Abel Jornet
 * Fecha modificación: 08/02/2021
 */
package main;

import clases.*;

public class T18_Act4App {

	public static void main(String[] args) {
		
		Mysql.openConnection();
		Mysql.createDB("Cine");

		Mysql.createTable("Cine", "Peliculas", Inserciones.tablaPeliculas);
		Mysql.createTable("Cine", "Salas", Inserciones.tablaSalas);
		
		Mysql.insertData("Cine", "Peliculas", Inserciones.insercionTablaPeliculas);
		Mysql.insertData("Cine", "Salas", Inserciones.insercionTablaSalas);
		
		Mysql.getValues("Cine", "Peliculas");
		Mysql.deleteRecord("Cine", "Peliculas", 1);
		Mysql.getValues("Cine", "Peliculas");
		
		Mysql.closeConnection();
	}
}
