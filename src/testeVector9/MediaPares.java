package testeVector9;

import java.util.Scanner;

public class MediaPares {
	public static void main(String[] args) {
		//Scanner
		Scanner sc = new Scanner(System.in);
		//receber n
		System.out.println("Digite quantidade de vectores");
		int n = sc.nextInt();
		//vect com n
		int vect[] = new int[n];
		//por dados vect n = sc
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Digite numero");
			vect[i] = sc.nextInt();
		}
		//for if par e cacl aritmedica else msg soma tds e divide por quantidade
		int soma = 0;int qtd = 0;
		for(int i = 0; i < vect.length; i++) {
			if(vect[i] % 2 == 0) {
				soma += vect[i];
				qtd ++;
			}
		}
		
		if(soma != 0) {
			double media = (double) soma / qtd;
			System.out.printf("MEDIA DOS PARES %.1f\n",media);
		} else {
			System.out.println("NENHUM NUMERO PAR");
		}
		
		sc.close();
	}
}
