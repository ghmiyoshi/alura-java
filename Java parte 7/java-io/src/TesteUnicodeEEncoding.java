import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEEncoding {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String s = "13º Órgão Oficial";

		System.out.println(s.codePointAt(0)); // unicode

		Charset charset = Charset.defaultCharset();
		System.out.println(charset.displayName());

		byte[] bytes = s.getBytes();
		System.out.print(bytes.length + ", windows-1252, ");
		String string = new String(bytes);
		System.out.println(string);

		bytes = s.getBytes("UTF-16");
		System.out.print(bytes.length + ", UTF-16, ");
		string = new String(bytes, "windows-1252");
		System.out.println(string);

		bytes = s.getBytes(StandardCharsets.US_ASCII);
		System.out.print(bytes.length + ", US_ASCII, ");
		string = new String(bytes, "windows-1252");
		System.out.println(string);

	}

}
