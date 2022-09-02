package controle;

import java.util.Scanner;

public class WhileIndeterminado {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean keepGoing = true;
		
		while(keepGoing) {
			System.out.println("Digite uma palavra: ");
			String texto = scanner.next();
			
			if(texto.equalsIgnoreCase("sair")) {
				System.out.println("Saindo...");
				keepGoing = false;
			}
		}
		
		scanner.close();
	}
}
