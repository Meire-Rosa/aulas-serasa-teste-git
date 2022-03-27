package entradadedados;

import java.util.Scanner;

public class TesteEntradaDeDados {
	
	public static void main(String[] args) {
		
		System.out.println("Informe um nome completo");
		Scanner entradaDeDados = new Scanner(System.in);
		
		String nome = entradaDeDados.nextLine();
		
		System.out.println("Nome informado é: "+ nome);
		
		System.out.println("Informe sua idade");
		
		int idade = entradaDeDados.nextInt();
		System.out.println("Idade informada: "+ idade);
		
		System.out.println("Informe o Sexo");
		entradaDeDados.nextLine(); // Limpar para deixar vazio - Gambiarra....rsrs
		String sexo = entradaDeDados.next();
		
		System.out.println("Sexo Informado: "+ sexo);
		
	}
	
	
	

}
