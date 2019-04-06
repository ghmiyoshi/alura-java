package br.com.alura;

import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

public class TesteCursoComAluno {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as cole��es do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com cole��es", 24));

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

		// Tem um pr�ximo elemento?
		while (iterador.hasNext()) {
			// Tem ent�o devolve o pr�ximo
			Aluno proximoAluno = iterador.next();
			System.out.println(proximoAluno);
		}

		// Vector - Pode ser usada por v�rias threads simultaneamente (thread-safe)
		Vector<Aluno> vetor = new Vector<>();

		Aluno turini = new Aluno("Rodrigo Turini", 34672);
		// System.out.println("O aluno " + turini + "est� matriculado?");
		System.out.println("E esse Turini, est� matriculado?");
		System.out.println(javaColecoes.estaMatriculado(turini));

		System.out.println("O a1 == ao Turini?");
		System.out.println(a1.equals(turini));

		// obrigatoriamente o seguinte � true:
		System.out.println(a1.hashCode() == turini.hashCode());

	}

}
