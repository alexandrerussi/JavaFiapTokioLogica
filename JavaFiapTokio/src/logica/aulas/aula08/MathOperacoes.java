package logica.aulas.aula08;

public class MathOperacoes {

	public static void main(String[] args) {

		double PI = Math.PI;
		System.out.println(PI);
		
		System.out.println(Math.pow(4, 2));
		
		System.out.println(Math.sqrt(225));
		
		System.out.println(Math.cbrt(8));
		
		
		System.out.println(Math.abs(-20));
		
		System.out.println(Math.floor(2.48));
		
		double num = 3.01;
		
		System.out.println(Math.ceil(num));
		
		double num2 = 2.49;
		
		double arredonda = Math.round(num2);
		
		System.out.println(arredonda);
		
		System.out.println("--------");
		System.out.println("");
		System.out.println("--------");
		System.out.println("");
		
		double random = Math.random();
		System.out.println(random);
		
		double multiplica = random * 5;
		System.out.println(multiplica);
		
		int numInt = (int) multiplica;
		System.out.println(numInt);

	}

}







