package introducao;

import java.util.Scanner;

public class Tarefa1exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int ano, mes, dia, idadeDias;
		
		System.out.println("Digite quantos anos voce tem: ");
			ano = leia.nextInt();
		System.out.println("Digite quantos meses voce tem: ");
			mes = leia.nextInt();
		System.out.println("Digite quantos dias voce tem: ");
			dia = leia.nextInt();
						
			idadeDias= (ano*365)+(mes*12)+dia;
			
			System.out.println( "Sua idade em dias é: "+idadeDias);
			
	}

}
