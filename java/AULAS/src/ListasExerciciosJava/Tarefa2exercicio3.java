package ListasExerciciosJava;

import java.util.Scanner;

public class Tarefa2exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();
		
		if(idade>10 && idade<=14) {
			System.out.println("Voce é infantil");
		}
		else if(idade>14 && idade<=17) {
			System.out.println("Voce é Juvenil");
		}
		else if(idade>17 && idade<=25) {
			System.out.println("Voce é Adulto");
		}
		else {
			System.out.println("Operação Invalida");
		}
	}

}
