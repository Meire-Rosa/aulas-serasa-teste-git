package mrbank;

public class Conta {

	private int agencia;
	private int conta;
	private double saldo;
	private String tipoConta;
	
	//construtores
	
	public Conta() {//metodo construtor default
		
	}
	
	public Conta(int agencia, int conta, String tipoConta) {//metodo construtor com sobrecarga
		super();
		this.agencia = agencia;
		this.conta = conta;
		this.tipoConta = tipoConta;
	}

	// metodos
	
	
	//encapsulamentos
	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}
	
	
	
	
}
