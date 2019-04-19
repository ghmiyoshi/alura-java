import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class TesteScanner {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner teclado = new Scanner(new File("contas.csv"), "UTF-8");

		while (teclado.hasNextLine()) {
			String linha = teclado.nextLine();
//			System.out.println(linha);

			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useDelimiter(",");
			linhaScanner.useLocale(Locale.US);

			String tipoConta = linhaScanner.next();
			int agencia = linhaScanner.nextInt();
			int numero = linhaScanner.nextInt();
			String titular = linhaScanner.next();
			double saldo = linhaScanner.nextDouble();

			System.out.format(new Locale("pt", "BR"), "%s - %04d-%08d , %20s , %08.2f %n", tipoConta, agencia, numero,
					titular, saldo);

			// System.out.println(tipoConta + agencia + numero + titular + saldo);

//			String[] valores = linha.split(",");
//			System.out.println(valores[3]);

			linhaScanner.close();

		}

		teclado.close();
	}
}
