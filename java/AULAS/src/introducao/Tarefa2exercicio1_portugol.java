package introducao;

import java.util.Scanner;

public class Tarefa2exercicio1_portugol {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int peso, excesso;
		double multa;
		
		System.out.println("Digite o peso dos tomates em Kg: ");
			peso = leia.nextInt();
			
		if(peso> 50) {
			
			excesso= (peso-50);
			System.out.println(excesso+ " Kg excesso de peso\n"+"Voce pagara 4 reais de multa por Kg");
		}
		else {
			System.out.println("peso compativel");
		}
	}

}
