package conversaoDolarParaReal;

import java.util.Scanner;

public class ConversaoDolarParaReal {

	public static void main(String[] args) {
		double total, soma = 0; 
		int quantidade;
		Scanner scanner= new Scanner(System.in);
		System.out.println("=== CONVERSÃO DE COMPRA EM DÓLAR PARA REAIS ===");
		System.out.print("Quantos produtos tem sua compra? ");
		quantidade = scanner.nextInt();
		
		double acumulador[] = new double[quantidade];
		for (int i = 0; i < quantidade; i++) {
			System.out.print(String.format("Digite o valor do %dºproduto: US$ ", i+1));
			acumulador[i] = scanner.nextDouble();
			soma += acumulador[i];
		}
		
		total = soma*5.18;
		String mensagem = (total > 3000) ? " -Pagará 20% de imposto" 
				                         : " -Isento de imposto";
		System.out.print(String.format("O total da sua compra foi R$%.2f ", total) + mensagem);
		scanner.close();
	}

}
