package ListasExerciciosJava;

import java.util.Scanner;

import Objetos.Tarefa5eletronicos;

public class Tarefa5exercicio3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Tarefa5eletronicos produto1 = new Tarefa5eletronicos();
		Tarefa5eletronicos produto2 = new Tarefa5eletronicos();
		
		System.out.println("Digite o nome do produto: ");
		produto1.nome = leia.next();
		System.out.println("Digite o nome do produto: ");
		produto2.nome = leia.next();
		
		produto1.ligar();
		produto2.desligar();
		
		
	}

}
