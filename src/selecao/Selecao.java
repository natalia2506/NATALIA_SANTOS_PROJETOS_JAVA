package selecao;

public class Selecao {

	public static void main(String[] args) {

		int idade;
		String sexo;
		idade = 13;
		sexo = "Feminino";
		if(idade > 18 && sexo.equals("Feminino")) {
			System.out.println("Proxima etapa");
		}else {
			System.out.println("Etapa encerrada");
	
		}
		
		String grupo = (idade < 12) ?  "Criança" : 
						(idade < 18) ? "Adolescente" :
									   "Adulto";
		System.out.println(grupo);
		
		//ou
		
		if(idade < 12) {
			grupo = "Criança";
			
		}else
			if(idade < 18) {
				grupo = "adolescente";
			}
			else {
				grupo = "Adulto";
			}
		System.out.println(grupo);
	}
}
