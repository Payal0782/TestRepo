package Test;

import java.util.HashMap;
import java.util.Map;

public class Hashmapsample {

	public static void main(String[] args) {
	HashMap<String, Integer> hmap=new HashMap<String, Integer>();
	hmap.put("Payal", 1);
	hmap.put("Kalpesh", 2);
	hmap.put("Kavya", 3);
	hmap.put("Payal", 4);
	System.out.println(hmap.size());
	for(Map.Entry<String,Integer> mp: hmap.entrySet() )
	{
		
		System.out.println(+mp.getValue());
	}

	}

}
