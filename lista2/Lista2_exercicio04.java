package lista2;

import java.util.Scanner;

public class Lista2_exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual é o custo de fabrica de um carro?");
		float custoFabrica = sc.nextFloat();
		
		float custoDistribuidor = (custoFabrica * 28) / 100;
		float custoImposto = (custoFabrica * 45) / 100;
		
		float custoFinal = custoFabrica + custoDistribuidor + custoImposto;
		
		System.out.println("O custo final do carro é de: " + custoFinal + "R$");
	
	}

}
