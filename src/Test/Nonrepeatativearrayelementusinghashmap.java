package Test;

import java.util.HashMap;
import java.util.Map;

public class Nonrepeatativearrayelementusinghashmap {
public static void main(String args[]) {
	int[] arr= {1,3,2,5,1};
	HashMap<Integer,Integer> hmap=new HashMap<Integer,Integer>();
	for(int num:arr) {
		hmap.put(num, hmap.getOrDefault(num,0)+1);
		System.out.println(hmap);
	}
	for(Map.Entry<Integer, Integer> mp: hmap.entrySet())
{
	if(mp.getValue()==1)
		System.out.println(mp.getKey()+" value is "+mp.getValue());
}
}
}
