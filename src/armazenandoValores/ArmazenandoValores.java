package armazenandoValores;

import java.util.Scanner;

public class ArmazenandoValores {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double[] valores = new double[7];
		
		for(int x = 0; x < 7; x++) {
			System.out.print("informe " + (x + 1) + "º valor " );
		
			valores[x] = entrada.nextDouble();
		}	
		System.out.println(" == Valores armazenados no vetor == ");
		for(int x = 0; x < 7; x++) {
			System.out.print(" Valor na posição " + x + " = " + valores[x] );
		}
		 entrada.close();
	}
}
