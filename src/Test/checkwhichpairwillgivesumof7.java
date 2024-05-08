package Test;

public class checkwhichpairwillgivesumof7 {

	public static void main(String[] args) {
		int ar[]={1,2,3,4,5};
		int countpair=0;
		int sum=0;
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				sum=ar[i]+ar[j];
				if(sum==7)
				{
					countpair++;
				}
			}
		}
		System.out.println(countpair);
	}
}
