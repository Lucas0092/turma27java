package introducao;

import java.util.Scanner;

public class Tarefa1exercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int dias, mes, ano, idadeAno, idadeMeses, idadeDias;
		
		System.out.println("Escreva sua idade em dias: ");
			dias = leia.nextInt();
		
			idadeAno= (dias/365);
			idadeMeses= (dias/12);
			idadeDias= (dias/1);
			
		System.out.println("\n Sua idade em Anos é: \n"+idadeAno);
			
		System.out.println("\n Sua idade em meses é: \n"+idadeMeses);
			
		System.out.println("\n Sua idade em Dias é: \n"+idadeDias);
			
			
		
		

	}

}
