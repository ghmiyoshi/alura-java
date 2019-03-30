
public class TesteArrayDePrimitivos {
	// Array []
	public static void main(String[] args) {
		int[] idades = new int[5]; // inicializa o array com 0

		idades[0] = 1;
		idades[1] = 2;
		idades[2] = 3;
		idades[3] = 4;
		idades[4] = 5;

		System.out.println("Tamanho do array: " + idades.length); // tamanho do array

		for (int i = 0; i < idades.length; i++) {
			idades[i] = i * i;
		}

		for (int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);
		}

	}
}
