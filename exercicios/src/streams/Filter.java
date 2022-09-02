package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Ana", 7.8);
		Aluno a2 = new Aluno("Jorge", 4.6);
		Aluno a3 = new Aluno("Davi", 7.3);
		Aluno a4 = new Aluno("Golias", 4.8);
		Aluno a5 = new Aluno("Rute", 8.8);

		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5);

		Predicate<Aluno> aprovado = a -> a.nota >= 7;

		Function<Aluno, String> saudacao = a -> "Parabéns " + a.nome + " você foi aprovado!";

		alunos.stream()
		.filter(aprovado)
		.map(saudacao)
		.forEach(System.out::println);
	}
}
