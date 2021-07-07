package ListasExerciciosJava;

import java.util.Scanner;

public class Tarefa4exercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int lancamento[] = new int[10];
		int somaLancamento=0, medialanc=0, maiorlanc=0, maiorOcorrencia=0;
		
		for(int x=0;x<10;x++) {
			System.out.println("qual valor do lançamento: ");
				lancamento[x] = leia.nextInt();
				somaLancamento += lancamento[x];
				medialanc= somaLancamento/10;
				
				if(lancamento[x]>maiorlanc) {
					maiorlanc = lancamento[x];
				}
		}
		for(int x=0;x<10;x++) {
			if(lancamento[x] == maiorlanc) {
				maiorOcorrencia++;
			}
		}
		System.out.println("O valor da soma é: "+somaLancamento+ "\n");
		System.out.println("O valor da media é: "+medialanc+ "\n");
		System.out.println("O maior numero é: "+maiorlanc+ " sendo a maior ocorrencia: "+maiorOcorrencia);
	}

}
