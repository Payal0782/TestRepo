package Test;

public class Findmissingintfromarray {

	public static void main(String[] args) {

		int arr[]= {1,2,4,7,10};
		int n=arr.length;
		int lastnum=arr[n-1];
		int index=0;
		for(int i=1;i<lastnum;i++)
		{
			if(arr[index]==i)
				index++;
			else
				System.out.print(i+" ");
		}
	}
}
