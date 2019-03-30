package br.com.banco.bytebank.teste;

import br.com.banco.bytebank.modelo.ContaCorrente;
import br.com.banco.bytebank.modelo.SaldoInsuficienteException;

public class TesteSaca {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(123, 456);

		cc.deposita(200.0);

		try {
			cc.saca(210.0);
		} catch (SaldoInsuficienteException erro) {
			System.out.println(erro.getMessage());
		}

		System.out.println(cc.getSaldo());
	}

}
