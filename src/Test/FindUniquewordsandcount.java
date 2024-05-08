package Test;

import java.util.HashMap;
import java.util.Map;
public class FindUniquewordsandcount {
	public static void main(String[] args) {
		
		      String str = "Guitar is instrument and Piano is instrument";
		      String[] strArray = str.split("\\s+");
		      Map<String, String> hMap = new HashMap<String, String>();
		      for(int i = 0; i < strArray.length ; i++ ) {
		         if(!hMap.containsKey(strArray[i])) {
		            hMap.put(strArray[i],"Unique");
		         }
		      }
		      System.out.println(hMap);   
	}
}
