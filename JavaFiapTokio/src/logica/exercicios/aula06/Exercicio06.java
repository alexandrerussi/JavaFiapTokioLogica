package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		
		System.out.print("Digite o ano de nasc: ");
		int anoNasc = tec.nextInt();
		
		int anoAtual = 2022; // seria possível receber esse valor com a classe Calendar
		
		int idade = anoAtual - anoNasc;
		
		boolean votoOpcionalMenor = idade >= 16 && idade < 18;
		
		if (idade < 16) {
			System.out.println("Voto proibido este ano");
		} else if (votoOpcionalMenor || idade > 70) {
			System.out.println("Voto é opcional este ano");
		} else {
			System.out.println("Voto é obrigatório este ano");
		}
		
	}

}
