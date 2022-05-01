package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		
		System.out.print("Origem da carga: ");
		int origemCarga = tec.nextInt();
		
		System.out.print("Peso do caminhão em toneladas: ");
		double pesoCaminhaoTon = tec.nextDouble();
		
		System.out.print("Código da carga: ");
		int codCarga = tec.nextInt();
		
		double pesoCaminhaoKG = pesoCaminhaoTon * 1000;
		
		double precoPorKG = 0, impostoPorc = 0;
		double precoCarga;
		double valorImposto;
		double valorTotal;
		
		
		if (codCarga >= 10 && codCarga <= 20) {
			precoPorKG = 100;
		} else if (codCarga >= 21 && codCarga <= 30) {
			precoPorKG = 250;
		} else if (codCarga >= 31 && codCarga <= 40) {
			precoPorKG = 340;
		}
		
		if (origemCarga == 1) {
			impostoPorc = 0.35;
		} else if (origemCarga == 2) {
			impostoPorc = 0.25;
		} else if (origemCarga == 3) {
			impostoPorc = 0.15;
		} else if (origemCarga == 4) {
			impostoPorc = 0.05;
		} else if (origemCarga == 5) {
			impostoPorc = 0;
		}
		
		// contas
		precoCarga = pesoCaminhaoKG * precoPorKG;
		valorImposto = precoCarga * impostoPorc;
		valorTotal = precoCarga + valorImposto;
		
		System.out.println("Peso da carga em kg: " + pesoCaminhaoKG);
		System.out.println("Preço da carga: " + precoCarga);
		System.out.println("Valor do imposto: " + valorImposto);
		System.out.println("Valor total: " + valorTotal);
		
	}

}
