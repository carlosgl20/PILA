package pila;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Write {

	public static final String FICHERO2 = "E:\\Carlos\\Users\\salida2.txt";

	BufferedWriter escribirFichero;

	public void escribirDatos(ArrayList<Integer> numeros) throws IOException {

		escribirFichero = new BufferedWriter(new FileWriter(FICHERO2));

		Iterator<Integer> iterator = numeros.iterator();
		while (iterator.hasNext()) {
			iterator.next();
			
			Pila pila = new Pila();
			escribirFichero.write(Integer.parseInt());
			escribirFichero.newLine();
		}
		escribirFichero.close();

	}

}
