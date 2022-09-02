package excecao.personalizadaA;

import excecao.Aluno;

public class TesteValidacoes {
	public static void main(String[] args) {
		try {
			Aluno aluno = new Aluno("", -7);
			
			Validar.aluno(aluno);
		} catch (StringVaziaException e) {
			System.out.println(e.getMessage());
		} catch(NumeroForaIntervaloException | IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		/* Outra forma de fazer utilizando o | quando a ação é a mesma para
		 * as duas Exceptions 
		 * 
		try {
			Aluno aluno = new Aluno("", -7);
			
			Validar.aluno(aluno);
		} catch (StringVaziaException | NumeroForaIntervaloException e) {
			System.out.println(e.getMessage());
		}
		*/
		
		System.out.println("Fim :)");
	}
}
