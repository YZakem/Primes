import java.util.ArrayList;
import java.util.Scanner;

public class PrimeFinder {
	
	static ArrayList<Integer> primeArray = new ArrayList<Integer>();
	
	
	public static void initializeArray() {
		primeArray.add(2);
	}
	
	public static void findPrimes() {
		System.out.println("Up to how high would you like to check?");
		Scanner keyboard = new Scanner(System.in);
		keyboard.useDelimiter("\r?\n");
		int upTo = keyboard.nextInt();	
		
		for (int i = 3; i <= upTo; i++) {
			boolean isPrime = true;

			// Cycle through existing primes to check for new prime
			for (int j = 0; j < primeArray.size(); j++) {

				if (i%primeArray.get(j) == 0) {
					isPrime = false;
					break;
				}								
			}
			if (isPrime == true) {
					primeArray.add(i);
				}
		}
	}
	
	public static void printPrimes() {
		for (int prime : primeArray) {
			System.out.println(prime);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		initializeArray();
		findPrimes();
		printPrimes();

	}

}
