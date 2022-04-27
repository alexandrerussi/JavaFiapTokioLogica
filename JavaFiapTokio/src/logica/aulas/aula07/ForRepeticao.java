package logica.aulas.aula07;

import java.util.Scanner;

public class ForRepeticao {

	public static void main(String[] args) {
		
		// FOR DE SER HUMANO
		
		/*
		Scanner tec = new Scanner(System.in);
		
		System.out.print("Digite a qtd de camb: ");
		int qtdCamb = tec.nextInt();
		
		for (int cc = 0; cc < qtdCamb; cc++) {
			System.out.println("Cambalhota " + cc);
		}
		
		System.out.println("Fim");
		*/
		
		
		// FOR DE ALIEN - ENCADEADO
		
		for (int i = 0; i <= 3; i++) {
			
			for (int j = 0; j <= 2; j+=2) {
				
				System.out.printf("%d, %d \n", i, j);
				
			}
			
			System.out.println("teste");
			
		}

	}

}









