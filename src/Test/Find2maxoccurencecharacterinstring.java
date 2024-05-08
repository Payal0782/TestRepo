package Test;
import java.util.HashMap;
import java.util.Map;
public class Find2maxoccurencecharacterinstring {

	public static void main(String[] args) {
		String str = "hello world";
		int maxocc=0;
		int secondmax=0;
		Map<Character, Integer> frequencyMap = new HashMap<>();
		for(char ch:str.toCharArray())
		{
			frequencyMap.put(ch,frequencyMap.getOrDefault(ch, 0)+1);
		}
		System.out.print(frequencyMap);	
		for(int freq:frequencyMap.values())
		{
			if(freq>maxocc)
			{
				secondmax=maxocc;
				maxocc=freq;
			}
			else if(freq>secondmax&&maxocc!=0)
			{
				secondmax=freq;
			}
		}
		System.out.println(secondmax);	
		StringBuilder sb=new StringBuilder();
		for(Map.Entry<Character, Integer> mp:frequencyMap.entrySet())
		{
			if(mp.getValue()==secondmax)
			{
				sb.append(mp.getKey());
			}
		}
		if(sb.length()>0)
		{
			System.out.println("Second maximum occurrence character(s): " + sb.toString());
		} else {
			System.out.println("No character found with second maximum occurrence.");
		} 
	}
}



