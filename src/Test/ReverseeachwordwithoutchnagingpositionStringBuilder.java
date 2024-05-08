package Test;

public class ReverseeachwordwithoutchnagingpositionStringBuilder {

	public static void main(String[] args) {
		String str="payal agarwal senior test engineer";
		String words[]=str.split(" ");
		String reverse="";
		for(String w:words)
		{
		StringBuilder sb=new StringBuilder(w);
		reverse=reverse+sb.reverse()+" ";
		System.out.println(reverse);
	}
System.out.println(reverse);
}
}