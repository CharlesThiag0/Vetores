package testeVector13;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, n2, n3;
		String nome, email;

		System.out.println("How many rooms will be rented?");
		n = sc.nextInt();

		Pensinato vectQuartos[] = new Pensinato[9];
		Pensinato vectVagas[] = new Pensinato[n];

		for (int i = 0; i < vectVagas.length; i++) {
			System.out.printf("Rent #%d:", i + 1);
			System.out.print("Name: ");
			sc.nextLine();
			nome = sc.nextLine();
			System.out.print("Email: ");
			email = sc.next();
			System.out.print("Room: ");
			n2 = sc.nextInt();
			vectQuartos[n2] = new Pensinato(nome, email);
		}
	
		n3 = 0;
		System.out.println("Busy rooms:");
		for (int i = 0; i < vectQuartos.length; i++) {
			if (vectQuartos[i] != null) {
				System.out.printf("%d: %s, %s\n", n3, vectQuartos[i].getNome(), vectQuartos[i].getEmail());
			}
			n3 ++;
		}

		sc.close();
	}
}
