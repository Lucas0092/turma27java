package introducao;

import java.util.Scanner;

public class Tarefa2exercicio4_portugol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite um numero: ");
		num = leia.nextInt();
		
		if(num % 2 == 0) {
			System.out.println(num+ " Esse numero � par\n");
		}
		else {
			System.out.println(num+ " Esse numero � impar\n");
		}
		if(num < 0) {
			System.out.println(num+ " Esse numero � negativo\n");
		}
		else {
			System.out.println(num+ " Esse numero � positivo");
		}
	}

}
