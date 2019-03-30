
public class TestaCondicional2 {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");

		int idade = 20;
		int quantidadeDePessoas = 1;
		boolean acompanhado = quantidadeDePessoas >= 2;

		System.out.println("Valor do acompanhado: " + acompanhado);

		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem vindo!");
		} else {
			System.out.println("Não pode entrar");
		}
	}

}
