package introducao;

import java.util.Scanner;

public class ImparPar {

	public static void main(String[] args) {
		
			Scanner leia = new Scanner(System.in);
		
		int num;
		
			System.out.println("Digite um numero: ");
		num = leia.nextInt();
			
		if(num < 0) {
			System.out.println(num+ " Esse numero � invalido!");
		}
		
		else if(num == 0) {
			
			System.out.println(num+ " Esse numero � neutro!");
		}
		
		else if(num % 2 == 0) {
				
			System.out.println(num+ " Esse numero � par!");
		}
			
		else {
			System.out.println(num+ " Esse numero � impar!");
				
		}
		leia.close();
	}

}
