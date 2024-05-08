package Test;

import java.util.HashSet;
import java.util.Set;

public class Find2maxelementinintarraywithoutusingarrayssortmethod {
	 public static void main(String[] args) {
	      int arr[]={7,7,4,5,3,2};
	 Set<Integer> s= new HashSet<>();
	 for(int n:arr)
	 {
	     s.add(n);
	 }
	 System.out.println(s);
	 int index=0;
	 int max=0;
	 int[] a=new int[s.size()];
	 for(int newnum:s)
	 {
	     a[index++]=newnum;
	 }
	 int l=a.length;
	 max=a[l-2];
	     System.out.println(max);
	    }
}
