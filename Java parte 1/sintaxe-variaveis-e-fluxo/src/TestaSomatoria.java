
public class TestaSomatoria {
	public static void main(String[] args) {
		int contador = 0;
		int somatoria = 0;

		while (contador <= 100) {
			somatoria += contador;
			contador++;
		}

		System.out.println("A soma total é " + somatoria);
	}
}
