package testeVector14;

public class Loja {
	//nome produtos capacidadeMax qtd
	private String nome;
	private Produto[] produtos;
	private int capacidadeMax;
	private int numeroDeProdutos;
	
	public Loja(String nome, int capacidadeMax) {
		this.nome = nome;
		this.capacidadeMax = capacidadeMax;
		this.produtos = new Produto[capacidadeMax];
		this.numeroDeProdutos = 0;
	}
	
	public String getNome() {
		return this.nome;
	}	
	public Produto[] getProdutos() {
		return this.produtos;
	}
	public void setProdutos(Produto[] produtos) {
		this.produtos = produtos;
	}
	public int getCapacidadeMax() {
		return this.capacidadeMax;
	}
	public void setCapacidadeMax(int capacidadeMax) {
		this.capacidadeMax = capacidadeMax;
	}
	public int getQtd() {
		return this.numeroDeProdutos;
	}

	public void addProduto(Produto produto) {
		if(this.numeroDeProdutos < this.capacidadeMax) {
		produtos[numeroDeProdutos] = produto;
			this.numeroDeProdutos++;
		} else {
			System.out.println("Limite atingido");
		}
	}
}
