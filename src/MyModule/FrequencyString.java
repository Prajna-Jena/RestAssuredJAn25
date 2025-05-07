package MyModule;

import java.util.ArrayList;

public class FrequencyString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aaaabbbddcc";
				int n=s.length();//a4b3d2c2
		int count=1;
		int counting=1;
		boolean traverse[]=new boolean[n];
		int k=0;
		String frequencyString="";
		for(int i=0;i<n;i++)
			
		{
			count=counting;
			if(traverse[i]==true)
				continue;
			for(int j=i+1;j<n;j++) {
			if(s.charAt(i)==s.charAt(j)) {
				traverse[j]=true;
				count++;
			}
			
			}
			System.out.print(frequencyString+s.charAt(i)+count);
	         
		}

	}
	
}
