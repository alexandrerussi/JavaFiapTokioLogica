package logica.exercicios.aula05;

import java.util.Scanner;

public class Aula05Exercicio03 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.println("Selecione seu gênero seguindo as seguintes op��es.");
		System.out.println("[M] - Masculino");
		System.out.println("[F] - Masculino");
		System.out.println("[O] - Outro");
		System.out.println("[N] - N�o responder");
		
		System.out.print("Escolha sua op��o: ");
		char genero = entrada.nextLine().charAt(0);
		
		System.out.println("Ol�, " + nome + "! Voc� escolheu a seguinte op��o de g�nero: " + genero);
		
		entrada.close();

	}

}
