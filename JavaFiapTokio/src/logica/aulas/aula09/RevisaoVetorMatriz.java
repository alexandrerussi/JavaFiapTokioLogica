package logica.aulas.aula09;

import java.util.Scanner;

public class RevisaoVetorMatriz {

	public static void main(String[] args) {

		double[] notas = new double[5];
		
		System.out.println(notas[1]);
		
		notas[3] = 9.5;
		
		System.out.println(notas[3]);
		
		Scanner tec = new Scanner(System.in);
		
		System.out.print("Digita uma nota: ");
		notas[0] = tec.nextDouble();
		
		System.out.println(notas[0]);
		
		int qtdNotas = notas.length;
		System.out.println(qtdNotas);
		
		System.out.println("");
		System.out.println("-------");
		System.out.println("");
		
		for (int i = 0; i < qtdNotas; i++) {
			System.out.print("Digita a nota " + i +": ");
			notas[i] = tec.nextDouble();
		}
		
		System.out.println("");
		System.out.println("-------");
		System.out.println("");
		
		for (int i = 0; i < qtdNotas; i++) {
			System.out.println("Nota " + i + " é igual a: " + notas[i]);
		}
		
		double somaNotas = notas[0] + notas[1] + notas[2] + notas[3] + notas[4];
		System.out.println("Soma de notas: " + somaNotas);
		
		double media = somaNotas / qtdNotas;
		System.out.println("Média total: " + media);
		

	}

}











