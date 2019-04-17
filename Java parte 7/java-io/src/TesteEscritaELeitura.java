import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.Socket;

public class TesteEscritaELeitura {

	public static void main(String[] args) throws IOException {

		Socket socket = new Socket();

		InputStream fip = socket.getInputStream(); // System.in; // new FileInputStream("lorem.txt");
		Reader is = new InputStreamReader(fip);
		BufferedReader br = new BufferedReader(is);

		OutputStream fos = socket.getOutputStream(); // System.out; // new FileOutputStream("lorem2.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);

		String linha = br.readLine();

		while (linha != null && !linha.isEmpty()) {
			bw.write(linha);
			bw.newLine();
			bw.flush();
			linha = br.readLine();
		}

		br.close();
		bw.close();

	}

}
