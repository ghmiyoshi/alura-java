
public class TesteSistema {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		gerente.setSenha(222);

		Administrador adm = new Administrador();
		adm.setSenha(333);

		Cliente cliente = new Cliente();
		cliente.setSenha(444);

		SistemaInterno sistema = new SistemaInterno();
		sistema.autentica(gerente);
		sistema.autentica(adm);
		sistema.autentica(cliente);

	}

}
