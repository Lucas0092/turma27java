package ListasExerciciosJava;

import java.util.Scanner;

public class Tarefa3exercicio6 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero=0, soma=0, media=0, contador=0;
		
		do {
			System.out.println("Digite um numero: ");
			numero = leia.nextInt();
			if (numero % 3 == 0 && numero!=0) {
			soma+=numero;
			contador++;
			
			
			}
		}
			
		while(numero != 0);
			media= soma/contador;
			System.out.println("a media total é: "+media);
		
		

	}
}
