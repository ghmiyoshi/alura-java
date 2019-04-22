package br.com.alura.maven;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Produto produto = new Produto("Push", 2.54);

		System.out.println("A bala que eu gosto é " + produto.getNome() + "e custa R$ " + produto.getPreco());
	}
}
