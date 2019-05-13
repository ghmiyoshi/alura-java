package br.com.alura.financas.teste;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.alura.financas.modelo.Categoria;
import br.com.alura.financas.modelo.Conta;
import br.com.alura.financas.modelo.Movimentacao;
import br.com.alura.financas.modelo.TipoMovimentacao;
import br.com.alura.financas.util.JPAUtil;

public class TesteMovimentacoesPorCategoria {

	public static void main(String[] args) {
		
		EntityManager manager = new JPAUtil().getEntityManager();
		manager.getTransaction().begin();

		Categoria categoria = new Categoria();
		categoria.setId(1);

		String jpql = "SELECT m FROM Movimentacao m join m.categoria c WHERE c= :pCategoria";
		Query query = manager.createQuery(jpql);
		query.setParameter("pCategoria", categoria);

		List<Movimentacao> resultados = query.getResultList();
		for (Movimentacao movimentacao : resultados) {
			System.out.println("Movimentação: " + movimentacao.getDescricao());
			System.out.println("Categoria.id: " + categoria.getId());
		}

		manager.getTransaction().commit();

		manager.close();
	}

}