package somatorio;

import java.util.Scanner;

public class Somatorio {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		 int valor = 0;
		 int soma = 0;
		 
		 System.out.println("Digite os valores, e 0 termina");
		 valor = teclado.nextInt();
		 
		 while (valor != 0) {
			 soma = soma + valor;
			 System.out.println("Digite os valores, e 0 termina");
			 valor = teclado.nextInt();
		 }
		 
		 System.out.println("A soma dos valores = " + soma);
		 	teclado.close();
	}

}