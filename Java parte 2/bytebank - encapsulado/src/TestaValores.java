
public class TestaValores {

	public static void main(String[] args) {
		Conta conta = new Conta(1234, 1);

		// conta está inconsistente
//		conta.setAgencia(0);
//		conta.setNumero(0);

		System.out.println(conta.getAgencia());

	}

}
