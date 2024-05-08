package Test;

public class expandstringwithgivennumbercount {

	public static void main(String[] args) {
		String str="2A3B10C";
		for(int i=0;i<str.length();i++)
		{
			if(Character.isDigit(str.charAt(i)))
					{
				int l=Integer.parseInt(String.valueOf(str.charAt(i)));
				for(int k=0;k<l;k++)
				{
					System.out.print((char)str.charAt(i+1));
				}
				i++;
					}
			else
				System.out.print(str.charAt(i));
		}
		

	}

}
