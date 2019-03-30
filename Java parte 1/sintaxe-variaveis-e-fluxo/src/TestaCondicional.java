
public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");

		int idade = 20;
		int quantidadeDePessoas = 3;

		if (idade >= 18) {
			System.out.println("Maior de idade");
			System.out.println("Seja bem vindo!");
		} else if (quantidadeDePessoas >= 2) {
			System.out.println("Você não tem 18 anos mas pode entrar...");
		} else {
			System.out.println("Não pode entrar");
		}
	}

}
