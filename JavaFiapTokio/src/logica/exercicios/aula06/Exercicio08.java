package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);
		
		System.out.print("Distância total percorrida (km): ");
		double disTotal = tec.nextDouble();
		
		System.out.print("Combustível gasto nesse caminho em Litros: ");
		double combustivel = tec.nextDouble();
		
		double autonomia = disTotal / combustivel; //  -->  km/L
		
		
		if (autonomia < 8) {
			System.out.println("O carro bebe hein!");
		} else {
			System.out.println("Autonomia legal!");
		}
		
	}

}
