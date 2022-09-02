package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o primeiro salário: ");
		String salario1 = scanner.nextLine().replace(",", ".");
		System.out.print("\nDigite o segundo salário: ");
		String salario2 = scanner.nextLine().replace(",", ".");
		System.out.print("\nDigite o terceiro salário: ");
		String salario3 = scanner.nextLine().replace(",", ".");

		Double soma = Double.parseDouble(salario1) + Double.parseDouble(salario2) + Double.parseDouble(salario3);

		System.out.println("A soma dos salários é: " + soma);
		System.out.println("A média dos salários é: " + soma / 3);
		
		scanner.close();
	}
}
