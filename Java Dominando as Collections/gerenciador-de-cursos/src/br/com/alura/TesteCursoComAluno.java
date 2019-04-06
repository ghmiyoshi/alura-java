package br.com.alura;

import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

public class TesteCursoComAluno {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 24));

		Aluno a1 = new Aluno("Rodrigo Turini", 34672);
		Aluno a2 = new Aluno("Guilherme Silveira", 5617);
		Aluno a3 = new Aluno("Nico Steppat", 17645);

		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);

		System.out.println("Alunos matriculados");

		// javaColecoes.getAlunos().forEach(aluno -> System.out.println(aluno));

		Set<Aluno> alunos = javaColecoes.getAlunos();
		Iterator<Aluno> iterador = alunos.iterator();

		// Tem um próximo elemento?
		while (iterador.hasNext()) {
			// Tem então devolve o próximo
			Aluno proximoAluno = iterador.next();
			System.out.println(proximoAluno);
		}

		// Vector - Pode ser usada por várias threads simultaneamente (thread-safe)
		Vector<Aluno> vetor = new Vector<>();

		Aluno turini = new Aluno("Rodrigo Turini", 34672);
		// System.out.println("O aluno " + turini + "está matriculado?");
		System.out.println("E esse Turini, está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(turini));

		System.out.println("O a1 == ao Turini?");
		System.out.println(a1.equals(turini));

		// obrigatoriamente o seguinte é true:
		System.out.println(a1.hashCode() == turini.hashCode());

	}

}
