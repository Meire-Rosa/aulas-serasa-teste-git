package arrays;

public class TesteComArrays{

	public static void main(String[] args) {

		// unidimensional => vetor
		int[] idades = {1,5,7,80,45}; //já está inicializado - porque já tem valores
		int[] idades2 = new int[5]; //não possui dados escritos pelo usuário
		
		String[] nomes = {"Julia", "Meire", "Jorge"};
		String[] nomes2 = new String[3];
		
		System.out.println("Idade: " +idades[3]+ "-Nome: "+nomes[0]);
		
		for (int i = 0; i < idades.length; i++) {
			System.out.println("Idades:" + idades[i]);
			
		}
		
		// multidimensionais
		int[][]numeros = new int[3][3];
		int valor = 1;
		
			for(int linha = 0; linha<3; linha++) {
				for(int coluna = 0; coluna<3; coluna++) {
					numeros[linha][coluna]= valor++;
			}
		}
	
		for (int linha=0; linha<3; linha++) {
			for(int coluna = 0; coluna<3; coluna++) {
			System.out.println(numeros[linha][coluna]+ "\t");	
			}
			System.out.println();
		}
		
		
	}
}
