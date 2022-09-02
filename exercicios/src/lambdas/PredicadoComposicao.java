package lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {
	public static void main(String[] args) {
		Predicate<Integer> isPar = num -> num % 2 == 0;

		Predicate<Integer> isTresDigitos = num -> num >= 100 && num <= 999;
		//Utilizando o E
		System.out.println(isPar.and(isTresDigitos).test(222));
		// Utilizando negação
		System.out.println(isPar.and(isTresDigitos).negate().test(222));
		// Utilizando OU
		System.out.println(isPar.or(isTresDigitos).test(222));
	}
}
