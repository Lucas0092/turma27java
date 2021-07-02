package ListasExerciciosJava;

import java.util.Scanner;

public class Tarefa2exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.println("Digite o primeiro numero: ");
			num1 = leia.nextInt();
		System.out.println("Digite o segundo numero: ");
			num2 = leia.nextInt();
		System.out.println("Digite o terceiro numero: ");
			num3 = leia.nextInt();
			
			if(num1 > num2 && num1 > num3) {
				System.out.println("O maior numero é: "+num1);
			}
			else if(num2 > num1 && num2 > num3) {
				System.out.println("O maior numero é: "+num2);
			}
			else if(num3 > num1 && num3 > num2) {
				System.out.println("O maior numero é: "+num3);
			}
			else {
				System.out.println("Fim de programa");
			}
	}

}
