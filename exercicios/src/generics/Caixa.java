package generics;

public class Caixa<E> {
	private E coisa;
	
	public void guardar(E coisa) {
		this.coisa = coisa;
	}
	
	public E abrir() {
		return coisa;
	}

}
