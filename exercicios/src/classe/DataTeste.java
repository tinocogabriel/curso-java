package classe;

public class DataTeste {
	public static void main(String[] args) {
		Data data1 = new Data();
		
		Data data2 = new Data(12,12,2021);
		
		System.out.printf("A primeira data é %s", data1.obterDataFormata());
		System.out.printf("\nA segunda data é %s", data2.obterDataFormata());
	}
}
	