package testeVector11;

import java.util.Scanner;
import testeImport.NomeNota1Nota2;

public class Aprovados {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos alunos serao digitados?");
		int n = sc.nextInt();

		NomeNota1Nota2 vect[] = new NomeNota1Nota2[n];

		String nome = "";
		double nota1;
		double nota2;
		double media = 0;
		for (int i = 0; i < vect.length; i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %do aluno: ", i+1);
			sc.nextLine();
			nome = sc.nextLine();
			nota1 = sc.nextDouble();
			nota2 = sc.nextDouble();
			media = (nota1 + nota2) / 2;
			vect[i] = new NomeNota1Nota2(nome, nota1, nota2, media);
		}

		System.out.println("Alunos aprovados: ");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getMedia() >= 6.0) {
				System.out.println(vect[i].getNome());
			}
		}

		sc.close();
	}
}
