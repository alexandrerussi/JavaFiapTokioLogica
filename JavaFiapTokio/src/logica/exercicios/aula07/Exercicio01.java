package logica.exercicios.aula07;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);
		
		String novamente;
		
		do {
			System.out.println("Olá, Mundo!");
			
			System.out.print("Deseja exibir novamente? ");
			novamente = tec.nextLine();
			
		} while (novamente.equals("sim"));
		
		System.out.println("Fim");

	}

}
