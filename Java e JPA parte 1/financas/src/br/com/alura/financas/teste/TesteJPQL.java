package br.com.alura.financas.teste;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.alura.financas.modelo.Conta;
import br.com.alura.financas.modelo.Movimentacao;
import br.com.alura.financas.modelo.TipoMovimentacao;
import br.com.alura.financas.util.JPAUtil;

public class TesteJPQL {

	public static void main(String[] args) {
		
		EntityManager manager = new JPAUtil().getEntityManager();
		manager.getTransaction().begin();

		Conta conta = new Conta();
		conta.setId(2);

		// JPQL - Java Persist Query Language
		String jpql = "SELECT m FROM Movimentacao m WHERE m.conta = :pConta" + " AND m.tipo = :pTipo"
				+ " ORDER BY m.valor DESC";

		// Usamos os setParameter para atribuir na query acima
		Query query = manager.createQuery(jpql);
		query.setParameter("pConta", conta);
		query.setParameter("pTipo", TipoMovimentacao.ENTRADA);

		List<Movimentacao> resultados = query.getResultList(); // Retorna uma lista
		for (Movimentacao movimentacao : resultados) {
			System.out.println("Movimentação: " + movimentacao.getDescricao());
			System.out.println("Conta.id: " + movimentacao.getConta().getId());
		}

		manager.getTransaction().commit();
		manager.close();
	}

}
