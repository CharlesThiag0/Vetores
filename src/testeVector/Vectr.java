package testeVector;

import java.util.Scanner;

public class Vectr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for(int i=0; i<n; i++) {
			vect[i] = sc.nextDouble();
		}
		
		double soma = 0.0;
		for(int i=0; i<n; i++) {
			soma += vect[i];
		}
		
		System.out.printf("%.2f",soma / n);
		
		sc.close();
	}
}
