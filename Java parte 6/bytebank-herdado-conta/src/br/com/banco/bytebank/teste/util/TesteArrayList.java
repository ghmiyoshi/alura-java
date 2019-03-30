package br.com.banco.bytebank.teste.util;

import java.util.ArrayList;
import java.util.List;

import br.com.banco.bytebank.modelo.Conta;
import br.com.banco.bytebank.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {

		// Generics
		List<Conta> lista = new ArrayList<>();

		Conta cc = new ContaCorrente(123, 456);
		Conta cc2 = new ContaCorrente(789, 198);

		lista.add(cc);
		lista.add(cc2);

		System.out.println("Tamanho: " + lista.size());

		Conta ref = lista.get(0);
		System.out.println("Número: " + ref.getNumero());

		// lista.remove(1);

		System.out.println("Tamanho: " + lista.size());

		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}

		System.out.println("---------------------");

		for (Conta conta : lista) {
			System.out.println(conta);

		}

	}

}
