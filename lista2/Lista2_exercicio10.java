package lista2;

import java.util.Scanner;

public class Lista2_exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor de A");
		float a = sc.nextFloat();
		System.out.println("Digite o valor de B");
		float b = sc.nextFloat();
		float c = a;
		
		 a = b;
		 b = c;
		System.out.println("O valor de A é de " + a);
		System.out.println("O valor de B é de " + b);
	}

}
// algoritmo que inverte valores