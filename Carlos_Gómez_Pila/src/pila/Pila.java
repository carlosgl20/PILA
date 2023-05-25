package pila;

import java.util.ArrayList;
import java.util.HashMap;

public class Pila {


	ArrayList<Integer> numeros;

	public Pila() {

		numeros = new ArrayList<Integer>();

		for (int i = 0; i <= 30; i++) {

		}

	}


	// operación añadir número
	public void añadirNumero(int numero) {

		if (numeros.size() <= 30) {
			numeros.add(numero);
		}
	}

	// operación coger número
	public int cogerNumero(int numero) {

		if (numeros.contains(numero)) {
			numeros.get(numero);
			numeros.remove(numero);
		}
		return numero;

	}

	// operacion para comprobar si está llena
	public boolean estaLLena() {

		boolean lleno = false;
		if (numeros.size() == 30) {
			lleno = true;
		}
		return lleno;

	}

	// operación para comprobar si está vacía
	public boolean estaVacia() {

		return numeros.isEmpty();
	}

	// operacion para saber el numero de elementos
	public int numeroElementos() {

		return numeros.size();

	}


	@Override
	public String toString() {
		return "Pila " + numeros + "";
	}

	
	
	
}
