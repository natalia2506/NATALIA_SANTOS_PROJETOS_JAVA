package cadastroDePecas;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroDePecas {

	
	static class Peca{
		int codigo;
		int quantidade;
		double preco;
	}

	public static void main(String[] args) {
		ArrayList<Peca>  pecas = new ArrayList<>();
		
		Scanner teclado = new Scanner(System.in);
		
		boolean parar = false;
		while(!parar) {
		
			System.out.println("Incluir peça? (S/N)");
			String resposta = teclado.nextLine();
			resposta = resposta.toUpperCase();
			if(resposta.equals("S")) {
				Peca p = new Peca();
				System.out.println("Codigo:");
				p.codigo = teclado.nextInt();
				System.out.println("Quantidade:");
				p.quantidade = teclado.nextInt();
				System.out.println("Preço"); //colocar número inteiro ou número com virgula
				p.preco = teclado.nextDouble();
				teclado.nextLine();
				pecas.add(p);
				
			}else {
				parar = true;
			}
		}
		teclado.close();
		
		double total = 0;
		for(Peca p: pecas) {
			System.out.printf("%5d\t%3d\t%8.2f\n",
					p.codigo, p.quantidade, p.preco);
			total += p.quantidade * p.preco;
		}
		System.out.printf("Total: %8.2f", total);
	}

}
