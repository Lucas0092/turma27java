package ListasExerciciosJava;

import java.util.Scanner;

import Objetos.Tarefa5Clientes;

public class Tarefa5exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Tarefa5Clientes cliente1 = new Tarefa5Clientes();
		Tarefa5Clientes cliente2 = new Tarefa5Clientes();
		Tarefa5Clientes cliente3 = new Tarefa5Clientes();
		int idade;
		
		
		System.out.println("Cliente 1\n");
		System.out.println("Digite o seu nome: ");
		cliente1.nome= leia.next();
		System.out.println("Digite seu sexo[M, F, O]: ");
		cliente1.sexo = leia.next().toUpperCase().charAt(0);
		System.out.println("Digite o ano de nascimento: ");
		cliente1.anoNascimento = leia.nextInt();
		idade = cliente1.idadeTotal(2021);
		
		System.out.println("Cliente 2\n");
		System.out.println("Digite o seu nome: ");
		cliente2.nome= leia.next();
		System.out.println("Digite seu sexo[M, F, O]: ");
		cliente2.sexo = leia.next().toUpperCase().charAt(0);
		System.out.println("Digite o ano de nascimento: ");
		cliente2.anoNascimento = leia.nextInt();
		idade = cliente2.idadeTotal(2021);
		
		System.out.println("Cliente 3\n");
		System.out.println("Digite o seu nome: ");
		cliente3.nome= leia.next();
		System.out.println("Digite seu sexo[M, F, O]: ");
		cliente3.sexo = leia.next().toUpperCase().charAt(0);
		System.out.println("Digite o ano de nascimento: ");
		cliente3.anoNascimento = leia.nextInt();
		idade = cliente3.idadeTotal(2021);
		
		System.out.println(cliente1.nome+ " Sua idade é: "+cliente1.idadeTotal(2021));
		System.out.println(cliente2.nome+ " Sua idade é: "+cliente2.idadeTotal(2021));
		System.out.println(cliente3.nome+ " Sua idade é: "+cliente3.idadeTotal(2021));
	}

}
