
public class CalculadorImposto {

	private double totalImposto;

	public void registraImposto(Tributavel tributavel) {
		double valor = tributavel.getValorImposto();
		this.totalImposto += valor;
	}

	public double getTotalImposto() {
		return totalImposto;
	}

}
