
public class TesteTributaveis {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(222, 333);
		cc.deposita(100.0);

		SeguroDeVida seguro = new SeguroDeVida();
		seguro.getValorImposto(); 

		CalculadorImposto calculador = new CalculadorImposto();
		calculador.registraImposto(cc);
		calculador.registraImposto(seguro);

		System.out.println("Total de impostos: " + calculador.getTotalImposto());
	}

}
