package Test;

public class Countduplicatewordinstring {

	public static void main(String[] args) {
		String str="Big black bug bit a big black dog on his big black nose";  
		String w[]=str.split(" ");
		int count=0;
		for(int i=0;i<w.length;i++){
			{ count=1;
				for(int j=i+1;j<w.length;j++)
				{
					if(w[i].equals(w[j]))
					{
						count++;
						//w[j] = " ";    
					}
				}
				if(count>1 && w[i] != "")
					System.out.println(w[i]+" count is"+count);
			}
		}

	}

}
