package introducao;

import java.util.Scanner;

public class Tarefa1exercicio3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int seg, min, hor, tempoHoras, tempoMinutos;
		
		System.out.println("Escreva a duração do evento em segundos: ");
			seg = leia.nextInt();
			
			tempoHoras= (seg/3600);
			tempoMinutos= (seg/60);
			
			System.out.println("\nA duração do evento em horas é: \n"+tempoHoras);
			System.out.println("\nA duração do evento em minutos é: \n"+tempoMinutos);
			

	}

}
