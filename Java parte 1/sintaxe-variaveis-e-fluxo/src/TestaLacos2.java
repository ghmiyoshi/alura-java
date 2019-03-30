
public class TestaLacos2 {
	public static void main(String[] args) {

		for (int linha = 1; linha <= 10; linha++) {
			for (int coluna = 0; coluna <= 10; coluna++) {
				if (coluna > linha) {
					break;
				}
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
