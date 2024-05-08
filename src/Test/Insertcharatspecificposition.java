package Test;

public class Insertcharatspecificposition {

	public static void main(String[] args) {
		String str="geeks for geeks";
		StringBuilder sb=new StringBuilder(str);
		sb.setCharAt(5,'s');
		System.out.println(sb);
        //Insert specific word
		sb.insert(4,"payal");
		System.out.println(sb);
	}

}
