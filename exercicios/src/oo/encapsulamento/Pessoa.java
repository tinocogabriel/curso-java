package oo.encapsulamento;

public class Pessoa {

	private int idade;
	private String nome;
	private String sobrenome;

	public Pessoa(String nome, String sobrenome, int idade) {
		setNome(nome);
		setSobrenome(sobrenome);
		setIdade(idade);
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		idade = Math.abs(idade);
		if (idade >= 0 && idade <= 120) {
			this.idade = idade;
		}
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}
	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public String getNomeCompleto() {
		return nome + " " + sobrenome;
	}
}
