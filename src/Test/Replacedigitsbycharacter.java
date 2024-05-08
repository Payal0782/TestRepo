package Test;

public class Replacedigitsbycharacter {

	public static void main(String[] args) {
		int[] numbers = {0, 0, 1, 0, 1, 1, 0, 1}; 
		//replace 1 by 'A' for odd index and by 'a' for even index and 0 by 'Z' for odd index and by 'z' for even index.
		for(int i=0;i<numbers.length;i++)
		{
			if(numbers[i]==0) {
				if(i%2==0)
					numbers[i]='z';
				else
					numbers[i]='Z';
			}
			else
			{
				if(i%2==0)
					numbers[i]='a';
				else
					numbers[i]='A';
			}
		}
		for(int num:numbers)
		{
			System.out.print((char)num);
				
			}
		}
	}
