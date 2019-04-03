import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

	public static void main(String[] args) {
		Integer idadeRef = 29; // autoboxing, é criado um objeto do tipo Integer
		int primitivo = new Integer(21); // que locura!! unboxing

		List<Integer> lista = new ArrayList<>();
		lista.add(idadeRef); // ok
		lista.add(primitivo); // autoboxing

		int i1 = lista.get(0); // unboxing
		Integer i2 = lista.get(1); // ok

		System.out.println(i1); // 29
		System.out.println(i2); // 21

	}

}
