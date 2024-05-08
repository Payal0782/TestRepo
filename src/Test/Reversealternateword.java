package Test;

public class Reversealternateword {

	public static void main(String[] args) {
		String str1="My name is payal";
		String[] words=str1.split(" ");
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<words.length;i++)
		{
			if(i%2==0)
			{
				String w=words[i];
				StringBuilder sb1=new StringBuilder(w);
				sb.append(sb1.reverse());
			}
			else
			{
				sb.append(words[i]);
			}
			sb.append(" ");
		}
		System.out.print(sb);
	}
}
