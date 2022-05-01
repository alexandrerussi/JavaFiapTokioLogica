package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio12Desafio {

	public static void main(String[] args) {

		// Faça um programa que leia 3 valores que representam os lados de um triângulo A, B e C e ordene-os em ordem decrescente, de modo que o lado A representa o maior dos 3 lados. A seguir, determine o tipo de triângulo que estes três lados formam, com base nos seguintes casos:
		// Se A ≥ B+C, apresente a mensagem: NAO FORMA TRIANGULO;
		// Se A² = B² + C² , apresente a mensagem: TRIANGULO RETANGULO;
		// Se A² > B² + C² , apresente a mensagem: TRIANGULO OBTUSANGULO;
		// Se A² < B² + C² , apresente a mensagem: TRIANGULO ACUTANGULO;
		// Se os três lados forem iguais, apresente a mensagem: TRIANGULO EQUILATERO;
		// Se apenas dois dos lados forem iguais, apresente a mensagem: TRIANGULO ISOSCELES;

		
		Scanner tec = new Scanner(System.in);
		
		System.out.print("Digite o valor para o lado 1: ");
		int A = tec.nextInt();

		System.out.print("Digite o valor para o lado 2: ");
		int B = tec.nextInt();
		
		System.out.print("Digite o valor para o lado : ");
		int C = tec.nextInt();
		
		int X = 0; // variavel auxiliar para ordenar
		
		System.out.println();
		System.out.println("----- ORDEM -----");
		System.out.printf("A: %d | B: %d | C: %d \n", A, B, C);
		System.out.println("-----------------");
		System.out.println();
		
		if (A < B)
		{
			System.out.println("A < B");
		    System.out.printf("X: %d | A: %d | B: %d \n", X, A, B);
		    X = A;
		    System.out.printf("X: %d | A: %d | B: %d \n", X, A, B);
		    A = B;
		    System.out.printf("X: %d | A: %d | B: %d \n", X, A, B);
		    B = X;
		    System.out.printf("X: %d | A: %d | B: %d \n", X, A, B);

		    System.out.println();
			System.out.println("----- ORDEM -----");
			System.out.printf("A: %d | B: %d | C: %d \n", A, B, C);
			System.out.println("-----------------");
			System.out.println();
		}
		
		if (B < C) {
			System.out.println("B < C");
			System.out.printf("X: %d | B: %d | C: %d \n", X, B, C);
		    X = B;
		    System.out.printf("X: %d | B: %d | C: %d \n", X, B, C);
		    B = C;
		    System.out.printf("X: %d | B: %d | C: %d \n", X, B, C);
		    C = X;
		    System.out.printf("X: %d | B: %d | C: %d \n", X, B, C);

		    System.out.println();
			System.out.println("----- ORDEM -----");
			System.out.printf("A: %d | B: %d | C: %d \n", A, B, C);
			System.out.println("-----------------");
			System.out.println();
		}
		
		if (A < B)
		{
			System.out.println("A < B");
		    System.out.printf("X: %d | A: %d | B: %d \n", X, A, B);
		    X = A;
		    System.out.printf("X: %d | A: %d | B: %d \n", X, A, B);
		    A = B;
		    System.out.printf("X: %d | A: %d | B: %d \n", X, A, B);
		    B = X;
		    System.out.printf("X: %d | A: %d | B: %d \n", X, A, B);

		    System.out.println();
			System.out.println("----- ORDEM -----");
			System.out.printf("A: %d | B: %d | C: %d \n", A, B, C);
			System.out.println("-----------------");
			System.out.println();
		}
		
		System.out.println();
		System.out.println("----- TIPO DE TRIÂNGULO -----");
		System.out.println();

		if (A >= (B + C))
		{
		    System.out.println("NÃO FORMA TRIÂNGULO");
		}
		else
		{
		    if ( (A*A) == ( (B*B) + (C*C) ) )
		    {
		        System.out.println("TRIANGULO RETÂNGULO");
		    }
		    if ( (A*A) > ( (B*B) + (C*C) ) )
		    {
		        System.out.println("TRIANGULO OBTUSÂNGULO");
		    }
		    if ( (A*A) < ( (B*B) + (C*C) ) )
		    {
		        System.out.println("TRIANGULO ACUTÂNGULO");
		    }
		    if ( A == B && B == C )
		    {
		        System.out.println("TRIANGULO EQUILATERO");
		    }
		    if ( (A == B && A != C) || (B == C && B != A) )
		    {
		        System.out.println("TRIANGULO ISOSCELES");
		    }
		}

		System.out.println();
		System.out.println();
		System.out.println("----- FIM -----");
		System.out.println();
		System.out.println();
		
	}

}
