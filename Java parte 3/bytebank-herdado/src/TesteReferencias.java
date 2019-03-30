
public class TesteReferencias {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();

		gerente.setNome("Marcos");
		gerente.setSalario(5000.0);

		EditorDeVideo editor = new EditorDeVideo();
		editor.setSalario(2500.0);

		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(gerente);
		controle.registra(editor);

		System.out.println(controle.getSoma());

	}

}
