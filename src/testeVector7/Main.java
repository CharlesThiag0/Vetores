package testeVector7;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos valores vai ter cada vetor?");
		int n = sc.nextInt();
		
		SomaVect[] vectA = new SomaVect[n];
		SomaVect[] vectB = new SomaVect[n];
		SomaVect[] vectC = new SomaVect[n];
		
		int numeroA, numeroB, soma;
		System.out.println("Digite os valores do vetor A:");
		for(int i = 0; i < vectA.length; i++) {
			numeroA = sc.nextInt();
			vectA[i] = new SomaVect(numeroA);
		}
		
		System.out.println("Digite os valores do vetor B:");
		for(int i = 0; i < vectB.length; i++) {
			numeroB = sc.nextInt();
			vectB[i] = new SomaVect(numeroB);
		}
	
		System.out.println("VETOR RESULTANTE:");
		for(int i = 0; i < vectC.length; i ++) {
			soma = vectA[i].getNumero() + vectB[i].getNumero();
			System.out.println(soma);
		}
		
		sc.close();
	}
}
