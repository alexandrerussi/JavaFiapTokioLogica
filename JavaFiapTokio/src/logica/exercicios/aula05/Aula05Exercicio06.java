package logica.exercicios.aula05;

import java.util.Scanner;

public class Aula05Exercicio06 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		// PE�A 1
		
		System.out.print("Digite o nome da pe�a 1: ");
		String nomePeca1 = entrada.nextLine();
		
		System.out.print("Digite o n�mero de pe�as 1: ");
		int numPecas1 = Integer.parseInt(entrada.nextLine());
		
		System.out.print("Digite o valor unit�rio da pe�a 1: ");
		float valorPeca1 = Float.parseFloat(entrada.nextLine());
		
		System.out.println("");
		
		// ----------- PE�A 2 -----------------
		
		System.out.print("Digite o nome da pe�a 2: ");
		String nomePeca2 = entrada.nextLine();
		
		System.out.print("Digite o n�mero de pe�as 2: ");
		int numPecas2 = Integer.parseInt(entrada.nextLine());
		
		System.out.print("Digite o valor unit�rio da pe�a 2: ");
		float valorPeca2 = Float.parseFloat(entrada.nextLine());
		
		entrada.close();
		
		System.out.println("");
		
		// ----------------------
		
		float valorFinalPeca1 = numPecas1 * valorPeca1;
		float valorFinalPeca2 = numPecas2 * valorPeca2;
		
		System.out.printf("Valor � ser pago pela pe�a 1 (%s): R$ %.2f \n", nomePeca1, valorFinalPeca1);
		System.out.printf("Valor � ser pago pela pe�a 2 (%s): R$ %.2f \n", nomePeca2, valorFinalPeca2);
		System.out.format("Valor total: R$ %.2f", valorFinalPeca1 + valorFinalPeca2);

	}

}
