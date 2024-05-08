package Test;

import java.util.HashSet;
import java.util.Set;

public class Removeduplicatewordsfromstring {

	public static void main(String[] args) {
		String str="Geeks for Geeks";
		String words[]=str.split(" ");
		Set<String> s=new HashSet<>();
		for(String w:words)
		{
		s.add(w);
		}
		System.out.println(s);
	}

}
