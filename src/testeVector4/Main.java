package testeVector4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//chamar o scanner
		Scanner sc = new Scanner(System.in);
		//pegar totalDeVect
		System.out.print("Quantas pessoas serao digitadas? ");
		int totalDeVect = sc.nextInt();
		//criação do vect usando a quantidade de totalVect
		Altura[] vect = new Altura[totalDeVect];
		//loop for criação dos dados e variaveis fora
		String nome; int idade; double altura;
		for(int i = 0; i < vect.length; i ++) {
			System.out.printf("Dados da %da pessoa:\n",Altura.getContador());
			System.out.println("Nome:");
			nome = sc.next();
			System.out.println("Idade:");
			idade = sc.nextInt();
			System.out.println("Altura:");
			altura = sc.nextDouble();
			//final do loop atribuir os valor digitados
			vect[i] = new Altura(nome, idade, altura);
		}
		//loop for para calcular a media da altura
		double totalAltura = 0;double mediaDeMenor16 = 0;char modulo = '%';
		for(int i = 0;i < vect.length; i ++) {
			totalAltura += vect[i].getAltura();
			if(vect[i].getIdade() < 16) {
				mediaDeMenor16 ++;
				}
		}
		System.out.printf("Altura média: %.2f\n", totalAltura / totalDeVect);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%c%n", (mediaDeMenor16 * 100) / totalDeVect, modulo);
	
		//calculo para porcentagem
		
		// 16 anos pegar nome
		String nomeMenor16;
		for(int i = 0;i < vect.length; i ++) {
			if(vect[i].getIdade() < 16) {
			nomeMenor16 = vect[i].getNome();
			System.out.printf("%s\n", vect[i].getNome());
			}
		}
		//escaner fechado
		sc.close();
	}
}
