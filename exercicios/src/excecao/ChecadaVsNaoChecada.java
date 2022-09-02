package excecao;

public class ChecadaVsNaoChecada {
	public static void main(String[] args) {
		try {
			geraError1();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			geraError2();
		} catch (Exception e) {
			System.out.println(e.getMessage());;
		}
		
		System.out.println("Fim :)");
	}
	
	//Não checada ou não verificada
	static void geraError1() {
		throw new RuntimeException("Ocorreu um erro bem legal #01");
	}

	//Exceção checada ou verificada
	static void geraError2() throws Exception{
		throw new Exception("Ocorreu um erro bem legal #02");
	}
}
