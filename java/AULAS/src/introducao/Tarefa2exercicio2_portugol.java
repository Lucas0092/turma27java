package introducao;

import java.util.Scanner;

public class Tarefa2exercicio2_portugol {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int horas, codigo, excesso;
		double salario, multa, total;
		String nome;
		
		System.out.println("Digite seu nome: ");
		nome = leia.next();
		System.out.println("Horas trabalhadas: ");
		horas = leia.nextInt();
		
		salario= (horas*10);
		excesso= (horas-50);
		multa= (excesso*20);
		total= (multa+salario);
		
		
		if(horas>50) {
			System.out.println(excesso+ " Horas de excesso\n"+multa+ " reais de extras\n"+total+ " reais");
			
		}
		else {
			System.out.println(total+ " reais");
		}
		
	}
}
