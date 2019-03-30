
public class TesteFuncionario {

	public static void main(String[] args) {
		Gerente funcionario = new Gerente();

		funcionario.setNome("Gabriel");
		funcionario.setCpf("xxx.xxx.xxx-x");
		funcionario.setSalario(1000);

		System.out.println(funcionario.getNome());
		System.out.println(funcionario.getBonificacao());

	}

}
