package br.com.banco.bytebank.teste.util;

import java.util.Arrays;
import java.util.List;

public class TesteTransformarArrayEmLista {

	public static void main(String[] args) {
		Integer[] numeros = new Integer[5];
		numeros[0] = 0;
		numeros[1] = 1;
		numeros[2] = 2;
		numeros[3] = 3;
		numeros[4] = 4;

		List<Integer> argumentos = Arrays.asList(numeros);
		System.out.println(argumentos);
	}

}
