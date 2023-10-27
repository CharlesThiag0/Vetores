package testeVector14;

public class Loja {
	//nome produtos capacidadeMax qtd
	private String nome;
	private String produtos;
	private int capacidadeMax;
	private int qtd;
	public Loja(String nome, String produtos, int capacidadeMax, int qtd) {
		this.nome = nome;
		this.produtos = produtos;
		this.capacidadeMax = capacidadeMax;
		this.qtd = qtd;
	}
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getProdutos() {
		return this.produtos;
	}
	public void setProdutos(String produtos) {
		this.produtos = produtos;
	}
	public int getCapacidadeMax() {
		return this.capacidadeMax;
	}
	public void setCapacidadeMax(int capacidadeMax) {
		this.capacidadeMax = capacidadeMax;
	}
	public int getQtd() {
		return this.qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	
	
}
