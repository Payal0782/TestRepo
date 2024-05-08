package Test;

import java.util.HashMap;
import java.util.Map;

public class Eliminateduplicatecharacterfromstring {

	public static void main(String[] args) {
		String str="GeeksforGeeks";
		HashMap<Character,Integer> hmap=new HashMap<Character,Integer>();
		for(int i=0;i<str.length();i++)
		{
			hmap.put(str.charAt(i),1);
		}

		for(Map.Entry m : hmap.entrySet()){    
			System.out.println(m.getKey());  //hashmap elimates duplicate values
		}  
	}

}
