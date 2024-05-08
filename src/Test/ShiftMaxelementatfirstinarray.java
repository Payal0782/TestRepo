package Test;

import java.util.Arrays;

public class ShiftMaxelementatfirstinarray {

	public static void main(String[] args) {
		int arr[]={4,5,7};
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		//shift position toward right
		for(int j=arr.length-1;j>0;j--)
		{
			arr[j]=arr[j-1];
		}
		arr[0]=max;
		System.out.println(Arrays.toString(arr));
	}
}