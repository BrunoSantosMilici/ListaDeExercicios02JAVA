package lista2;

import java.util.Scanner;

public class Lista2_exercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite quantas horas o carro viajou");
		float horas = sc.nextFloat();
		System.out.println("Digite a velocidade média do carro (Km/h)");
		float velocidade = sc.nextFloat();
		
		float distancia = horas * velocidade;
		float litrosUsados = Math.round(distancia / 12);
		
		System.out.println("A quantidade de litros usados é de:" + litrosUsados + "L");
	}

}
