package controle;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String valor = "";
		do {
			System.out.println("Digite um texto: ");
			valor = scanner.nextLine();
		} while (!valor.equalsIgnoreCase("por favor"));

		scanner.close();
	}
}
