package entidades;

public class Conta {
	
	private int numero;
	private String nomeCliente;
	private double saldo;
	
	//construtor/ botao direito, soucer, generate constructor using fields
	public Conta(int numero, String nomeCliente) {
		super();
		this.numero = numero;
		this.nomeCliente = nomeCliente;
	}
	//encapsulamento / getters and setters.
	public int getNumero() {
		return numero;
	}
	/*
	public void setNumero(int numero) {
		this.numero = numero;
	}*/
	
	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public double getSaldo() {
		return saldo;
	}
	/*
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}*/
	
	//metodos
	
	public void credito (double valorCredito) {
		this.saldo= this.saldo + valorCredito;
	}
	
	public void debito(double valorDebito) {
		if(valorDebito>saldo || valorDebito<=0) {
			System.out.println("Impossivel realizar opera��o...");
		}
		else {
			this.saldo = this.saldo - valorDebito;
		}
		
	}
	

}
