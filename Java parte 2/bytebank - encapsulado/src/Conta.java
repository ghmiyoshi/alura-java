
public class Conta {
	private double saldo;
	private int agencia;
	private int numero;	
	private Cliente titular;
	private static int total;

	public Conta(int agencia, int numero) {
		Conta.total++;
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Estou criando uma conta");
	}

	public Conta() {

	}

	public double getSaldo() {
		return saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Não pode valor menor igual a 0");
		}
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Não pode valor menor igual a 0");
		}
		this.numero = numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

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

	public static int getTotal() {
		return Conta.total;
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
