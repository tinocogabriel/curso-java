package controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		double soma = 0;
		double nota = 0;
		int quantidade = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(nota != -1) {
			System.out.println("Digite a proxima nota: ");
			nota = scanner.nextDouble();
			
			if(nota >= 0 && nota <= 10) {
				soma += nota;
				quantidade++;
			}
			else if(nota != -1) {
				System.out.println("Nota inválida tente novamente");
			}
		}
		
		scanner.close();
		
		double media = soma / quantidade;
		
		System.out.println("A méida dos alunos é: " + media);
		
	}
}
