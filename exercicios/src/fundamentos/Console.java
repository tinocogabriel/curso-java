package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print(" dia!");

		System.out.println("Bom");
		System.out.println("dia");

		System.out.printf("Megasena: %d %d %d %d %d %n", 1, 2, 3, 4, 5);
		System.out.printf("Salário %.1f%n", 1234.1234);
		System.out.printf("Nome: %s%n", "Java");

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o seu nome: ");
		String nome = entrada.nextLine();

		System.out.print("\nDigite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();

		System.out.print("\nDigite a sua idade: ");
		int idade = entrada.nextInt();

		System.out.printf("\nNome Completo: %s %s, Idade: %d ", nome, sobrenome, idade);
		
		entrada.close();

	}
}
