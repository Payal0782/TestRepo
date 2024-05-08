package Test;

public class swapvariablewithoutusingtempvariable {
	public static void main(String[] args) {
		int a=5;
		int b=7;
		a=a+b;//12
		b=a-b;//12-7
		a=a-b;
		System.out.println(a);
		System.out.println(b);
	}
}
