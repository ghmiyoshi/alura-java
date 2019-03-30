
public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta();
		// conta.numero = 1234;
		conta.setNumero(1234);

		Cliente cliente = new Cliente();
		// conta.titular = gabriel;
		cliente.setNome("gabriel");

		conta.setTitular(cliente);

		System.out.println(conta.getTitular().getNome());

		conta.getTitular().setProfissao("Desenvolvedor");

		System.out.println(conta.getTitular().getProfissao());
		
		//agora em duas linhas
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("Programador");
		
		System.out.println(titularDaConta);
		System.out.println(cliente);
		System.out.println(conta.getTitular());
		
		Conta conta2 = new Conta(1234,1234);
		
		System.out.println(Conta.getTotal());

	}

}
