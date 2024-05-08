package Test;

public class ReverseeachwordusingStringBuilder {

	public static void main(String[] args) {
		
		String str="payal agarwal senior test engineer";
		String words[]=str.split(" ");
		String reverse="";
		for(String w:words)
		{
		StringBuilder sb=new StringBuilder(w);
		 reverse=sb.reverse()+" " + reverse;
		 System.out.println(reverse);

	}
System.out.println(reverse);
}
}