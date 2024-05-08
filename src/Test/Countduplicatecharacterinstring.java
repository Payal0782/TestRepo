package Test;

public class Countduplicatecharacterinstring {

	public static void main(String[] args) {
		String str="aaabbbccddaa";
		char[] arr=str.toCharArray();
		int count;
		for(int i=0;i<arr.length;i++)
		{ count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j]&&arr[i]!=' ')
				{
					count++;
					arr[j]=' ';
				}
			}
			if(count>1&&arr[i]!=' ')
				System.out.println(arr[i]+" count is "+count);
		}

	}

}
