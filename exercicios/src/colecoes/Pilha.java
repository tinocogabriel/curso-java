package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	public static void main(String[] args) {
		Deque<String> livros = new ArrayDeque<String>();
		
		/**
		 *Nesse caso o push retorna um erro caso o tamanho definido da 
		 *pilha seja ultrapassado e o add retorna o verdadeiro ou falso
		 *com base no tamanho
		 */
		livros.add("O pequeno principe");
		livros.push("Don Quixote");
		livros.push("O Hobbit");
		
		System.out.println(livros.peek());
		System.out.println(livros.peek());
		
		System.out.println(livros.pop()); //caso esteja vazio retorna exception
		System.out.println(livros.poll());
	}
}
