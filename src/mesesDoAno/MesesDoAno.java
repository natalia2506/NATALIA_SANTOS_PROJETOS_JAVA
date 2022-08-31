package mesesDoAno;

import java.util.Scanner;

public class MesesDoAno {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int teste;
		
		System.out.println("Digite o mês em número inteiro");
		teste = entrada.nextInt();
		
		
		switch (teste) {
		case 1:
			System.out.println("janeiro");
			break;
		case 2:
			System.out.println("fevereiro");
			break;
		case 3: 
			System.out.println("março");
			break;
		case 4:
			System.out.println("Abril");
			break;
		case 5:
			System.out.println("Maio");
			break;
		case 6:
			System.out.println("Junho");
			break;
		case 7:
			System.out.println("Julho");
			break;
		case 8:
			System.out.println("Agosto");
			break;
		case 9:
			System.out.println("Setembro");
			break;
		case 10:
			System.out.println("Outubro");
			break;
		case 11:
			System.out.println("Novembro");
			break;
		case 12:
			System.out.println("Dezembro");
			break;
		default:
			System.out.println("Digite somente números entre 1 e 12");
			break;
			
		}
		entrada.close();
	}
}
	