package br.com.alura.financas.util;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.alura.financas.modelo.Categoria;
import br.com.alura.financas.modelo.Conta;
import br.com.alura.financas.modelo.Movimentacao;
import br.com.alura.financas.modelo.TipoMovimentacao;

public class PopulaMovimentacoesComCategoria {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setId(2);

		Categoria categoria = new Categoria("Viagem");
		Categoria categoria2 = new Categoria("Negócios");

		List<Categoria> categorias = new ArrayList<>();
		categorias.add(categoria);
		categorias.add(categoria2);

		Movimentacao movimentacao = new Movimentacao();
		movimentacao.setData(Calendar.getInstance());
		movimentacao.setDescricao("Viagem a SP");
		movimentacao.setTipo(TipoMovimentacao.SAIDA);
		movimentacao.setValor(new BigDecimal("300.0"));
		movimentacao.setCategoria(categorias);
		
		movimentacao.setConta(conta);

		Movimentacao movimentacao2 = new Movimentacao();
		
		Calendar amanha = Calendar.getInstance();
		amanha.add(Calendar.DAY_OF_MONTH, 1);
		
		
		movimentacao2.setData(amanha);
		movimentacao2.setDescricao("Viagem a SP");
		movimentacao2.setTipo(TipoMovimentacao.SAIDA);
		movimentacao2.setValor(new BigDecimal("300.0"));
		movimentacao2.setCategoria(categorias);
		
		movimentacao2.setConta(conta);

		EntityManager manager = new JPAUtil().getEntityManager();
		manager.getTransaction().begin();

		manager.persist(categoria);
		manager.persist(categoria2);

		manager.persist(movimentacao);
		manager.persist(movimentacao2);

		manager.getTransaction().commit();
		manager.close();

	}

}
