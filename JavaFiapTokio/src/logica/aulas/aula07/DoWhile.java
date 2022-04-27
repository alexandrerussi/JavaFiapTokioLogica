package logica.aulas.aula07;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		// ------------------
		// CAMBALHOTA
		// ------------------
		
		/*
		int cc = 20;
		
		do {
			System.out.println("Cambalhota " + cc);
			cc++;
		} while (cc < 3);
		
		System.out.println("Fim");
		
		*/
		
		// ------------------
		// EXEMPLO
		// ACERTE O NUMERO (7) PARA SAIR
		// ------------------
		
		Scanner teclado = new Scanner(System.in);
		
		int numero;
		
		do {
			System.out.print("Acerte o número para sair: ");
			numero = teclado.nextInt();
			
			System.out.println("Número escolhido: " + numero);
			System.out.println("");
		} while (numero < 0 || numero > 100);
		
		System.out.println("Saiu do programa");
		
	}

}









