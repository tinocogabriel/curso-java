package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class DesafioFilter2 {
	public static void main(String[] args) {
		Produto produto1 = new Produto("Produto 1", 100.0, 0.3, 0.0);
		Produto produto2 = new Produto("Produto 2", 500.0, 0.12, 10.0);
		Produto produto3 = new Produto("Produto 3", 600.0, 0.5, 0.0);
		Produto produto4 = new Produto("Produto 4", 400.0, 0.12, 0.0);
		Produto produto5 = new Produto("Produto 5", 200.0, 0.75, 10.0);
		
		List<Produto> produtos = Arrays.asList(produto1, produto2, produto3, produto4, produto5);
		
		Function<Produto, String> lista = p -> "O produto " + p.getNomeProduto() + " custa " + p.getValor() + " e está com desconto de " + p.getDesconto() * 100 + "% com frete gratis" ;
		
		produtos.stream()
		.filter(p -> p.getDesconto() >= 0.3)
		.filter(p -> p.getFrete() == 0)
		.map(lista)
		.forEach(System.out::println);
	}
}
