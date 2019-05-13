package br.com.alura.financas.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import br.com.alura.financas.modelo.Conta;
import br.com.alura.financas.modelo.Movimentacao;
import br.com.alura.financas.modelo.TipoMovimentacao;

public class MovimentacaoDao {
	private EntityManager manager;

	public MovimentacaoDao(EntityManager manager) {
		this.manager = manager;
	}

	public List<Double> getMediasPorDiaETipo(Conta conta, TipoMovimentacao saida) {
		// JPQL - Java Persist Query Language
		String jpql = "SELECT AVG(m.valor) FROM Movimentacao m WHERE m.conta = :pConta" + " AND m.tipo = :pTipo"
				+ " GROUP BY DAY(m.data), month(m.data), year(m.data)";

		// Usamos os setParameter para atribuir na query acima
		TypedQuery<Double> query = manager.createQuery(jpql, Double.class);
		query.setParameter("pConta", conta);
		query.setParameter("pTipo", TipoMovimentacao.SAIDA);

		return query.getResultList(); // Retorna uma lista
	}

}
