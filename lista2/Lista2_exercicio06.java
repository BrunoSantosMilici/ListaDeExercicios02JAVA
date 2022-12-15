package lista2;

import java.util.Scanner;

public class Lista2_exercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma temperatura em Fahrenheit");
		float fahrenheit = sc.nextFloat();
		
		float celsius = (fahrenheit - 32) * (5 / 9);
		
		System.out.println("A temperatura em celsius é:" + celsius);
	}
}
