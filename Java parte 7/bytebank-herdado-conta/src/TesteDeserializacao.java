import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TesteDeserializacao {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cc.bin"));
		Conta conta = (Conta) ois.readObject();
		ois.close();
		
		System.out.println(conta.getSaldo());
		System.out.println(conta.getTitular());
		
	}

}
