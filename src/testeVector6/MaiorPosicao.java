package testeVector6;

import java.util.Scanner;

public class MaiorPosicao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos numeros voce vai digitar?  ");
		int n = sc.nextInt();
		
		ValorDouble[] vect = new ValorDouble[n];
		
		double valor;
		for(int i = 0; i < vect.length; i ++) {
			System.out.print("Digite um numero: ");
			valor = sc.nextDouble();
			vect[i] = new ValorDouble(valor, i);
		}
		
		double maior = Integer.MIN_VALUE;
		int posicao = 0;
		for(int i =0; i < vect.length; i ++) {
			if(vect[i].getNumero() > maior) {
				maior = vect[i].getNumero();
				posicao = i;
			}
		}
		
		System.out.println("MAIOR VALOR = " + maior);
		System.out.println("POSICAO DO MAIOR VALOR = " + posicao);
		
		sc.close();
	}
}
