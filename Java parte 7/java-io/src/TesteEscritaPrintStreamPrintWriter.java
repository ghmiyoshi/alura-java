import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TesteEscritaPrintStreamPrintWriter {

	public static void main(String[] args) throws IOException {

		// Fluxo de entrada com arquivo
//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer ops = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(ops);

		// FileWriter fw = new FileWriter("lorem2.txt");
		// BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));

		// PrintStream pw = new PrintStream(new File("lorem2.txt"));
		PrintWriter pw = new PrintWriter("lorem2.txt");

		pw.write("Teste\n");
		pw.println("Teste Lorem Ipsum is simply dummy text of the printing and typesetting industry.");
		pw.println();
		pw.println();
		pw.println("Print Lorem Ipsum is simply dummy text of the printing and typesetting industry.");

		pw.close();

	}

}
