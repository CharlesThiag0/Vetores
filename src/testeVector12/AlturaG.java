package testeVector12;

import java.util.Scanner;
import testeImport2.AlturaGenero;

public class AlturaG {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		AlturaGenero vect[] = new AlturaGenero[n];
		
		double altura;
		char genero;
		
		for(int i = 0; i < vect.length; i++) {
			System.out.printf("Altura da %da pessoa: ", i +1);
			altura = sc.nextDouble();
			System.out.printf("Genero da %da pessoa: ", i +1);
			genero = sc.next().charAt(0);
			vect[i] = new AlturaGenero(altura, genero);
		}
		
		double maiorAltura = Integer.MIN_VALUE;
		double menorAltura = Integer.MAX_VALUE;
		for(int i = 0; i < vect.length; i++) {
			if(vect[i].getAltura() > maiorAltura) {
				maiorAltura = vect[i].getAltura();
			}
			
			if(vect[i].getAltura() < menorAltura) {
				menorAltura = vect[i].getAltura();
		}
	}
		System.out.printf("Menor altura: %.2f\n",menorAltura);
		System.out.printf("Maior altura: %.2f\n",maiorAltura);
		
		double soma = 0;
		int qtdF = 0;
		int qtdM = 0;
		for(int i = 0; i < vect.length; i++) {
			if(vect[i].getGenero() == 'F') {
			soma += vect[i].getAltura();
			qtdF++;
		} else {
			qtdM++;
		}
		}
		System.out.printf("Media das alturas das mulheres = %.2f\n", soma / qtdF);
		System.out.println("Numero de homens = " + qtdM);
	
		sc.close();
	}
}
