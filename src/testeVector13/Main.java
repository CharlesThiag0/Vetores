package testeVector13;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, n2;
		String nome, email;

		System.out.println("How many rooms will be rented?");
		n = sc.nextInt();

		Pensinato vectQuartos[] = new Pensinato[10];
		
		for (int i = 0; i < n; i++) {
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
	
		System.out.println("Busy rooms:");
		for (int i = 0; i < vectQuartos.length; i++) {
			if (vectQuartos[i] != null) {
				System.out.printf("%d: %s, %s\n", i, vectQuartos[i].getNome(), vectQuartos[i].getEmail());
			}
		}

		sc.close();
	}
}
