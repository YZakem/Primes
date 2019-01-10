import java.util.Scanner;

public class PrimeChecker {
	
	long number;
	static int divisibleBy;
	static boolean isPrime = true;
	
	public static long getNumber() {
		Scanner keyboard = new Scanner(System.in);
		keyboard.useDelimiter("\r?\n");
		System.out.println("Please enter an integer:");
		long num = keyboard.nextLong();
		return num;
	}

	public static void testNumber(long num) {
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num%i == 0){
				divisibleBy = i;
				isPrime = false;
				break;
			}
		}	
		
		if (isPrime == true) {
			System.out.println(num + " is prime!");
		}
		else {
			System.out.println(num + " is not prime. It is divisible by " + divisibleBy + ".");
		}
			

		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long number = getNumber();
		testNumber(number);

	}

}
