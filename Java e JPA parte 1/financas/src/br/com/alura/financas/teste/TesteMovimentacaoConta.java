package br.com.alura.financas.teste;

import javax.persistence.EntityManager;

import br.com.alura.financas.modelo.Conta;
import br.com.alura.financas.modelo.Movimentacao;
import br.com.alura.financas.util.JPAUtil;

public class TesteMovimentacaoConta {

	public static void main(String[] args) {

		EntityManager manager = new JPAUtil().getEntityManager();
		manager.getTransaction().begin();

		Movimentacao movimentacao = manager.find(Movimentacao.class, 2);
		Conta conta = movimentacao.getConta();

		System.out.println("Titular: " + conta.getTitular());
		System.out.println("Movimentação: " + conta.getMovimentacoes().size()); 
		// Faz um SELECT para buscar as contas e quando percorrer todas, para cada uma delas, e feito um getMovimentacoes
		// ou seja irá fazer uma outra query para buscar as movimentacoes

		manager.getTransaction().commit();
		manager.close();
	}

}
