package br.com.banco.bytebank.teste.util;

import java.util.ArrayList;

import br.com.banco.bytebank.modelo.Conta;
import br.com.banco.bytebank.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {

		// Generics
		ArrayList<Conta> lista = new ArrayList<>();

		Conta cc = new ContaCorrente(123, 456);
		lista.add(cc);

		Conta cc2 = new ContaCorrente(789, 198);
		lista.add(cc2);

		Conta cc3 = new ContaCorrente(789, 198);

		boolean existe = lista.contains(cc3);

		System.out.println(existe);

		for (Conta conta : lista) {
			if (conta.equals(cc3)) {
				System.out.println("São iguais!");
			}
		}

		for (Conta conta : lista) {
			System.out.println(conta);
		}

	}

}
