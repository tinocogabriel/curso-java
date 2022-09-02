package generics;

public class CaixaNumeroTeste {
	public static void main(String[] args) {
		CaixaNumero<Double> caixaA = new CaixaNumero<>();
		caixaA.guardar(2.5);
		System.out.println(caixaA.abrir());
	}
}
