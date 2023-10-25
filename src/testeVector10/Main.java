package testeVector10;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas voce vai digitar?");
		int n = sc.nextInt();
		
		MaisVelho vect[] = new MaisVelho[n];
		
		String nome;int idade;int maisVelhoI = Integer.MIN_VALUE;String maisVelhoN = "";
		for(int i = 0; i < vect.length; i++) {
		System.out.printf("Dados da %da pessoa:\n", MaisVelho.getQtd());	
		System.out.print("Nome: ");
		nome = sc.next();
		System.out.print("Idade: ");
		idade = sc.nextInt();
		vect[i] = new MaisVelho(nome, idade);
		
			if(maisVelhoI < vect[i].getIdade()) {
				maisVelhoI = vect[i].getIdade();
				maisVelhoN = vect[i].getNome();
		}
		}
		System.out.printf("PESSOA MAIS VELHA: %s\n",maisVelhoN);
		
		
		sc.close();
	}
}
