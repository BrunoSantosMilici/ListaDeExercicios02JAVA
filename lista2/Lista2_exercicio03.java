package lista2;

import java.util.Scanner;

public class Lista2_exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Sal�rio atual");
		float salarioAtual = sc.nextFloat();
		System.out.println("valor do reajuste (em porcentegem mas sem o sinal de %)");
		float reajuste = sc.nextFloat();
		
		float novoSalario = salarioAtual + (reajuste / 100 * salarioAtual);
		System.out.println("O novo sal�rio � de " + novoSalario );
	}

}
