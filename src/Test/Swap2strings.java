package Test;

public class Swap2strings {

	public static void main(String[] args) {
		String str1="payal";
		String str2="kalpesh";	
		str1=str1+str2;
		System.out.println(str1);
		str2=str1.substring(0,str1.length()-str2.length());
		System.out.println("value of str2"+str2);
		str1=str1.substring(str2.length());
		System.out.println("value of str1"+str1);
	}
}
