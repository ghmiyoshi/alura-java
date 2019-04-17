import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class TesteScanner {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner teclado = new Scanner(new File("contas.csv"));
		

		while (teclado.hasNextLine()) {
			String linha = teclado.nextLine();
			System.out.println(linha);
			
			
			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useDelimiter(",");
			linhaScanner.useLocale(Locale.US);
			
			String valor1 = linhaScanner.next();
			int valor2 = linhaScanner.nextInt();
			int valor3 = linhaScanner.nextInt();
			String valor4 = linhaScanner.next();
			double valor5 = linhaScanner.nextDouble();
			
			System.out.println(valor1 + valor2 + valor3 + valor4 + valor5);
			
//			String[] valores = linha.split(",");
//			System.out.println(valores[3]);
			
		}

		teclado.close();
	}
}
