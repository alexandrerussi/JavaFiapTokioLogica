package logica.aulas.aula07;

import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		
		int num, soma = 0;
		
		System.out.print("Digite um num: ");
		num = tec.nextInt();
		soma = soma + num;
		System.out.println(soma);
		
		System.out.print("Digite um num: ");
		num = tec.nextInt();
		soma = soma + num;
		System.out.println(soma);
		
		System.out.print("Digite um num: ");
		num = tec.nextInt();
		soma = soma + num;
		System.out.println(soma);
		
		tec.close();
		
		
	}

}
