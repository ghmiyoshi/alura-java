import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrappers {

	public static void main(String[] args) {
		int idade = 29;

		Integer idadeRef = Integer.valueOf(29); // autoboxing
		System.out.println(idadeRef.intValue()); // unboxing

		Double doubleRef = Double.valueOf(3.2); // autoboxing
		System.out.println(doubleRef.doubleValue()); // unboxing

		Boolean booleanRef = Boolean.FALSE;
		System.out.println(booleanRef.booleanValue());

		Number numeroRef = Float.valueOf(29.9f);

		List<Number> numeros = new ArrayList<>();
		numeros.add(10);
		numeros.add(32.6);
		numeros.add(25.6f);

	}

}
