package logica.aulas.aula09;

public class Vetores {

	public static void main(String[] args) {
		
		/*
		//String[] listaFrutas = new String[5];
		
		String[] listaFrutas = {"Kiwi", "Jambo", "Jabuticaba", "Pitanga", "Imbu"};
		
		int posicao = 2;
		System.out.println(listaFrutas[posicao]);
		
		/*
		listaFrutas[0] = "Kiwi";
		listaFrutas[1] = "Jambo";
		listaFrutas[2] = "Jabuticaba";
		listaFrutas[3] = "Pitanga";
		listaFrutas[4] = "Imbu";
		
		
		
		
		System.out.println("Primeiro print: " + listaFrutas[4]);
		
		System.out.println("");
		
		int qtdFrutas = listaFrutas.length;
		System.out.println("Qtd frutas: " + qtdFrutas);
		
		System.out.println("");
		
		for (int i = 0; i < qtdFrutas; i++) {
			System.out.println(listaFrutas[i]);
		}
		*/
		
		int[] numeros = {0, 5, 11, 4};
		
		// FOR INDEXADO
		for (int i = 0; i < numeros.length; i++) {
			// System.out.println("Pos: " + i  + " -- Valor: " + numeros[i]);
			System.out.printf("Pos: %d -- Valor: %d \n", i, numeros[i]);
		}
		
		System.out.println("");
		
		// FOR EACH
		// percorre a lista e acessa os valores das posições
		
		for (int numero: numeros) {
			System.out.println("Valor: " + numero);
		}
		

	}

}












