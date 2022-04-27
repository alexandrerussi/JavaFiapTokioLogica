package logica.aulas.aula07;

import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {

		Scanner receba = new Scanner(System.in);
		
		System.out.print("Digite um num: ");
		int num = receba.nextInt();
		
		int cont = 0;
		
		while (cont < num) {
			cont++;
			System.out.println(cont);
		}
		
		
	}

}
