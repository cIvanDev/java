package main.manejoarchivos;

import static main.utileria.Archivos.*;
public class ManejoArchivos {

		
	private static final String NOMBRE_ARCHIVO = "/home/ivan/java_testu/testu.txt";
	
	public static void main(String[] args) {
		//
		crearArchivo(NOMBRE_ARCHIVO);
		
		//
		escribirArchivo(NOMBRE_ARCHIVO);
		
		//
		leerArchivo(NOMBRE_ARCHIVO);
		
		//
		anexarArchivo(NOMBRE_ARCHIVO);
		
		//
		leerArchivo(NOMBRE_ARCHIVO);
	}
}
