package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	String nome;
	List<Compra> compras = new ArrayList<>();
	
	Cliente(String nome){
		this.nome = nome;
	}
	
	void adicionarCompra(Compra compra){
		this.compras.add(compra);
	}
	
	double obterValorCompra() {
		double total = 0;
		
		for(Compra compra : compras) {
			for(Item item : compra.itens) {
				total += item.quantidade * item.produto.preco;
			}
		}
		
		return total;
	}
}
