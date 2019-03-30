package br.com.alura.bytebank;

import br.com.banco.bytebank.modelo.Conta;
import br.com.banco.bytebank.modelo.ContaCorrente;

public class TesteBiblioteca {
	
	public static void main(String[] args) {
		Conta conta = new ContaCorrente(123,456);
		
		conta.deposita(100.0);
		
		System.out.println(conta.getSaldo());
	}

}
