package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Ana", 7.8);
		Aluno a2 = new Aluno("Jorge", 4.6);
		Aluno a3 = new Aluno("Davi", 7.3);
		Aluno a4 = new Aluno("Golias", 4.8);
		Aluno a5 = new Aluno("Rute", 8.8);

		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5);
		Comparator<Aluno> melhorNota = (al1, al2) -> {
			if (al1.nota > al2.nota)
				return 1;
			if (al1.nota < al2.nota)
				return -1;
			return 0;
		};
		
		System.out.println(alunos.stream().max(melhorNota).get());
		System.out.println(alunos.stream().min(melhorNota).get());
	}
}
