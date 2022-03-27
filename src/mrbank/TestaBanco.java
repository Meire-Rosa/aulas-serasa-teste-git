package mrbank;

public class TestaBanco {

	public static void main(String[] args) {
		
//		Pessoa pessoaNumero1 = new Pessoa(); //Criar uma instância = copia
//		pessoaNumero1.nome = "Maria do Bairro";
//		pessoaNumero1.profissao = "Agricultora";
//		pessoaNumero1.cpf = "643.829.641-48";
//		System.out.println("Nome: "+pessoaNumero1.nome);
//		System.out.println("Profissão: "+pessoaNumero1.profissao);
//		System.out.println("CPF: "+pessoaNumero1.cpf);
//				
//		PessoaNumero1.rg
//		
//		
//		Pessoa pessoaNumero2 = pessoaNumero1;
//		pessoaNumero2.nome = "João dos Tomates";
//		System.out.println("========================");
//		System.out.println("Nome: "+pessoaNumero2.nome);
//		System.out.println("Nome: "+ pessoaNumero1.nome);
//		
		Pessoa pessoaNova = new Pessoa(); //Instanciar a classe pessoa
		pessoaNova.setNome("José das Couves");
		System.out.println("Nome: "+pessoaNova.getNome());
		
		Pessoa pessoaComConstrutor1 = new Pessoa("João dos Tomates", "259.800.966-55", "123,456-78");
		
		System.out.println("Nome "+pessoaComConstrutor1.getNome());
		System.out.println("CPF: " +pessoaComConstrutor1.getCpf());
		System.out.println("RG: "+ pessoaComConstrutor1.getRg());
		
		
		
	}
}
