
public abstract class Conta {
	protected double saldo;
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

	public abstract void deposita(double valor);

	public void saca(double valor) throws SaldoInsuficienteException {
		if (saldo < valor) {

			throw new SaldoInsuficienteException("Saldo indispónivel...");
		}
		this.saldo -= valor;
	}

	public static int getTotal() {
		return Conta.total;
	}

	public void transfere(Conta conta, double valor) throws SaldoInsuficienteException {
		this.saca(valor);
		conta.deposita(valor);
	}

}
