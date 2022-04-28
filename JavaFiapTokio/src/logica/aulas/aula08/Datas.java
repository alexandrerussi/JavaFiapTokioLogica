package logica.aulas.aula08;

import java.util.Calendar;
import java.util.Date;

public class Datas {

	public static void main(String[] args) {

		Date data = new Date();
		System.out.println("Data agora: " + data);
		
		Calendar c = Calendar.getInstance();
		
		System.out.println("Data e hora atual: " + c.getTime());
		
		System.out.println("Ano: " + c.get(Calendar.YEAR));
		System.out.println("Mês: " + (c.get(Calendar.MONTH) + 1));
		System.out.println("Dia do mês: " + c.get(Calendar.DAY_OF_MONTH));
		System.out.println("Dia da semana: " + c.get(Calendar.DAY_OF_WEEK));
		
		int hora = c.get(Calendar.HOUR_OF_DAY);
		int minuto = c.get(Calendar.MINUTE);
		
		System.out.println("Hora: " + hora);
		System.out.println("Minutos: " + minuto);
		
	}

}
