package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	public static void main(String[] args) {
		System.out.print("Digite o dia da semana: ");
		Scanner scanner = new Scanner(System.in);
		String diaSemana = scanner.next();

		if (diaSemana.equalsIgnoreCase("Domingo")) {
			System.out.println("\n 1");
		} else if (diaSemana.equalsIgnoreCase("Segunda")) {
			System.out.println("\n 2");
		} else if (diaSemana.equalsIgnoreCase("Terca")) {
			System.out.println("\n 3");
		} else if (diaSemana.equalsIgnoreCase("Quarta")) {
			System.out.println("\n 4");
		} else if (diaSemana.equalsIgnoreCase("Quinta")) {
			System.out.println("\n 5");
		} else if (diaSemana.equalsIgnoreCase("Sexta")) {
			System.out.println("\n 6");
		} else if (diaSemana.equalsIgnoreCase("Sábado")) {
			System.out.println("\n 7");
		} else {
			System.out.println("\n Dia inválido!");
		}

		scanner.close();
	}
}
