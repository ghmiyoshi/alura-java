package br.com.banco.bytebank.modelo;

/**
 * Classe que representa a "moldura" de uma conta.
 * 
 * @author hideki
 *
 */
public abstract class Conta {
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;

	/**
	 * Construtor para inicializar o objeto Conta a partir da agência e do número.
	 * 
	 * @param agencia
	 * @param numero
	 */
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
			System.out.println("N�o pode valor menor igual a 0");
		}
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("N�o pode valor menor igual a 0");
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

	/**
	 * Valor precisa ser maior do que o saldo.
	 * 
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */
	public void saca(double valor) throws SaldoInsuficienteException {
		if (saldo < valor) {

			throw new SaldoInsuficienteException("Saldo indisp�nivel...");
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

	@Override
	public String toString() {
		return "N�mero: " + this.getNumero() + " Saldo: " + this.getSaldo();
	}

}
