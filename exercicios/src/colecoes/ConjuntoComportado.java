package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	public static void main(String[] args) {
		// Set<String> listaAprovado = new HashSet<>();
		SortedSet<String> listaAprovado = new TreeSet<>(); // TreeSet ordenado

		listaAprovado.add("Ana");
		listaAprovado.add("Carlos");
		listaAprovado.add("Luca");
		listaAprovado.add("Pedro");

		for (String candidato : listaAprovado) {
			System.out.println(candidato);
		}

		Set<Integer> nums = new HashSet<>();

		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		
		for(Integer n : nums) {
			System.out.println(n);
		}
	}
}
