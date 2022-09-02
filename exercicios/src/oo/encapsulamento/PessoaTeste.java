package oo.encapsulamento;

public class PessoaTeste {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Gabriel", "Tinoco", 27);
		//p1.idade = -10; //alterar
		p1.setIdade(30);
		
		System.out.println(p1.getNomeCompleto());
		System.out.println(p1.getIdade());
	}
}
