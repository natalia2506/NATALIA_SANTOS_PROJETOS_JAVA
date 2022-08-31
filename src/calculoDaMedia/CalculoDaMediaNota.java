package calculoDaMedia;

import java.util.Scanner;

public class CalculoDaMediaNota {

	public static void main(String[] args) {
		double media, acumulador = 0;
		Scanner scanner= new Scanner(System.in);
		System.out.println("----Calculo da média ----");
		System.out.print("Insira a 1ª nota:");
		acumulador += scanner.nextDouble();
		System.out.print("Insira a 2ª nota:");
		acumulador += scanner.nextDouble();
		System.out.print("Insira a 3ª nota:");
		acumulador += scanner.nextDouble();
		
		media = acumulador / 3;
		
		if(media > 6){
			System.out.print("APROVADO DIRETO");
		} else if((media >= 5) && (media <= 6)){
			System.out.print("APROVADO COM RECUPERAÇÃO");} 
		else{
			System.out.print("REPROVADO");
		}
		
		scanner.close();

	}

}
