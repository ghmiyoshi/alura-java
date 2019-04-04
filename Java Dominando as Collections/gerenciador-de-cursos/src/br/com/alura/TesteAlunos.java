package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class TesteAlunos {

	public static void main(String[] args) {
		Set<String> alunos = new HashSet<>();

		// 1) adicione alguns alunos
		alunos.add("Paulo");
		alunos.add("Alberto");
		alunos.add("Pedro");
		alunos.add("Nico");

		// 2) imprima o tamanho da colecao
		System.out.println(alunos.size());

		// 3) tente adicionar um aluno que existe
		boolean adicionou = alunos.add("Pedro");
		System.out.println("Pedro foi adicionado ao Set? " + adicionou);

		// 4) imprima novamente o tamanho da colecao
		System.out.println(alunos.size());

		for (String aluno : alunos) {
			System.out.println(aluno);
		}
	}

}
