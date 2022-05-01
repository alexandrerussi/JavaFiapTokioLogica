package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Escolha o tipo da resid�ncia");
		System.out.println("[1] - Resid�ncia");
		System.out.println("[2] - Com�rcio");
		System.out.println("[3] - Ind�stria");
		System.out.print("Escolha: ");
		int tipoCliente = tec.nextInt();
		
		System.out.print("Digite a qtd total de kW/h do m�s: ");
		double kWh = tec.nextDouble();
		
		double valorkWh = 0;
		
		if (tipoCliente == 1) {
			valorkWh = 0.6;
		} else if (tipoCliente == 2) {
			valorkWh = 0.48;
		} else if (tipoCliente == 3) {
			valorkWh = 1.29;
		} else {
			System.out.println("Tipo de cliente inv�lido.");
		}
		
		double totalConta = kWh * valorkWh;
		
		System.out.println("Total a ser pago: R$ " + totalConta);
		
	}

}
