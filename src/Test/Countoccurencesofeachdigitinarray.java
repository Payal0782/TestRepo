package Test;

public class Countoccurencesofeachdigitinarray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,1,2,5,6};

		int count;
		for(int i=0;i<arr.length;i++)
		{ count=1;
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]==arr[j]&&arr[i]!=' ')
			{
				count++;
			}
		}
		System.out.println(arr[i]+" count is "+count);
		}
	}
}
