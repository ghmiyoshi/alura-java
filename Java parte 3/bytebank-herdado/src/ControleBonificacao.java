
public class ControleBonificacao {
	private double soma;

	public void registra(Funcionario funcionario) {
		double bonificao = funcionario.getBonificacao();
		this.soma += bonificao;
	}

	public double getSoma() {
		return soma;
	}

}
