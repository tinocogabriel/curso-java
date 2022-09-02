package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimirObjetos {
	public static void main(String[] args) {
		List<String> aprovados = Arrays.asList("Lu", "Gui", "Luca");
		
		System.out.println("Usando o foreach");
		for(String nome: aprovados) {
			System.out.println(nome);
		}
		
		System.out.println("\nUsando o Iterator");
		Iterator<String> iterador = aprovados.iterator();
		while(iterador.hasNext()) {
			System.out.println(iterador.next());
		}
		
		System.out.println("\nUsando o Stream");
		Stream<String> stream = aprovados.stream();
		stream.forEach(System.out::println); //Laça interno!
		
	}
}
