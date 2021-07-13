package application;

import java.util.Scanner;

import entities.Funcionario;
import entities.Terceiro;


public class TesteCad {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Funcionario func1 = new Funcionario("001", 40, 10);
		Terceiro ter1 = new Terceiro("100",40,10,50);

		System.out.println("FUNCIONARIO CLT");
		System.out.println("Matricula: "+func1.getMatricula());
		System.out.println("Salario atual: R$ "+func1.salario());
		
		System.out.println("FUNCIONARIO CLT");
		System.out.println("Matricula: "+ter1.getMatricula());
		System.out.println("Salario atual: R$ "+ter1.salario());
		
	}

}
