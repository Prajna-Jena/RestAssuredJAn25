package MyModule;

import java.util.ArrayList;

public class FrequecyNumberArray {

	public static void main(String[] args) {
		int a[]= {2,3,2,4,3,4,2,5,4};
		int n=a.length;
	//System.out.println("The Arary is "+a );
	boolean traverse[]=new boolean[n];
	ArrayList<Integer> list=new ArrayList<Integer>();
	int count=1;
	int counting=1;
	for(int i=0;i<a.length;i++)
	{
		count=counting;
		if(traverse[i]==true)
			continue;
	for(int j=i+1;j<a.length;j++)
	{
		
		 if(a[i]==a[j])
		 {
			 traverse[j]=true;
			 count++; 
			 //list.add(count);
		 }
	}
	System.out.println("the Frequecy of "+a[i]+ "is"+count);
	
   }
	}
	
}	
