package Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Currentdatandtime {

	public static void main(String[] args) {
		// Get the current date and time
		LocalDateTime currentDateTime = LocalDateTime.now();

		System.out.println(currentDateTime);
		// Define a format for date and time
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		
		// Format the current date and time using the defined format
		String formattedDateTime = currentDateTime.format(formatter);

		// Print the formatted current date and time
		System.out.println("Current Date and Time: " + formattedDateTime);
	}
}
