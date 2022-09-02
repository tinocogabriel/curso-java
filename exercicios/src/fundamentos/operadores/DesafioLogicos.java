package fundamentos.operadores;

public class DesafioLogicos {
	public static void main(String[] args) {
		boolean trabalho1 = true;
		boolean trabalho2 = false;
		
		System.out.printf("Comprou a TV de 50 polegados? %b", trabalho1 && trabalho2);
		System.out.printf("\nComprou a TV de 32 polegados? %b", trabalho1 ^ trabalho2);
		System.out.printf("\nForam até o shopping tomar sorvete? %b", trabalho1 || trabalho2);
		System.out.printf("\nA familia está mais saúdavel por não tomar sorvete? %b", !(trabalho1 || trabalho2));
		
	}
}
