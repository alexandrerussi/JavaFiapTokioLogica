package fiap.tokio.logica.aulas.aula05;

import java.util.Scanner;

public class Aula05Manipulacao {

	public static void main(String[] args) {
		
		double salario = 1212.50;
		String salarioStr = Double.toString(salario);
		
		System.out.println(salarioStr);
		
		
		String precoTexto = "2.99";
		double preco = Double.parseDouble(precoTexto);
		System.out.println(preco);
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um valor: ");
		String numeroTexto = entrada.nextLine();
		
		float numero = Float.parseFloat(numeroTexto);
		System.out.println(numero);
		
	}

}
