package Test;

import java.util.Arrays;

public class Check2Stringsareanagram {
	 public static void main(String[] args) {
		    String str1 = "Race";
		    String str2 = "Care";
		    str1 =str1.toLowerCase();
		    str2= str2.toLowerCase();
		    char[] arr1=str1.toCharArray();
		    char[] arr2=str2.toCharArray();
		    if(arr1.length==arr2.length)
		    {
		    	Arrays.sort(arr1);
		    	Arrays.sort(arr2);
		    	
		    	boolean match= Arrays.equals(arr1, arr2);
		    	if(match)
		    		System.out.println("strings are anagram");
		    	else
		    		System.out.println("strings are not anagram");
		    }
		    else
		    {
		    	System.out.println("not anagram");
		    }
	 }
}
