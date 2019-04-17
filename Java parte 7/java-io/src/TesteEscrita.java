import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {

		OutputStream fos = new FileOutputStream("lorem2.txt");
		Writer ops = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(ops);

		bw.write("Lorem Ipsum is simply dummy text of the printing and typesetting industry.");
		bw.newLine();
		bw.write("Lorem Ipsum is simply dummy text of the printing and typesetting industry.");

		bw.close();

	}

}
