package Test;

public class ReplaceStringabcdwithefghandxyzwithabc {

	public static void main(String[] args) {
		String str="abcd xyz";
		String words[]=str.split(" ");
		for(String w:words)
		{
			if(w.equals("abcd"))
			{
				String replace=w.replaceAll("abcd","efgh");
				System.out.println(replace);
			}
			else
			{
				String replace1 = w.replaceAll("xyz","abc");
				System.out.println(replace1);
			}
		}
	}
}
