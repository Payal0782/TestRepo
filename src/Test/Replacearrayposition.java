package Test;

import java.util.Arrays;

public class Replacearrayposition {

	public static void main(String[] args) {
		int arr[]= {4,5,7};
		//o/p:{7,4,5}
		  int max=arr[0];
		    for(int i=0;i<arr.length;i++)
		    {
		        if(arr[i]>max)
		        {
		            max=arr[i];
		        }
		    }
		     // Shift elements to the right by one position
		        for (int i = arr.length - 1; i > 0; i--) {
		            arr[i] = arr[i - 1];
		        }
		        arr[0]=max;
		      System.out.print(Arrays.toString(arr)); // returns string representation
	}
}
