package br.com.alura.financas.teste;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.alura.financas.modelo.Conta;
import br.com.alura.financas.util.JPAUtil;

public class TesteConsultaFuncaoCount {

	public static void main(String[] args) {

		EntityManager manager = new JPAUtil().getEntityManager();
		Conta conta = manager.find(Conta.class, 2); // id 2 deve existir no banco

		Query query = manager.createQuery("SELECT COUNT(m) FROM Movimentacao m WHERE m.conta = :pConta");
		query.setParameter("pConta", conta);

		Long quantidade = (Long) query.getSingleResult();

		System.out.println("Total de movimentações: " + quantidade);
	}

}
