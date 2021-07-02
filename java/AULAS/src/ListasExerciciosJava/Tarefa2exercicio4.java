package ListasExerciciosJava;

import java.util.Scanner;

public class Tarefa2exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um numero: ");
			numero = leia.nextInt();
			
			if(numero % 2 == 0) {
				System.out.println(Math.sqrt(numero));
						
			}
			else {
				System.out.println(Math.pow(numero,2));
			}
		
		
	}

}
