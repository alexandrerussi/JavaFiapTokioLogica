package logica.exercicios.aula05;

import java.util.Scanner;

public class Aula05Exercicio05 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		float notaA, notaB;
		
		System.out.print("Digite a primeira nota: ");
		notaA = entrada.nextFloat();
		
		System.out.print("Digite a segunda nota: ");
		notaB = entrada.nextFloat();
		
		float pesos = (notaA * 4) + (notaB * 6);
		float media = pesos / 10;
		
		System.out.println("A m�dia final foi: " + media);
		
		entrada.close();
		
	}
	
}
