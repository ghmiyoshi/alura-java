package br.com.alura.string.teste;

public class TesteString {

	public static void main(String[] args) {
		String nome = "Alura"; // object literal

		// String outro = new String("Alura");

		// char b = 'A';
		// char c = 'a';

		// String outro = nome.replace(b, c);

		// String outro = nome.toLowerCase();

		char posicao = nome.charAt(2);

		int posicao2 = nome.indexOf("u");

		String subString = nome.substring(2);

		nome.length();

		System.out.println(nome.length());

		for (int i = 0; i < nome.length(); i++) {
			char letra = nome.charAt(i);
			System.out.println(letra);
		}

		String vazio = "  Alura ";

		String outroVazio = vazio.trim();

		System.out.println(vazio.isEmpty());
		System.out.println(vazio);
		System.out.println(outroVazio);

		System.out.println(vazio.contains("Alu"));

	}

}
