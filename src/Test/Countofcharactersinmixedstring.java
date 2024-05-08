package Test;

public class Countofcharactersinmixedstring {

	public static void main(String[] args) {
		  String str="GeeksforGeeks1234$%#@";
		  int count=0;
		  for(int i=0;i<str.length();i++)
		  {
		  if(Character.isAlphabetic(str.charAt(i)))
			  count++;
		  }
		  if(count>1)
		  System.out.println("count of character is "+count);
	}
}
