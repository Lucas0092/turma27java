package introducao;

import java.util.Scanner;

public class ImparPar {

	public static void main(String[] args) {
		
			Scanner leia = new Scanner(System.in);
		
		int num;
		
			System.out.println("Digite um numero: ");
		num = leia.nextInt();
			
		if(num < 0) {
			System.out.println(num+ " Esse numero é invalido!");
		}
		
		else if(num == 0) {
			
			System.out.println(num+ " Esse numero é neutro!");
		}
		
		else if(num % 2 == 0) {
				
			System.out.println(num+ " Esse numero é par!");
		}
			
		else {
			System.out.println(num+ " Esse numero é impar!");
				
		}
		leia.close();
	}

}
