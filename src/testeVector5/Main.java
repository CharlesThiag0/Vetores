package testeVector5;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos numeros voce vai digitar? ");
		int n =sc.nextInt();
		
		ParesVect[] vect = new ParesVect[n];
		
		int numero;
		for(int i = 0; i < vect.length; i ++) {
			System.out.print("Digite um numero: ");
			numero = sc.nextInt();
			vect[i] = new ParesVect(numero);
		}
		
		int totalDePares = 0;
		System.out.println("NUMEROS PARES:");
		for(int i = 0; i < vect.length; i ++) {
			if(vect[i].getNumero() % 2 == 0 ) {
				totalDePares++;
				System.out.printf("%d ",vect[i].getNumero());
			}
		}
		
		System.out.println("\nQUANTIDADE DE PARES = " + totalDePares);
		
		
		sc.close();
	}
}
