package lista2;

import java.util.Scanner;

public class Lista2_exercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a altura da lata");
		float altura = sc.nextFloat();
		System.out.println("Digite o raio da lata");
		float raio = sc.nextFloat();
		
		float volume = (float) ((Math.PI) * (Math.pow(raio, 2) * altura));
		
		System.out.println("O volume da lata de óleo é igual a: " + volume);
	}

}
