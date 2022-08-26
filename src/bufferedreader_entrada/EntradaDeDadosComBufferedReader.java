package bufferedreader_entrada;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EntradaDeDadosComBufferedReader {

	public static void main(String[] args) throws IOException {
		BufferedReader teclado = new BufferedReader(
				new InputStreamReader(System.in));
		
		System.out.println("Digite seu nome");
		String nome = teclado.readLine();
		System.out.println("Digite a sua idade: ");
		int idade = Integer.parseInt(teclado.readLine()); 
		System.out.println(nome + " tem " + idade + " ano(s).");
				
	}

}
