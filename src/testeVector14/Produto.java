package testeVector14;

public class Produto {
	//nome preco
	private String nomeDoProduto;
	private double preco;
	public Produto(String nomeDoProduto, double preco) {
		this.nomeDoProduto = nomeDoProduto;
		this.preco = preco;
	}
	public String getNomeDoProduto() {
		return this.nomeDoProduto;
	}
	public void setNomeDoProduto(String nomeDoProduto) {
		this.nomeDoProduto = nomeDoProduto;
	}
	public double getPreco() {
		return this.preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
}
