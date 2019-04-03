package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteListas {

	public static void main(String[] args) {
		String aula1 = "Conhecendo mais de listas";
		String aula2 = "Modelando a classe aula";
		String aula3 = "Trabalhando com Cursos e Sets";

		List<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);

		System.out.println(aulas);

		System.out.println("\nListando com foreach");
		for (String aula : aulas) {
			System.out.println(aula);
		}

		aulas.add("Aumentando nosso conhecimento");

		Collections.sort(aulas);

		System.out.println("\nListando com lambdas");
		aulas.forEach(aula -> System.out.println(aula));

		String primeiraAula = aulas.get(0);
		System.out.println("\nPrimeira aula: " + primeiraAula);

		System.out.println(aulas.size());

	}

}
