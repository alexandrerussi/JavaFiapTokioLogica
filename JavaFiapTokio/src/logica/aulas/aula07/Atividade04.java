package logica.aulas.aula07;

import java.util.Scanner;

public class Atividade04 {

	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);
		
		double nota1, nota2;
		
		do {
			System.out.print("Digite a primeira nota: ");
			nota1 = tec.nextDouble();
		} while (nota1 < 0 || nota1 > 10);
		
		do {
			System.out.print("Digite a segunda nota: ");
			nota2 = tec.nextDouble();
		} while (nota2 < 0 || nota2 > 10);
		
		double media = (nota1 + nota2) / 2;
		System.out.println("A média é: " + media);
		
		
	}

}
