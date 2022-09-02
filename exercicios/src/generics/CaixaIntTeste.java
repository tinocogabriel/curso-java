package generics;

public class CaixaIntTeste {
	public static void main(String[] args) {
		CaixaInt<String> caixaA = new CaixaInt<>();
		caixaA.guardar("Olá");
		System.out.println(caixaA.abrir());
	}
}
