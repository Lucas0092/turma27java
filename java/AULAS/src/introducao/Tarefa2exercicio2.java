package introducao;

import java.util.Scanner;

public class Tarefa2exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia= new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.println("Digite o primeiro numero:");
		num1 = leia.nextInt();
		System.out.println("Digite o segundo numero:");
		num2 = leia.nextInt();
		System.out.println("Digite o terceiro numero:");
		num3 = leia.nextInt();
		
			if(num1 == num2 && num2 == num3) {
			System.out.printf("1: %d 2: %d 3: %d",num1,num2,num3);
		}
			else if(num1 >= num2 && num2 >= num3) {
			System.out.printf("1: %d 2: %d 3: %d",num3,num2,num1);
		
		}
			else if(num1 >= num2 && num1 >= num3 && num3 >= num2) {
				System.out.printf("1: %d 2: %d 3: %d",num2,num3,num1);
			
		}
			else if(num2 >= num1 && num2 >= num3 && num3 >= num1) {
				System.out.printf("1: %d 2: %d 3: %d",num1,num3,num2);
			
		}
			else if(num2 >= num1 && num1 >= num3 && num3 >= num2) {
				System.out.printf("1: %d 2: %d 3: %d",num3,num1,num2);
			
		}
	}

}
