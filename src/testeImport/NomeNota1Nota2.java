package testeImport;

public class NomeNota1Nota2 {
	//atributos nome, nota1 nota2 e qtd STATIC
	private String nome;
	private double nota1;
	private double nota2;
	private double media;
	
	public NomeNota1Nota2 (String nome, double nota1, double nota2, double media) {
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.media = media;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public double getNota1() {
		return this.nota1;
	}
	
	public double getNota2() {
		return this.nota2;
	}
	
	public double getMedia() {
		return this.media;
	}
	
}
