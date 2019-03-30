

public class Conta {
	double saldo;
	int agencia;
	int numero;
	Cliente titular;

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		if (saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			System.out.println("Saldo indispónivel");
			return false;
		}
	}

	public boolean transfere(Conta conta, double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			conta.deposita(valor);
			return true;
		} else {
			System.out.println("Saldo indispónivel");
			return false;
		}
	}

}
