
public class TesteGerente {
	
	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		Autenticavel gerente2 = new Gerente();
				
		gerente.setNome("Nadine");
		gerente.setCpf("xxx.xxx.xxx-xx");
		gerente.setSalario(1000.0);
		gerente.setSenha(2222);
		gerente.autentica(2222);
		
		
		System.out.println(gerente.autentica(2222));
		System.out.println(gerente.getBonificacao());
		
	}

}
