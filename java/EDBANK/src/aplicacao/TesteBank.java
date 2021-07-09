package aplicacao;

import java.util.Scanner;

import entidades.Conta;
import entidades.ContaEspecial;
import entidades.ContaPoupanca;

public class TesteBank {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Conta cli1 = new Conta(34,"Ariel");
		double valor;
		String nome;
		int numero;
		
		/*
		System.out.println("Digite o nome do cliente: ");
		nome = leia.next();
		System.out.println("Digite o numero da conta: ");
		numero = leia.nextInt();*/
		
		ContaPoupanca cp1 = new ContaPoupanca(5,"MARCOS",15);
		ContaEspecial ce1 = new ContaEspecial(113,"MARIA");
		
		
		System.out.println("Cliente: "+cp1.getNomeCliente());
		System.out.println("Saldo atual:R$ "+cp1.getSaldo());
		System.out.println("digite o valor do credito: ");
		valor = leia.nextDouble();
		cp1.credito(valor);
		System.out.println("Saldo atual:R$ "+cp1.getSaldo());
		
		System.out.println("digite o valor do debito: ");
		valor = leia.nextDouble();
		cp1.debito(valor);
		System.out.println("Saldo atual:R$ "+cp1.getSaldo());
	}
		
	
	
}
