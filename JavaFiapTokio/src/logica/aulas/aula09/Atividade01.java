package logica.aulas.aula09;

public class Atividade01 {

	public static void main(String[] args) {

		String[] nomes = {"Alexandre", "Arthur", "Samuel", "Lucas"};
		
		String nome = nomes[0];
		System.out.println(nome);
		System.out.println("");
		
		for (int j = 0; j < nomes.length - 1; j++) {
			nome = nomes[j];
			
			for (int i = j + 1; i < nomes.length; i++) {
				System.out.println(nome + "/" + nomes[i]);
			}
		}
		
		/*
		for (int i = 1; i < nomes.length; i++) {
			System.out.println(nome + "/" + nomes[i]);
		}
		*/
		
		/*
		nome = nomes[1];
		for (int i = 2; i < nomes.length; i++) {
			System.out.println(nome + "/" + nomes[i]);
		}
		
		nome = nomes[2];
		for (int i = 3; i < nomes.length; i++) {
			System.out.println(nome + "/" + nomes[i]);
		}
		*/
		
		

	}

}
