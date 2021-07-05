package ListasExerciciosJava;

import java.util.Scanner;

public class Tarefa3exercicio3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade=0, contador1=0, contador2=0;
		
		
		
		while(idade<=99 && idade>=0) {
			System.out.println("Digite sua idade: ");
			idade = leia.nextInt();
			
			if(idade<21) {
				contador1++;
			}
			if(idade>50 && idade<=99) {
				contador2++;
			}
		}
		
		System.out.println("Total de pessoas com menos de 21 anos é: "+contador1);
		System.out.println("Total de pessoas com mais de 50 anos é: "+contador2);
	}
	

}
