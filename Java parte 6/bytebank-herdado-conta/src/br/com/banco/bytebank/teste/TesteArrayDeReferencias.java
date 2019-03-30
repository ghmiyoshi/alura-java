package br.com.banco.bytebank.teste;

import br.com.banco.bytebank.modelo.ContaCorrente;

public class TesteArrayDeReferencias {

	public static void main(String[] args) {

		Object[] contas = new Object[5];

		ContaCorrente cc = new ContaCorrente(123, 456);
		contas[0] = cc;

		ContaCorrente cc2 = new ContaCorrente(456, 789);
		contas[1] = cc2;

		// System.out.println(cc2.getNumero());

		// System.out.println(contas[1].getNumero());

		ContaCorrente ref = (ContaCorrente) contas[1];
		System.out.println(cc2.getNumero());
		System.out.println(ref.getNumero());

	}

}
