package fundamentos.operadores;

public class DesafioAritmeticos {
	public static void main(String[] args) {
		int primeiraEquacao = (int) Math.pow(6 * (3 + 2), 2) / (3 * 2);
		
		int segundaEquacao= (int) Math.pow((1 - 5) * (2 - 7) / 2, 2);
		
		int equacaoFinal = (int) Math.pow(primeiraEquacao- segundaEquacao, 3) / (int) Math.pow(10, 3);
		
		System.out.println(primeiraEquacao);
		System.out.println(segundaEquacao);
		System.out.println(equacaoFinal);
		
		
	}
}
