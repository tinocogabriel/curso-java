package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		final double AJUSTE = 32, FATOR = 5.0 / 9.0;
		double fahrenheit = 86;

		double celsius = (fahrenheit - AJUSTE) * FATOR;

		System.out.println("O resultado é " + celsius + " ºC");
		
		fahrenheit = 150;

		celsius = (fahrenheit - AJUSTE) * FATOR;

		System.out.println("O resultado é " + celsius + " ºC");
	}
}
