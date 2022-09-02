package streams;

public class Produto {
	private String nomeProduto;
	private Double valor;
	private Double desconto;
	private Double frete;
	
	public Produto(String nomeProduto, Double valor, Double desconto, Double frete) {
		super();
		this.nomeProduto = nomeProduto;
		this.valor = valor;
		this.desconto = desconto;
		this.frete = frete;
	}
	
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public Double getValor() {
		return valor;
	}
	
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public Double getDesconto() {
		return desconto;
	}
	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}
	public Double getFrete() {
		return frete;
	}
	public void setFrete(Double frete) {
		this.frete = frete;
	}

}
