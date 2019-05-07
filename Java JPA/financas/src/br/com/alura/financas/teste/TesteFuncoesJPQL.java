package br.com.alura.financas.teste;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.alura.financas.modelo.Conta;
import br.com.alura.financas.modelo.Movimentacao;
import br.com.alura.financas.modelo.TipoMovimentacao;
import br.com.alura.financas.util.JPAUtil;

public class TesteFuncoesJPQL {

	public static void main(String[] args) {
		
		EntityManager manager = new JPAUtil().getEntityManager();
		manager.getTransaction().begin();

		Conta conta = new Conta();
		conta.setId(2);

		// JPQL - Java Persist Query Language
		String jpqlSoma = "SELECT SUM(m.valor) FROM Movimentacao m WHERE m.conta = :pConta" + " AND m.tipo = :pTipo"
				+ " ORDER BY m.valor DESC";
		
		String jpqlMedia = "SELECT AVG(m.valor) FROM Movimentacao m WHERE m.conta = :pConta" + " AND m.tipo = :pTipo"
				+ " ORDER BY m.valor DESC";

		// Usamos os setParameter para atribuir na query acima
		Query query = manager.createQuery(jpqlSoma);
		query.setParameter("pConta", conta);
		query.setParameter("pTipo", TipoMovimentacao.SAIDA);
		
		Query query2 = manager.createQuery(jpqlMedia);
		query2.setParameter("pConta", conta);
		query2.setParameter("pTipo", TipoMovimentacao.SAIDA);
		
		BigDecimal soma = (BigDecimal) query.getSingleResult();
		Double media = (Double) query2.getSingleResult();
		
		System.out.println("A soma é " + soma);
		System.out.println("A média é " + media);

		manager.getTransaction().commit();
		manager.close();
	}

}
