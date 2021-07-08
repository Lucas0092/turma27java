package ListasExerciciosJava;

import java.util.Scanner;

import Objetos.Tarefa5Aviao;

public class Tarefa5exercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Tarefa5Aviao aviao1 = new Tarefa5Aviao();
		Tarefa5Aviao aviao2 = new Tarefa5Aviao();
		
		System.out.println("Digite o nome do Avião: ");
		aviao1.nome= leia.next();
		System.out.println("Qual o tamanho do avião: "+" metros");
		aviao1.tamanhoAviao= leia.nextInt();
		System.out.println("Digite o nome do Avião: ");
		aviao2.nome= leia.next();
		System.out.println("Qual o tamanho do avião: ");
		aviao2.tamanhoAviao= leia.nextInt();
		
		aviao1.ligado= false;
		aviao1.desligar();
		aviao1.tamAviao();
		
		aviao2.ligado= true;
		aviao2.ligar();
		aviao2.tamAviao();
		
		
	}

}
