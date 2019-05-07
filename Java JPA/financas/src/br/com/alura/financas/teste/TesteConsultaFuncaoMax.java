package br.com.alura.financas.teste;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.alura.financas.modelo.Conta;
import br.com.alura.financas.util.JPAUtil;

public class TesteConsultaFuncaoMax {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.setId(2);

		EntityManager manager = new JPAUtil().getEntityManager();
		manager.getTransaction().begin();

		String jpqlMax = "SELECT MAX(m.valor) FROM Movimentacao m WHERE m.conta = :pConta";

		Query query = manager.createQuery(jpqlMax);
		query.setParameter("pConta", conta);

		BigDecimal maximo = (BigDecimal) query.getSingleResult();

		System.out.println("O valor maximo é " + maximo);

		manager.getTransaction().commit();
		manager.close();
	}

}
