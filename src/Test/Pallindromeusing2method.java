package Test;

public class Pallindromeusing2method {

	public static void main(String[] args) {
		String str ="Payap";
		if(pallindrome(str))
		{
			System.out.println("The string is a palindrome.");
		} else {
			System.out.println("The string is not a palindrome");
		}
	}
	public static boolean pallindrome(String str)
	{
		String reverse="";
		str=str.toLowerCase();
		for(int j=str.length()-1;j>=0;j--)
		{
			reverse=reverse+str.charAt(j);
		}
		System.out.println(reverse);
		if(reverse.equals(str))
		{
			return true;
		}
		return false;
	}

}

