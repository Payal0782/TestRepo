package Test;

import java.util.Arrays;

public class ReplaceDigitposition {

	public static void main(String[] args) {
		int[] input = {1, 0, 1, 2, 1, 0, 2, 1, 2, 0};
		//O/P: [2, 2, 2, 0, 0, 0, 1, 1, 1,1]
		int count0=0,count1=0,count2=0;
		for(int i:input)
		{
			if(i==0)
				count0++;
			else if(i==1)
				count1++;
			else if(i==2)
				count2++;
		}
		int index=0;
		for(int m=0;m<count2;m++) { input[index++] =2;}
		for(int l=0;l<count0;l++) { input[index++] =0;}
		for(int k=0;k<count1;k++) { input[index++] =1;}
		
		System.out.println(Arrays.toString(input));
	}
}