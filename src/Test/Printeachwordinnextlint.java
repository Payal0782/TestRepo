package Test;

public class Printeachwordinnextlint {
	public static void main(String[] args) {
		String str="payal agarwal senior test engineer";
		String words[]=str.split(" ");
		for(String w:words)
		{
			System.out.println(w);
		}
	}
}
