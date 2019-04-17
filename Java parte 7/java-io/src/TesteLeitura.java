import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {

		// Fluxo de entrada com arquivo
		InputStream fip = new FileInputStream("lorem.txt");
		
		// O m�todo read() retorna int, indica que ele � capaz de ler os bytes
		// fip.read();

		// A classe InputStreamReader transforma um int em caracteres
		Reader is = new InputStreamReader(fip);
		// is.read();

		// Primeiro, criamos o fluxo concreto com o arquivo, mas ainda bin�rio, em seguida,
		// conseguimos transforma-los em caracteres, mas apenas a contabiliza��o, por fim,
		// com o BufferedReader, podemos utilizar o m�todo readLine(), que nos permite ler linha a linha.
		BufferedReader br = new BufferedReader(is);

		// Este m�todo nos retorna uma String, que representa a linha
		String linha = br.readLine();

		while (linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}

		// Estabelecemos uma entrada em BufferedReader, mas n�o uma sa�da, assim,
		// fecharemos com o br.close()
		// Isso faz com que tanto o FileInputStream quanto o InputStreamReader sejam
		// fechados automaticamente
		br.close();

	}

}
