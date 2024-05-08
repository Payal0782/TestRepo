package Test;

public class Fingmissingcharacters {

	public static void main(String[] args) {
		String str="a,b,c,d,z";
		for(char ch='a';ch<='z';ch++)
		{
			if(str.indexOf(ch)==-1)
				System.out.println("missing character is "+ch);
		}
	}
}
