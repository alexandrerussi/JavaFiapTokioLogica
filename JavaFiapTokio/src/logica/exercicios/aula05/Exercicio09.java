package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
	
		Scanner tec = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		int num = tec.nextInt();
		
		System.out.println("Valor digitado: " + num);
		
		int centena = (num / 100) * 100;
		System.out.println("Centena = " + centena);
		
		int restoDezena = num - centena;   // 29
		
		int dezena = (restoDezena / 10) * 10;    // 20
		System.out.println("Dezena = " + dezena);
		
		int unidade = restoDezena - dezena;
		System.out.println("Unidade = " + unidade);
		
	}

}
