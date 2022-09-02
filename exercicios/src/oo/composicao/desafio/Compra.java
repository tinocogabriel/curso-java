package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	List<Item> itens = new ArrayList<Item>();
	
	void adicionarCompra(Item item){
		itens.add(item);
	}
}
