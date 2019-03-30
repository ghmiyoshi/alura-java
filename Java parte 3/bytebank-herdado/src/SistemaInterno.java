
public class SistemaInterno {

	private int senha = 222;

	public void autentica(Autenticavel funcionarioAutenticavel) {
		boolean autenticou = funcionarioAutenticavel.autentica(this.senha);

		if (autenticou) {
			System.out.println("Bem vindo ao sistema!");
		} else {
			System.out.println("Senha inv�lida!");
		}
	}

}
