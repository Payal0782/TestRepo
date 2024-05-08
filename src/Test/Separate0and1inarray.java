package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Separate0and1inarray {

	public static void main(String[] args) {
		int[] numbers = {0, 0, 1, 0, 1, 1, 0, 1}; 
		List<Integer> ar1=new ArrayList<Integer>();
		List<Integer> ar2=new ArrayList<Integer>();
		for(int i=0;i<numbers.length;i++)
		{
			if(numbers[i]==1)
			{
				ar1.add(numbers[i]);
			}
			else
			{
				ar2.add(numbers[i]);
			}
		}

	System.out.println(ar1);
	System.out.println(ar2);
	}
}
