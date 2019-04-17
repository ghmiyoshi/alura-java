import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {

		// Fluxo de entrada com arquivo
//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer ops = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(ops);

		// FileWriter fw = new FileWriter("lorem2.txt");
		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));

		bw.write("Lorem Ipsum is simply dummy text of the printing and typesetting industry.");
		bw.write(System.lineSeparator());
		bw.write(System.lineSeparator());
		bw.write("Lorem Ipsum is simply dummy text of the printing and typesetting industry.");

		bw.close();

	}

}
