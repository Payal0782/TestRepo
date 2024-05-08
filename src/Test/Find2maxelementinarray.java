package Test;

import java.util.Arrays;

public class Find2maxelementinarray {

	public static void main(String[] args) {
		int arr[]= {2,3,4,5,2,4,5};
		Arrays.sort(arr);
		int length=arr.length;
		if(arr[length-2]==arr[length-1])
		{
			System.out.println(arr[length-3]);
		}
		else
		{
			System.out.println(arr[length-2]);
		}
	}

}
