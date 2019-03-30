// contrato autenticavel
	// quem assinar esse contrato, precisa implementar 
		// método setSenha
		// método autentica
public interface Autenticavel {
	
	void setSenha(int senha);

	boolean autentica(int senha);

}
