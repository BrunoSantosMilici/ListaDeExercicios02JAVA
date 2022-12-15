package lista2;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Lista2_exercicio01_alternativo {
	   public static void main(String[] args) {
	        // Create a Scanner object for reading input from the terminal
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter the year, month, and day of their birth
	        System.out.print("Enter the year of your birth: ");
	        int year = scanner.nextInt();

	        System.out.print("Enter the month of your birth (1-12): ");
	        int month = scanner.nextInt();

	        System.out.print("Enter the day of your birth: ");
	        int day = scanner.nextInt();

	        // Create LocalDate objects for the current date and the user's birth date
	        LocalDate today = LocalDate.now();
	        LocalDate birthDate = LocalDate.of(year, month, day);

	        // Calculate the difference between the two dates in terms of years, months, and days
	        Period ageInDays = Period.between(birthDate, today);

	        // Print the age in days
	        System.out.println("Age in days: " + ageInDays.getDays());
	    }
	   		}

// essa é uma versão do algoritmo que fiz com ajuda da inteligencia artificial ChatGPT
// é possível perceber que a IA criou esse algoritmo de maneira errada 
// deixei essa versão aqui mais como uma observação interessante

