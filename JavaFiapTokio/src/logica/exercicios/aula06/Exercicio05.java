package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Digite o primero número: ");
		double n1 = tec.nextDouble();
		
		System.out.println("Digite o primero número: ");
		double n2 = tec.nextDouble();
		
		System.out.println("Digite o caracter da operação [+, -, *, /]: ");
		char operacao = tec.next().charAt(0);
		
		double resultado = 0;
		
		if (operacao == '+') {
			resultado = n1 + n2;
		} else if (operacao == '-') {
			resultado = n1 - n2;
		} else if (operacao == '*') {
			resultado = n1 * n2;
		} else if (operacao == '/') {
			if (n2 == 0) {
				System.out.println("Não é possível dividir por 0");
			} else {
				resultado = n1 / n2;
			}
		} else {
			System.out.println("Operador inválido!");
		}
		
		System.out.println("Resultado: " + resultado);

	}

}
