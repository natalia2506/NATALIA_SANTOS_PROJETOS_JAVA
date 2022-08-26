package scanner_entrada;

import java.util.Scanner;

public class EntradaDeDadosComScanner {

		public static void main(String[] args) {
			Scanner teclado = new Scanner(System.in);
			
			System.out.println("Digite seu nome");
			String nome = teclado.nextLine();
			System.out.println("Digite a sua idade: ");
			int idade =  teclado.nextInt();
			
			System.out.println(nome + " tem " + idade + " ano(s).");
			
			teclado.close();

		}

	}
