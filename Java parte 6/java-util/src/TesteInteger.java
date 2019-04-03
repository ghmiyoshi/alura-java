import java.util.ArrayList;
import java.util.List;

public class TesteInteger {

	public static void main(String[] args) {
		int idade = 29; 

		Integer idadeRef = Integer.valueOf(29); // autoboxing
		System.out.println(idadeRef.intValue());

		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.BYTES);
		System.out.println(Integer.SIZE);

		int valor = idadeRef.intValue(); // unboxing

		String s = args[0]; // "10"
		// Integer numero = Integer.valueOf(s)
		int numero = Integer.parseInt(s);
		System.out.println(numero);

		List<Integer> numeros = new ArrayList<>();
		numeros.add(29); // autoboxing

	}

}
