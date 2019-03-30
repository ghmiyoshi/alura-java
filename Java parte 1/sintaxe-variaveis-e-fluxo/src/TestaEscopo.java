
public class TestaEscopo {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");

		int idade = 20;
		int quantidadeDePessoas = 1;
		// boolean acompanhado = quantidadeDePessoas >= 2;

		boolean acompanhado;

		if (quantidadeDePessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}

		System.out.println("Valor do acompanhado: " + acompanhado);

		if (idade >= 18) {
			System.out.println("Seja bem vindo!");
		} else {
			System.out.println("Não pode entrar");
		}
	}

}
