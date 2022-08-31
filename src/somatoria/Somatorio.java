package somatoria;

import java.util.Scanner;

public class Somatorio {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int soma = 0;
		System.out.println("Digite 10 números");
		for(int i = 1; i <= 10; i++) {
			soma += teclado.nextInt();
		}
		System.out.println("Somatório: " + soma);
		teclado.close();
	}

}
