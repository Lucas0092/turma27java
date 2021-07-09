package Objetos;

public class Banco {
	
	private int numero;
	private double saldo;
	private double limite;
	
	//função construtor
	public Banco(int numero) {
		this.numero = numero;
	}
	//funçao construtor
	public Banco(int numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}
	public Banco(int numero, double saldo, double limite) {
		super();
		this.numero = numero;
		this.saldo = saldo;
		this.limite = limite;
	}
	//encapsulamento / botão direito, source, generate getters and setters.
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public void imprimeExtrato() {
		System.out.println("numero da conta é: "+numero+ " saldo atual é: "+saldo);
	}
	//indica que o valor negativo ou o 0 é invalido.
	public void saca(double valorSaque) {
		if(valorSaque<=0) {
			System.out.println("Valor invalido.");
		}
		//indica que o saque dará invalido caso o valor seja maior que o saldo.
		else if(valorSaque > saldo) {
			System.out.println("Valor indisponivel.");
		}
		//indica que o saque foi realizado.
		else {
			System.out.println("Saque realizado.");
		}
	}
	//indica que vai entrar dinheiro na conta.
	public void deposita(double valorDeposito) {
		saldo= saldo + valorDeposito;
	}
}
