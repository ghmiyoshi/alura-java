package br.com.banco.bytebank.teste;

import br.com.banco.bytebank.modelo.Conta;
import br.com.banco.bytebank.modelo.ContaCorrente;
import br.com.banco.bytebank.modelo.GuardadorDeContas;

public class TesteGuardador {

	public static void main(String[] args) {
		GuardadorDeContas guardador = new GuardadorDeContas();

		Conta cc = new ContaCorrente(123, 456);
		
		guardador.adiciona(cc);
		
		int tamanho = guardador.getQuantidadeDeElementos();
		System.out.println(tamanho);
		
		Conta ref = guardador.getReferencia(0);
		System.out.println(ref);
		
		
	}
}
