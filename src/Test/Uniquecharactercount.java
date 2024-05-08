package Test;

import java.util.HashMap;
import java.util.Map;

public class Uniquecharactercount {

	public static void main(String[] args) {
		 String str= "GeeksforGeeks";
		 HashMap<Character,Integer> hmap=new HashMap<Character,Integer>();
		 
		 for(int i=0;i<str.length();i++) {
			 if(hmap.containsKey(str.charAt(i)))
			 {
				 hmap.put(str.charAt(i),hmap.get(str.charAt(i))+1);
			 }
			 else
			 {
				 hmap.put(str.charAt(i), 1);
			 }
		 }
		 for(Map.Entry<Character, Integer> mp:hmap.entrySet())
		 {
			 if(mp.getValue()==1)
				 System.out.println(mp.getKey()+" unique character"+mp.getValue());
		 }
		 

	}

}
