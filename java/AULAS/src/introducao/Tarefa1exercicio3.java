package introducao;

import java.util.Scanner;

public class Tarefa1exercicio3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int seg, min, hor, tempoHoras, tempoMinutos;
		
		System.out.println("Escreva a dura��o do evento em segundos: ");
			seg = leia.nextInt();
			
			tempoHoras= (seg/3600);
			tempoMinutos= (seg/60);
			
			System.out.println("\nA dura��o do evento em horas �: \n"+tempoHoras);
			System.out.println("\nA dura��o do evento em minutos �: \n"+tempoMinutos);
			

	}

}
