package main;

import java.util.Scanner;

public class ValidateCPF {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Long cpf;
		
		System.out.println("Insert your CPF: ");
		cpf = Long.parseLong(scanner.next());
		
		String[] cpfAsArray = cpf.toString().split("");
		int sum = 0;
		
		for (int i = 0; i < 9; i++) {
			sum = sum + (Integer.parseInt(cpfAsArray[i]) * (10 - i)); 
		}
		
		int firstChecker = 11 - (sum % 11);
		System.out.println(" First checker: " + firstChecker);
		firstChecker = firstChecker == 11 || firstChecker == 10 ? 0 : firstChecker;
		System.out.println("Sum first: "+ sum + "| First checker: " + firstChecker);
		
		sum = 0;
		
		for (int i = 0; i < 10; i++) {
			sum = sum + (Integer.parseInt(cpfAsArray[i]) * (11 - i)); 
		}
		
		System.out.println();
		
		int secondChecker = 11 - (sum % 11);
		System.out.println("Second: " + secondChecker);
		secondChecker = secondChecker == 11 || secondChecker == 10 ? 0 : secondChecker;
		System.out.println("Sum: "+ sum + "| Second checker: " + secondChecker);
		
		//cpf test 53421773750 81763554880 23813481077 91983221503 48010394483 18342178730
	}

}
