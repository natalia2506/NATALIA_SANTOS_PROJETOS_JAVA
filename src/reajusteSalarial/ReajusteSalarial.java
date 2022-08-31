package reajusteSalarial;

import java.util.Scanner;

public class ReajusteSalarial {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		final int TAM = 5;
		String[] nome = new String[TAM];
		double[] salario = new double[TAM];
		double reajuste;
		
		for(int x = 0; x < TAM; x++) {
			System.out.print(" Nome do " + (x + 1) + "º funcionario: " );
			nome[x] = entrada.next();
			System.out.println("Salario: R$");
			salario[x] = entrada.nextDouble();
		}	
		System.out.println("== Informe o valor do Reajuste (%): == ");
		
		reajuste = entrada.nextDouble();
		System.out.println("== Informações Atualizadas == ");
		for(int x = 0; x < TAM; x++) {
			System.out.println("NOME: " + nome[x] + 
					"- NOVO SALARIO: " + 
					(salario[x] += salario[x]*reajuste/100));
		}
		 entrada.close();

	}

}

