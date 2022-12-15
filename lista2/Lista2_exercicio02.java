package lista2;

import java.util.Scanner;

public class Lista2_exercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantidades de eleitores em um município");
		int populacao = sc.nextInt();
		System.out.println("Quantidades de votos brancos");
		int brancos = sc.nextInt();
		System.out.println("Quantidades de votos nulos");
		int nulos = sc.nextInt();
		System.out.println("Quantidades de votos validos");
		int validos = sc.nextInt();
		
		int brancosPorCento = (brancos * 100) / populacao;
		int nulosPorCento = (nulos * 100) / populacao;
		int validosPorCento = (validos * 100) / populacao;
		
		System.out.println(brancosPorCento + "% dos votos foram brancos");
		System.out.println(nulosPorCento + "% dos votos foram nulos");
		System.out.println(validosPorCento + "% dos votos foram validos");

	}

}
