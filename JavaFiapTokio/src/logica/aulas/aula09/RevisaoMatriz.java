package logica.aulas.aula09;

public class RevisaoMatriz {

	public static void main(String[] args) {

		int[][] matriz = new int[2][7];
		
		System.out.println(matriz[0][5]);
		System.out.println(matriz.length);
		System.out.println(matriz[1].length);
		
		matriz[1][4] = 5;
		System.out.println(matriz[1][4]);
		
		matriz[1][2] = 6;
		matriz[0][3] = 13;
		
		System.out.println("");
		
		
		// PERCORRENDO MATRIZES COM VÁRIOS FOR'S -- 1 FOR PARA CADA LINHA
		
		/*
		int linha = 0;
		for (int i = 0; i < matriz[0].length; i++) {
			System.out.printf("Lin: %d -- Col: %d -- Valor: %d \n", linha, i, matriz[linha][i]);
		}		
		System.out.println("");
		linha++;
		for (int i = 0; i < matriz[0].length; i++) {
			System.out.printf("Lin: %d -- Col: %d -- Valor: %d \n", linha, i, matriz[linha][i]);
		}
		*/
		
		// FOR ENCADEADO PARA MATRIZES
		
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int i = 0; i < matriz[0].length; i++) {
				System.out.printf("Lin: %d -- Col: %d -- Valor: %d \n", linha, i, matriz[linha][i]);
			}
			System.out.println("");
		}
		
		
				

	}

}
