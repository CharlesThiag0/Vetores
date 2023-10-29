package testeVector3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos numeros voce vai digitar? ");
		int numero = sc.nextInt();
		double soma , media;
		 
		SomaVect[] vect = new SomaVect[numero];//definindo o final do vect
		
		double n = 0;
		//populando vect
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Digite o numero: ");
			n = sc.nextDouble();
			vect[i] = new SomaVect(n); //orientando que o vect[X] recebe um novo vect com o dados N
		}
		
		//soma e media
		soma = 0; 
		for(int i =0; i < vect.length; i ++) {
			soma += vect[i].getNumero();
		}
		
		media = 0;
		media += soma / numero;
		
		System.out.print("VALORES = ");
		for(int i = 0; i < vect.length; i ++) {
			System.out.printf("%.1f ", vect[i].getNumero());
		}
		
		System.out.printf("\nSOMA = %.2f\n",soma);
		System.out.printf("MEDIA = %.2f\n",media);
		
		sc.close();
	}
}
