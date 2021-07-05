package ListasExerciciosJava;

import java.util.Scanner;

public class Tarefa3exercicio5 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero=0, soma=0;
		
		do {
			System.out.println("Digite um numero: ");
			numero = leia.nextInt();
			soma+=numero;
		}
		while(numero != 0);	
		System.out.println("a soma total é: "+soma);

	}

}
