package classe;

public class ProdutoTeste {
	public static void main(String[] args) {

		Produto produto1 = new Produto("Notebook", 4356.89);

		var produto2 = new Produto();
		produto2.nome = "Caneta";
		produto2.preco = 3.00;
		
		Produto.desconto = 0.50;

		System.out.println(produto1.nome);
		System.out.println(produto2.nome);

		double precoFinal1 = produto1.precoComDesconto(0.0);
		double precoFinal2 = produto2.precoComDesconto();
		double mediaCarrinho = (precoFinal1 - precoFinal2) / 2;
		
		System.out.printf("Média do carrinho = R$%.2f", mediaCarrinho);
	}
}
