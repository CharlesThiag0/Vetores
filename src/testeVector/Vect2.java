package testeVector;

import java.util.Scanner;

public class Vect2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Vect2A[] vect = new Vect2A[n];
		
		for(int i=0; i < vect.length; i ++) {
			String nome = sc.next();
			double preco = sc.nextDouble();
			
			vect[i] = new Vect2A(nome, preco);
		}
		
		double precos = 0;
		for (int i = 0; i < vect.length; i ++) {
			precos += vect[i].getPreco();
		}
		
		System.out.println(precos / vect.length);
		
		
		sc.close();
	}
}
