package logica.aulas.aula06;

public class Condicionais {

	public static void main(String[] args) {

		// -------------------------------
		// ESTRUTURA CONDICIONAL SIMPLES
		// -------------------------------
		
		/*
		float nota = 10;
		
		if (nota >= 6) {
			System.out.println("Nota: " + nota);
		}
		
		System.out.println("Fim");
		System.out.println("");
		
		
		int idade = 45;
		
		if (idade < 18) {
			System.out.println("Menor de idade");
		}
		*/
		
		
		// -------------------------------
		// ESTRUTURA CONDICIONAL COMPOSTA
		// -------------------------------
		
		/*
		double nota = 10;
		
		if (nota < 6) {
			System.out.println("Reprovou, vacilão");
		} else {
			System.out.println("Aprovado");
		}
		
		System.out.println("");
		
		int idade = 15;
		
		if (idade < 18) {
			System.out.println("Menor de idade");
		} 
		else {
			System.out.println("Maior de idade");
		}
		*/
		
		// -------------------------------
		// ESTRUTURA CONDICIONAL ENCADEADA
		// -------------------------------
		
		/*
		double nota = 6;
		
		if (nota < 4) {
			System.out.println("Reprovado");
		} else {
			if (nota < 6) {
				System.out.println("Recuperação");
			} else {
				System.out.println("Aprovado");
			}
		}
		*/
		
		// -------------------------------
		// ESTRUTURA CONDICIONAL ELSE IF
		// -------------------------------
		
		double nota = 9.45;
		
		if (nota < 4) {
			System.out.println("Reprovado");
		} else if (nota < 6) {
			System.out.println("Recuperação");
		}
		else {
			System.out.println("Aprovado");
		}
		
	}

}













