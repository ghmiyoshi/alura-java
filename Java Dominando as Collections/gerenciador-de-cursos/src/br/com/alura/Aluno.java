package br.com.alura;

public class Aluno {
	private String nome;
	private int numeroMatricula;

	public String getNome() {
		return nome;
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	public Aluno(String nome, int numeroMatricula) {
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}
	
	@Override
	public String toString() {
		return "Nome: " + this.nome + " Matrícula: " + this.numeroMatricula;
	}

}
