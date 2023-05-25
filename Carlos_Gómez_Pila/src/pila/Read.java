package pila;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Read {

	public static final String FICHERO1 = "E:\\Carlos\\Users\\salida1.txt";

	BufferedReader entradaFichero;
	ArrayList<Integer> numeros;

	public ArrayList<Integer> getDatos() {

		try {

			entradaFichero = new BufferedReader(new FileReader(FICHERO1));

			numeros = new ArrayList<Integer>();

			int numero = Integer.parseInt(entradaFichero.readLine());

			while (numero != 0) {

				numero = Integer.parseInt(entradaFichero.readLine());
			}

			entradaFichero.close();

		} catch (IOException e) {
			System.out.println("El error es el siguiente: " + e.getMessage());
			
		} catch (Exception e) {
			// Otros problemas
			e.printStackTrace();
		}

		return numeros;
	}
}
