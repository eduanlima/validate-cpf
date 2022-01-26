package main;

import java.util.Scanner;

public class ValidateCPF {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Long cpf;
		
		System.out.println("Insert your CPF: ");
		cpf = Long.parseLong(scanner.next());
		
		scanner.close();
		
		String[] cpfAsArray = cpf.toString().split("");
		int sum = 0;
		
		for (int i = 0; i < 9; i++) {
			sum = sum + (Integer.parseInt(cpfAsArray[i]) * (10 - i)); 
		}
		
		Integer firstChecker = 11 - (sum % 11);
		firstChecker = firstChecker == 11 || firstChecker == 10 ? 0 : firstChecker;
		
		if (firstChecker.toString().equals(cpfAsArray[9])) {
			
			sum = 0;
			
			for (int i = 0; i < 10; i++) {
				sum = sum + (Integer.parseInt(cpfAsArray[i]) * (11 - i)); 
			}
			
			Integer secondChecker = 11 - (sum % 11);
			secondChecker = secondChecker == 11 || secondChecker == 10 ? 0 : secondChecker;
			
			if (secondChecker.toString().equals(cpfAsArray[10])) {
				System.out.println("CPF is valid.");
			}
			else {
				System.out.println("CPF is not valid.");
			}
		}
		else {
			System.out.println("CPF is not valid.");
		}
	}
}

//cpf test 53421773750 81763554880 23813481077 91983221503 48010394483 18342178730
