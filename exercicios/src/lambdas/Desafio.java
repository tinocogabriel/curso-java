package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
	public static void main(String[] args) {
		Produto p = new Produto("iPad", 3235.89, 0.50);

		Function<Produto, Double> calcularPrecoReal = produto -> {
			double precoProdutoComDesconto = produto.preco * (1 - produto.desconto);
			return precoProdutoComDesconto;
		};

		UnaryOperator<Double> calcularImposto = precoFinal -> precoFinal >= 2500 ? precoFinal * (1 - 0.085)
				: precoFinal;

		UnaryOperator<Double> calcularFrete = precoFinal -> precoFinal >= 3000 ? precoFinal + 100 : precoFinal + 50;

		Function<Double, String> arredondar = precoFinal -> String.format("%.2f", precoFinal);

		//Consumer<String> formatar = precoFinal -> System.out.printf("R$ %.2f", precoFinal);
		
		System.out.println("O preço é: R$ " + 
		calcularPrecoReal
		.andThen(calcularImposto)
		.andThen(calcularFrete)
		.andThen(arredondar)
		.apply(p));
	}
}
