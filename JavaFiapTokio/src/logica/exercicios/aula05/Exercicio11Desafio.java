package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio11Desafio {

	public static void main(String[] args) {
		
		// lembre que:
		float _float = 9.6f;
		int _int = (int) _float;  // _int = 9
		
		// Agora vamos come�ar o desafio:
		Scanner tec = new Scanner(System.in);
		System.out.print("Digite sua idade em dias: ");
		int idadeDias = Integer.parseInt(tec.nextLine()); // recebo um valor em texto do usuario e converto para inteiro 
		
		System.out.println("");
		
		int anos = (int) idadeDias / 365;
		System.out.println("Idade em anos: " + anos);
		
		int restoDias = idadeDias % 365;
		System.out.printf("Resto 1: %d dias \n", restoDias); // para exibir valor inteiro utilizamos %d
		
		System.out.println("");
		
		int meses = (int) restoDias / 30;
		System.out.println("Idade em meses: " + meses);
		
		int dias = restoDias % 30;
		System.out.println("Idade em dias: " + dias);
		
		tec.close();
		
	}

}
