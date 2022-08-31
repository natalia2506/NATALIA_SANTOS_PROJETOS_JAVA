package multiplicando;

public class Multiplicando {

	public static void main(String[] args) {
		 int vetor1[] = {2,4,6,3,5};
	        int vetor2[] = new int[5];
	        for(int i=0; i<5; i++)
	            vetor2[i] = vetor1[i]*3;
	        System.out.println("Multiplicando por 3...");
	        for(int i=0; i<5; i++)
	            System.out.println(vetor1[i]+" X 3 = "+vetor2[i]);

	}

}
