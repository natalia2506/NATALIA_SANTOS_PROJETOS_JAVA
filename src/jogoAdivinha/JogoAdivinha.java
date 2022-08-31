package jogoAdivinha;

import java.util.Scanner;

public class JogoAdivinha {

	public static void main(String[] args) {

		Scanner dados = new Scanner(System.in);
		System.out.println("Qual ano o Basil foi Tetra na Copa do mundo de Futebol?");
		int num = dados.nextInt();
	dados.close();
	
	switch (num) {
	case 1988:
		System.out.println("vc errou");
		break;
	case 1994:
		System.out.println("acertou");
		break;
	case 2002: 
		System.out.println("vc errou");
		break;
	case 1978:
		System.out.println("vc errou");
		break;
	default:
		System.out.println("numero invalido");
		break;
	}

	}

}
