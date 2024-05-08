package Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Check2arrayissame {

	public static void main(String[] args) {
		int arr[]= {2,3,4,5,1};
		int arr1[]= {1,2,3,4,5,2,4,2,1,3,5};
		
		Set<Integer> li1=new HashSet<Integer>();
		Set<Integer> li2=new HashSet<Integer>();
		for(int a:arr)
		{
			li1.add(a);
		}
		for(int a1:arr1)
		{
			li2.add(a1);
		}
		boolean b=li1.equals(li2);
		if(b)
			System.out.println("Arrays is same");
		else
			System.out.println("Arrays is not same");
	}

}
