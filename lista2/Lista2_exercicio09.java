package lista2;

import java.util.Scanner;

public class Lista2_exercicio09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor da prestação inicial");
		float valorInicial = sc.nextFloat();
		System.out.println("Digite o tempo de atraso em meses");
		float tempo = sc.nextFloat();
		System.out.println("Digite o valor da taxa");
		float taxa = sc.nextFloat();
		
		float valorFinal = valorInicial + (valorInicial * taxa/100) * tempo;
		
		System.out.println("O valor final, após as taxas de atrasos, é de:" + valorFinal);
	}

}
// algoritmo que calcula o valor de uma prestação atrasada