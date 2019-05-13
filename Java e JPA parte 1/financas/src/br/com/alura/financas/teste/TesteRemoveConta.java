package br.com.alura.financas.teste;

import javax.persistence.EntityManager;

import br.com.alura.financas.modelo.Conta;
import br.com.alura.financas.util.JPAUtil;

public class TesteRemoveConta {

	public static void main(String[] args) {

		Conta conta = new Conta();
		conta.setId(1);
		conta.setTitular("Gabriel");
		conta.setNumero("123");
		conta.setBanco("Bradesco");
		conta.setAgencia("456");

		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		
		conta = em.find(Conta.class, 1); 	
		em.remove(conta); // Remove conta
		
		em.getTransaction().commit();
		em.close();
	}

}
