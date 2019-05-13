package br.com.alura.financas.teste;

import javax.persistence.EntityManager;

import br.com.alura.financas.modelo.Cliente;
import br.com.alura.financas.modelo.Conta;
import br.com.alura.financas.util.JPAUtil;

public class TesteContaCliente {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		cliente.setNome("Leonardo");
		cliente.setEndereco("Rua fulano, 123");
		cliente.setProfissao("Professor");

		Cliente cliente2 = new Cliente();
		cliente2.setNome("Douglas");
		cliente2.setEndereco("Rua fulano, 123");
		cliente2.setProfissao("Professor");

		Conta conta = new Conta();
		conta.setId(2);

		cliente.setConta(conta);
		cliente2.setConta(conta);

		EntityManager manager = new JPAUtil().getEntityManager();
		manager.getTransaction().begin();

		manager.persist(cliente);
//		manager.persist(cliente2); Impossivel persistir clientes com a mesma conta

		manager.getTransaction().commit();
		manager.close();
	}

}
