package Test;

import java.util.HashMap;
import java.util.Map;

public class Eliminateduplicatecharandprintonlynonrepetativeusinghashmap {
	public static void main(String[] args) {
	String str = "Geeks for Geeks";
    Map<Character,Integer> mp=new HashMap<>();
      char[] ch=str.toCharArray();
  
   for(char c:ch)
    {
        mp.put(c,mp.getOrDefault(c,0)+1);  //getOrDefault(ch,0) will return 0 by default if character does not exist and put g,0+1 i.e. g=1
    }
    for(Map.Entry<Character,Integer> hmap:mp.entrySet())
    {
        if(hmap.getValue()==1)
        System.out.println(hmap.getKey()+" "+hmap.getValue());
    }
}
}
