package Test;

public class Pallindromestring {
	public static void main(String[] args) {

	    String str = "radar", reverseStr = "";
	 str=str.toLowerCase();
	for(int j=str.length()-1;j>=0;j--)
	{
		reverseStr=reverseStr+str.charAt(j);
	}
	if(reverseStr.equals(str))
		System.out.print(reverseStr+" string is pallindrome "+str);
	else
		System.out.print(reverseStr+" string is not pallindrome "+str);
	}
}
