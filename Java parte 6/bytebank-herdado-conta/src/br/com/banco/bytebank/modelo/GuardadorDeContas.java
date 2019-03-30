package br.com.banco.bytebank.modelo;

public class GuardadorDeContas {
	private Conta[] referencias;
	private int posicaoLivre;

	public GuardadorDeContas() {
		this.referencias = new Conta[10];
		this.posicaoLivre = 0;
	}

	public void adiciona(Conta conta) {
		this.referencias[posicaoLivre] = conta;
		this.posicaoLivre++;
	}

	public int getQuantidadeDeElementos() {
		return this.posicaoLivre;
	}
	
	public Conta getReferencia(int posicao) {
		return this.referencias[posicao];
		
	}

}
