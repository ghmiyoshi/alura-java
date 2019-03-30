package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaGabriel = new Conta();
		contaGabriel.saldo = 100;
		contaGabriel.deposita(100);

		boolean conseguiSacar = contaGabriel.saca(10);
		System.out.println(conseguiSacar);
		System.out.println(contaGabriel.saldo);

		Conta contaKah = new Conta();

		boolean sucessoTranferencia = contaGabriel.transfere(contaKah, 100);

		if (sucessoTranferencia) {
			System.out.println("Tranferência realizada com sucesso");
		} else {
			System.out.println("Faltou dinheiro");
		}

		System.out.println(contaKah.saldo);

	}

}
