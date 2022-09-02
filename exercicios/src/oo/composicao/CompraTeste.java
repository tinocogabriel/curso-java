package oo.composicao;

public class CompraTeste {
	public static void main(String[] args) {
		Compra c1 = new Compra();
		c1.cliente = "João";
		c1.adicionarItem(new Item("Caneta", 20, 7.45));
		c1.adicionarItem(new Item("Borracha", 20, 7.45));
		c1.adicionarItem(new Item("Caderno", 20, 7.45));
		
		System.out.println(c1.itens.size());
		System.out.println(c1.obterValorTotal());
	}
}
