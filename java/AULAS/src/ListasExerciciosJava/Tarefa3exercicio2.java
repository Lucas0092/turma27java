package ListasExerciciosJava;

import java.util.Scanner;

public class Tarefa3exercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero, contador=0, contPar=0, contImpar=0;
		
		for(contador=1;contador<=10;contador++) {
			System.out.println("Digite um numero: ");
			numero = leia.nextInt();
			
			if (numero % 2 == 0) {
				contPar++;
			}
			if (numero % 2 ==1) {
				contImpar++;
			}
		}
		System.out.println("Foram colocados "+contPar+" numeros pares");
		System.out.println("Foram colocados "+contImpar+" numeros impares");

	}

}
