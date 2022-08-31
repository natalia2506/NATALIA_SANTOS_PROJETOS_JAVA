package tabuada;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int valor;
		int i = 1;
		
		System.out.println("Digite um valor para criar um tabuada:");
		valor = entrada.nextInt();
		
		while (i <= 10) {
			System.out.println(valor + "X" + i + "=" +(valor * i));
			i++;
		}
		
		entrada.close();

	}

}
