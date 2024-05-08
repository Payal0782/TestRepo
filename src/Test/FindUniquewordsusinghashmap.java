package Test;

import java.util.HashMap;
import java.util.Map.Entry;

public class FindUniquewordsusinghashmap {

	public static void main(String[] args) {
		String str = "Guitar is instrument and Piano is instrument";
		String words[]=str.split(" ");
		HashMap<String,Integer> hmap=new HashMap<String,Integer>();
		for(String w:words)
		{
			hmap.put(w,hmap.getOrDefault(w,0)+1);
		}
		for(Entry<String, Integer> mp: hmap.entrySet())
		{
			if(mp.getValue()==1)
			{
				System.out.println(mp.getKey()+" value is "+mp.getValue());
			}
		}

	}
}
