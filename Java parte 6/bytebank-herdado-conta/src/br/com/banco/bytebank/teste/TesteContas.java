package br.com.banco.bytebank.teste;

import br.com.banco.bytebank.modelo.ContaCorrente;
import br.com.banco.bytebank.modelo.ContaPoupanca;
import br.com.banco.bytebank.modelo.SaldoInsuficienteException;

public class TesteContas {

	public static void main(String[] args) throws SaldoInsuficienteException {
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100.0);		

		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200.0); 
		
		cc.transfere(cp, 10);

		System.out.println("Saldo da CC: " + cc.getSaldo());
		System.out.println("Saldo da CP: " + cp.getSaldo());
	}

}
