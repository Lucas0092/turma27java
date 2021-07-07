package ListasExerciciosJava;

import java.util.Scanner;

public class Tarefa4exercicio4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int m1[][] = new int[3][3];
		int somaVetor=0, somaDiagonal=0, linha=0, coluna=0;
		
		for(linha=0;linha<3;linha++) {
			for(coluna=0;coluna<3;coluna++) {
				System.out.println("Digite um valor: ");
				m1[linha][coluna] = leia.nextInt();
				
				somaVetor += m1[linha][coluna];
			}
			somaDiagonal += m1[linha][coluna];
		}
			System.out.println("O valor da soma vetor é: "+somaVetor+ "\n");
			System.out.println("O valor da soma diagonal é: "+somaDiagonal);

	}

}
