package classe;

public class Jantar {
	public static void main(String[] args) {
		Comida comida1 = new Comida("arroz", 5);
		Comida comida2 = new Comida("feijao", 10);
		Comida comida3 = new Comida("carne", 15);
		
		Pessoa pessoa1 = new Pessoa("Gabriel", 90);
		pessoa1.comer(comida1);
		pessoa1.comer(comida3);		
		pessoa1.comer(comida2);				
		
		System.out.printf("A pessoa %s está pesando %.2f e antes de comer estava pesando %.2f", pessoa1.nome, pessoa1.pesoAtual, pessoa1.pesoAntesComer);
	}
}
