package Test;

public class Amstrongnumbers {

	public static void main(String[] args) {
		 for (int number = 1; number <= 500; number++) {
	            int originalNumber, remainder, result = 0;
	            originalNumber = number;
	            while (originalNumber != 0) {
	                remainder = originalNumber % 10;
	                result =result+remainder*remainder*remainder; 
	                originalNumber = originalNumber/10;
	            }
	            if (result == number)
	                System.out.println(number + " is an Armstrong number.");
	        }
	}
}
