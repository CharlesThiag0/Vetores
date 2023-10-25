package testeVector8;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos elementos vai ter o vetor?");
		int n = sc.nextInt();
		
		double vect[] = new double[n];

		for(int i = 0; i < vect.length; i++) {
			System.out.println("Digite");
			vect[i] = sc.nextDouble();
		}
		
		double media = 0;
		for(int i = 0; i < vect.length; i++) {
			media += vect[i];
		}
		double mediaFinal = media / n;
		System.out.printf("Media de: %.3f%n",mediaFinal);	
		
		System.out.println("Abaixo da media:");
		for(int i = 0; i < vect.length; i++) {
			if(vect[i] < mediaFinal) {
			System.out.println(vect[i]);
			}
		}
		
		sc.close();
	}
}
