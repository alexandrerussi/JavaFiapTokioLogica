package logica.aulas.aula06;

public class SwitchCase {

	public static void main(String[] args) {

		int escolhaUsuario = 1;
		
		switch (escolhaUsuario) {
			case 0:
				System.out.println("Sair do programa");
				break;
			case 1:
				System.out.println("Entrou no programa");
				break;
			case 2:
				System.out.println("Case 2");
				break;
			default:
				System.out.println("Erro");
		}

	}

}
