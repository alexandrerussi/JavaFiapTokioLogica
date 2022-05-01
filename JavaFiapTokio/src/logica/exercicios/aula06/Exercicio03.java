package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio03 {
	
	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota: ");
		double nota1 = tec.nextDouble();
		
		System.out.print("Digite a segunda nota: ");
		double nota2 = tec.nextDouble();
		
		System.out.print("Digite a terceira nota: ");
		double nota3 = tec.nextDouble();
		
		System.out.print("Digite a quarta nota: ");
		double nota4 = tec.nextDouble();
		
		double media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		if (media < 5) {
			System.out.println("Reprovado");
		} else if (media >= 5 && media < 7) {
			System.out.println("Em recuperação");
		} else {
			System.out.println("Aprovado");
		}
		
	}

}
