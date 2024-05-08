package Test;

public class Reversewholestringusingstringbuilder {

	public static void main(String[] args) {
		String str1="My name is payal";
		String[] words=str1.split(" ");
		String reversewords="";
		for(int i=0;i<words.length;i++)
		{
			String w=words[i];
			//System.out.println(w);
			StringBuilder sb1=new StringBuilder(w);
			reversewords=sb1.reverse() +" "+reversewords;
			System.out.println(reversewords);
		}
		System.out.println(reversewords);
	}

}
