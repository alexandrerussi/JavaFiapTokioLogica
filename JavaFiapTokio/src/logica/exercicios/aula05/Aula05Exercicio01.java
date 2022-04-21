package logica.exercicios.aula05;

import java.util.Scanner;

public class Aula05Exercicio01 {

	public static void main(String[] args) {

		String nomeCompleto = "Julio Cesar Lopes Batista";
		String endereco = "Av. Paulista, 1106";
		String cep = "01310-100";
		String cpf = "123.456.789-00";
		String telefone = "11 91234-5678";
		
		System.out.println(nomeCompleto);
		System.out.println(endereco);
		System.out.println(cep);
		System.out.println(cpf);
		System.out.println(telefone);
		
		
		System.out.println("---------------");
		System.out.println("Exerc�cio 3");
		
		
		Scanner entrada = new Scanner(System.in);
		char genero = entrada.nextLine().charAt(0);
		System.out.println(genero);

	}

}
