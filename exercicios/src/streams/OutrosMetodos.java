package streams;

import java.util.Arrays;
import java.util.List;

public class OutrosMetodos {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Ana", 7.8);
		Aluno a2 = new Aluno("Jorge", 4.6);
		Aluno a3 = new Aluno("Davi", 7.3);
		Aluno a4 = new Aluno("Golias", 4.8);
		Aluno a5 = new Aluno("Rute", 8.8);
		Aluno a6 = new Aluno("Davi", 7.3);
		Aluno a7 = new Aluno("Golias", 4.8);
		Aluno a8 = new Aluno("Rute", 8.8);

		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);

		System.out.println("Distinct");
		alunos.stream().distinct().forEach(System.out::println);

		System.out.println("Skip/Limit");
		alunos.stream().distinct().skip(2).limit(2).forEach(System.out::println);

		System.out.println("takeWhile");
		alunos.stream().distinct().takeWhile(a -> a.nota >= 7).forEach(System.out::println);

	}
}
