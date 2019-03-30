
public class TestaBanco {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.nome = "Gabriel";

		// Associa o cliente a conta
		Conta contaGabriel = new Conta();
		contaGabriel.titular = cliente;

		System.out.println(contaGabriel.titular.nome);

	}

}
