package Objetos;

public class Banco {
	
	private int numero;
	private double saldo;
	private double limite;
	
	//fun��o construtor
	public Banco(int numero) {
		this.numero = numero;
	}
	//fun�ao construtor
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
	//encapsulamento / bot�o direito, source, generate getters and setters.
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
		System.out.println("numero da conta �: "+numero+ " saldo atual �: "+saldo);
	}
	//indica que o valor negativo ou o 0 � invalido.
	public void saca(double valorSaque) {
		if(valorSaque<=0) {
			System.out.println("Valor invalido.");
		}
		//indica que o saque dar� invalido caso o valor seja maior que o saldo.
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
