package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		
		System.out.print("Primeiro num: ");
		int num1 = tec.nextInt();
		
		System.out.print("Segundo num: ");
		int num2 = tec.nextInt();
		
		if (num1 > num2) {
			System.out.println(num1);
		} else if (num2 > num1) {
			System.out.println(num2);
		} else {
			System.out.println("Iguais");
		}
		
	}

}
