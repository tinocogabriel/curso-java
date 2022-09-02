package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		byte anosDeEmpresa = 23;
		short numeroVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L;

		float salario = 11_445.44F;
		double vendasAcumlados = 2_991_797_103.01;

		boolean estaDeFerias = false;

		char status = 'A';

		System.out.println("Dias de empresa " + anosDeEmpresa * 365);

		System.out.println("Número de viagens " + numeroVoos / 2);

		System.out.println("Pontos por real " + pontosAcumulados / vendasAcumlados);

		System.out.println(id + " ganha " + salario);

		System.out.println("Férias? " + estaDeFerias);

		System.out.println("Status " + status);
	}
}
