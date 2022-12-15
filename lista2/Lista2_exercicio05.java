package lista2;

import java.util.Scanner;

public class Lista2_exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma temperatura em Celsius");
		float celsius = sc.nextFloat();
		
		float fahrenheit = (9 * celsius + 160) / 5;
		
		System.out.println("A temperatura em Fahrenheit é:" + fahrenheit);
	}

}
