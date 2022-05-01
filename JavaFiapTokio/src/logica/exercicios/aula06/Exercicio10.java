package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);
		
		System.out.print("Digite o salário atual: ");
		double salarioAtual = tec.nextDouble();

		double reajuste;
		
		if (salarioAtual <= 280) {
			reajuste = 0.2;
		} else if (salarioAtual < 700) {
			reajuste = 0.15;
		} else if (salarioAtual < 1500) {
			reajuste = 0.10;
		} else {
			reajuste = 0.05;
		}
		
		double valorAumento = salarioAtual * reajuste;
		double novoSalario = salarioAtual + valorAumento;
		
		System.out.println("Salário antes do reajuste: " + salarioAtual);
		System.out.println("Porcentual de aumento: " + (reajuste * 100) + "%");
		System.out.println("Valor do aumento: " + valorAumento);
		System.out.println("Novo salário com aumento: " + novoSalario);
		
	}

}
