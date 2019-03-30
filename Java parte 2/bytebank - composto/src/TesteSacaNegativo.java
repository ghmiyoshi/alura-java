
public class TesteSacaNegativo {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(100);
		System.out.println(conta.saca(101));

		// proibido
		conta.saldo = conta.saldo - 101;

		System.out.println(conta.saldo);

	}

}
