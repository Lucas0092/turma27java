package ListasExerciciosJava;

import java.util.Scanner;

public class Tarefa4exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int pontuacao[] = new int[5];
		int maiorPontuacao=0;
		
		for(int x=0;x<5;x++) {
			pontuacao[x] = leia.nextInt();
		if(pontuacao[x]>maiorPontuacao) {
			maiorPontuacao = pontuacao[x];
		}
		}
		
		System.out.println("A maior pontuacao é: \n"+maiorPontuacao);
	}

}
