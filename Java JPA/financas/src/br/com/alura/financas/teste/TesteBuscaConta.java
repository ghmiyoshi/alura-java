package br.com.alura.financas.teste;

import javax.persistence.EntityManager;

import br.com.alura.financas.modelo.Conta;
import br.com.alura.financas.util.JPAUtil;

public class TesteBuscaConta {

	public static void main(String[] args) {

		EntityManager manager = new JPAUtil().getEntityManager();
		manager.getTransaction().begin();

		Conta conta = manager.find(Conta.class, 6); // Busca uma conta que está no estado Managed

		// Os sets resultarão em uma atualização no Banco
		conta.setTitular("João");
		conta.setNumero("678");

		System.out.println(conta.getTitular());

		manager.getTransaction().commit();
		manager.close();
	}

}
