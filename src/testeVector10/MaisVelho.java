package testeVector10;

public class MaisVelho {
	private String nome;
	private int idade;
	private static int qtd = 1;
	
	public MaisVelho (String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
		MaisVelho.qtd++;
	}

	public String getNome() {
		return this.nome;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public static int getQtd() {
		return MaisVelho.qtd;
	}
}
