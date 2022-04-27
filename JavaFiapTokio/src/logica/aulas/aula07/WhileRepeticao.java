package logica.aulas.aula07;

public class WhileRepeticao {

	public static void main(String[] args) {
		
		// --------------------------
		// REPETIÇÕES SEM WHILE
		// --------------------------
		
		/*
		System.out.println("Cambalhota");
		System.out.println("Cambalhota");
		System.out.println("Cambalhota");
		*/
		
		
		// --------------------------
		// CAMBALHOTA COM WHILE
		// --------------------------
		
		int cc = 0;
		while (cc < 10) {
			cc++;
			// cc+=2;
			
			if (cc == 3 || cc == 5) {
				continue;
			}
			
			if (cc == 7) {
				break;
			}
			
			System.out.println("Cambalhota " + cc);
		}
		
		
		System.out.println("Fim");
		
		
	}

}












