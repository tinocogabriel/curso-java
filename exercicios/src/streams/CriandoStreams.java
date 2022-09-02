package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
	public static void main(String[] args) {
		Consumer<String> print = System.out::print;
		Consumer<Integer> println = System.out::println;
		
		//Primeira forma de criar a Stream - Stream.of
		Stream<String> lands = Stream.of("Java ", "Lua ", "JS\n");
		lands.forEach(print);
		
		String[] maisLangs = {"Python", "Lisp", "Perl", "Go\n"};
		
		//Outra forma de criar é passando o Array no Stream.of
		Stream.of(maisLangs).forEach(print);
		
		//Outra forma de criar é utilizando o Arrays.stream
		Arrays.stream(maisLangs).forEach(print);
		
		//Também podemos definir no Arrays.stream quais itens serão selecionados
		Arrays.stream(maisLangs, 1, 3).forEach(print);
		
		//Como já vimos podemos criar com base em listas
		List<String> outrasLangs = Arrays.asList("C","PHP", "Kotlin");
		outrasLangs.stream().forEach(print);
		outrasLangs.parallelStream().forEach(print);
		
		Stream.generate(()-> "a").forEach(print);
		Stream.iterate(0, n -> n+1).forEach(println);
		
	}
}
