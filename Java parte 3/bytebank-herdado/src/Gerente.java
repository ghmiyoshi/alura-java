// Gerente é um funcionário, Gerente herda da classe funcionário, 
// assina o contrato Autenticável e é um Autenticável
public class Gerente extends Funcionario implements Autenticavel {
	private AutenticacaoUtil autenticador;

	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	} 

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}

	public double getBonificacao() {
		System.out.println("Chamando o m�todo de bonifica��o do gerente");
		return super.getSalario();
	}

}
