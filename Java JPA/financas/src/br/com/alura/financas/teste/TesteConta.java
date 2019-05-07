package br.com.alura.financas.teste;

import javax.persistence.EntityManager;

import br.com.alura.financas.modelo.Conta;
import br.com.alura.financas.util.JPAUtil;

public class TesteConta {

	public static void main(String[] args) {

		Conta conta = new Conta(); // Estado Transient - Objeto que ainda não foi persistido
		conta.setTitular("Gabriel");
		conta.setNumero("123");
		conta.setBanco("Bradesco");
		conta.setAgencia("456");

		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		
		em.persist(conta); // Persiste a conta e se torna Managed
		
		em.getTransaction().commit();
		em.close();
	}

}
