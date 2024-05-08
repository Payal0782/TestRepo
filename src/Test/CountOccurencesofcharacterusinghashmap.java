package Test;
import java.util.*;
import java.util.Map.Entry;
public class CountOccurencesofcharacterusinghashmap {

	public static void main(String[] args) {
		String str ="aaabbbccddaakar";

		LinkedHashMap<Character,Integer> hmap=new LinkedHashMap<>();
		for(int i=0;i<str.length();i++)
		{
			hmap.put(str.charAt(i),hmap.getOrDefault(str.charAt(i),0)+1);
		}
		for(Entry<Character, Integer> mp:hmap.entrySet())
		{
			System.out.println(mp.getKey()+"value is "+mp.getValue());
		}
	}
}

