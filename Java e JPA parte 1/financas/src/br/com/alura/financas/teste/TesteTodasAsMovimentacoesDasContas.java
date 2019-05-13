package br.com.alura.financas.teste;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.alura.financas.modelo.Conta;
import br.com.alura.financas.util.JPAUtil;

public class TesteTodasAsMovimentacoesDasContas {

	public static void main(String[] args) {

		EntityManager manager = new JPAUtil().getEntityManager();
		manager.getTransaction().begin();
		
	    // JOIN FETCH - O Hibernate faz um INNER JOIN que traz somente as contas que possuem movimentação
		// Quer dizer que queremos juntar, nesta query, a conta e a movimentação
		// Substituir o comportamento Lazy por Eager Loading
		
        // LEFT JOIN - Traz tudo que está do lado ESQUERDO do JOIN, ou seja as Contas mesmo que não tenha movimentação
		// DISTINCT - Dizer ao banco que queremos apenas os resultados diferentes 
		String jpql = "SELECT DISTINCT c FROM Conta c LEFT JOIN FETCH c.movimentacoes";
		
		Query query = manager.createQuery(jpql);
		
		List<Conta> todasAsMovimentacoes = query.getResultList(); // Retorna uma lista
		
		for (Conta conta : todasAsMovimentacoes) {
			System.out.println("Titular: " + conta.getTitular());
			System.out.println("Movimentações: " + conta.getMovimentacoes());
		}
		
		manager.getTransaction().commit();
		manager.close();
	}

}
