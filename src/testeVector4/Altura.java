package testeVector4;

public class Altura {
	//Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
	//tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
	//bem como os nomes dessas pessoas caso houver. 
	
	//atributos + contador static
	private static int contador = 1;
	private String nome;
	private int idade;
	private double altura;
	
	//construtor
	public Altura (String nome, int idade , double altura) {
		Altura.contador++;
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}
	
	//get
	public static int getContador() {
		return Altura.contador;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public double getAltura() {
		return this.altura;
	}
	
}
