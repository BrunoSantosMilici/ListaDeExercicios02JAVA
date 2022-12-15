package lista2;

import java.time.YearMonth;
import java.util.Calendar;
import java.util.Scanner;

public class Lista2_exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dia do seu nascimento");
		int dia = sc.nextInt();
		System.out.println("mês do seu nascimento");
		int mes = sc.nextInt();
		System.out.println("Ano do seu nascimento");
		int ano = sc.nextInt();
		
		int anoAtual = YearMonth.now().getYear();
		int mesAtual = YearMonth.now().getMonthValue();
		Calendar cal = Calendar.getInstance();
		int diaAtual = cal.get(Calendar.DAY_OF_MONTH);
		
		int difAno = anoAtual -  ano;
		int difMes = mes - mesAtual;
		if (difMes<0) {
			difMes = difMes * (-1);
		}
		int difDia = dia - diaAtual;
		if (difDia<0) {
			difDia = difDia * (-1);
		}
		
			int idadedias = (difAno * 365) + (difMes * 30) + difDia;
			System.out.println("A sua idade em dias é de:" + idadedias);
	}

}
