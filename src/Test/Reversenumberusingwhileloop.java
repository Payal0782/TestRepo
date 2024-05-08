package Test;

public class Reversenumberusingwhileloop {

	public static void main(String[] args) {
		int num=43235;
		int reverse=0;
		int sum=0;
		while(num>0)
		{
			sum=num%10;
			reverse=reverse*10+sum;
			num=num/10;
		}
System.out.println(reverse);
	}

}
