package Test;

public class Wrapperclass {

	public static void main(String[] args) {
		int a=5;
		Integer num1 = Integer.valueOf(a); 
		System.out.println(num1);
		String value1String = "12";
        String value2String ="34";

        // Convert strings to Integer objects
        int value1 = Integer.parseInt(value1String);
        int value2 = Integer.parseInt(value2String);
       
         System.out.println(value1);
         System.out.println(value2);
	}
}
