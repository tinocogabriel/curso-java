package classe;

public class Pessoa {
	String nome; 
	double pesoAtual;
	double pesoAntesComer;
	
	Pessoa(String nome, double peso){
		this.nome = nome;
		this.pesoAtual = peso;
		this.pesoAntesComer = peso;
	}
	
	void comer(Comida comida) {
		this.pesoAtual += comida.peso;
	}
}
