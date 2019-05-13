package br.com.alura.financas.teste;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.alura.financas.dao.MovimentacaoDao;
import br.com.alura.financas.modelo.Conta;
import br.com.alura.financas.modelo.TipoMovimentacao;
import br.com.alura.financas.util.JPAUtil;

public class TesteFuncoesJPQL2 {

	public static void main(String[] args) {
		
		EntityManager manager = new JPAUtil().getEntityManager();
		manager.getTransaction().begin();

		Conta conta = new Conta();
		conta.setId(2);

		MovimentacaoDao dao = new MovimentacaoDao(manager);
		List<Double> medias = dao.getMediasPorDiaETipo(conta, TipoMovimentacao.SAIDA);

		System.out.println("A média do dia 26 é: " + medias.get(0));
		System.out.println("A média do dia 27 é: " + medias.get(1));

		manager.getTransaction().commit();
		manager.close();
	}

}
