package imc;

import java.util.Scanner;

public class Imc {

	public static void main(String[] args) {
		Scanner dados = new Scanner(System.in);
		  System.out.println("Digite o seu peso");
		  float peso = dados.nextFloat();
		  
		  System.out.println("Digite o seu altura"); 
		  float altura = dados.nextFloat();
		  
		dados.close();
		
		
		float imc = peso/(altura*altura);
		
		if(imc < 16) {
			 System.out.println("O seu imc é de " +imc+ ", considerado com magreza grave!" );
		}
		else if (imc >= 16.1 && imc <17) {
			System.out.println("O seu imc é de " +imc+ ", considerado com magreza Moderada!" );
		}
		else if (imc >= 17.1 && imc <18.5) {
			System.out.println("O seu imc é de " +imc+ ", considerado com magreza leve!" );
		}
		else if (imc >= 18.6 && imc <25) {
			System.out.println("O seu imc é de " +imc+ ", considerado com saúde!" );
		}
		else if (imc >= 25.1 && imc <30) {
			System.out.println("O seu imc é de " +imc+ ", considerado com sobrebeso!" );
		}
		else if (imc >= 30.1 && imc <35) {
			System.out.println("O seu imc é de " +imc+ ", considerado com obesidade Grau 1!" );
		}
		else if (imc >= 35.1 && imc <40) {
			System.out.println("O seu imc é de " +imc+ ", considerado com obesidade Grau 2!" );
		}
		else if (imc >40) {
			System.out.println("O seu imc é de " +imc+ ", considerado com obesidade Grau 3!" );
		}
		  
	}

}
