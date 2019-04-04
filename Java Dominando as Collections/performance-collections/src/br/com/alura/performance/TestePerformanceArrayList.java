package br.com.alura.performance;

import java.util.ArrayList;
import java.util.Collection;

public class TestePerformanceArrayList {
	public static void main(String[] args) {
		Collection<Integer> numeros = new ArrayList<>();

		long inicioInsercao = System.currentTimeMillis();

		for (int i = 0; i <= 500000; i++) {
			numeros.add(i);
		}

		long fimInsercao = System.currentTimeMillis();

		long tempoDeExecucaoInsercao = fimInsercao - inicioInsercao;

		System.out.println("Tempo gasto na inser��o: " + tempoDeExecucaoInsercao);

		long inicioBusca = System.currentTimeMillis();

		for (Integer numero : numeros) {
			numeros.contains(numero);
		}

		long fimBusca = System.currentTimeMillis();

		long tempoDeExecucaoBusca = fimBusca - inicioBusca;

		System.out.println("Tempo gasto na busca: " + tempoDeExecucaoBusca);

	}

}
