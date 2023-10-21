package testeVector2;

import java.util.Scanner;

public class Negativos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos numeros voce vai digitar?");
		int n = sc.nextInt();
		
		Vetores[] vect = new Vetores[n];
		
		for(int i =0; i < vect.length; i++) {
			System.out.print("DIGITE UM NUMERO: ");
			int numero = sc.nextInt();
			vect[i] = new Vetores(numero);
		}
		
		System.out.println("NUMEROS NEGATIVOS: ");
		for(int i = 0; i < vect.length; i++) {
		if(vect[i].getNumero() < 0) {
			System.out.println(vect[i].getNumero());
		}
		}
		
		sc.close();
	}
}
