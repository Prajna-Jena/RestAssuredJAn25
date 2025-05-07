package MyModule;

public class IndividualwordsinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="This is the java selenium tricky programme";
		String s1=null;
		int count=1;
		int words=0;
		for(int i=0;i<s.length();i++)
		{
			
			if(s.charAt(i)==' ')
			{
				count++;
			System.out.println(s.substring(words, i));
			words=i+1;
			}
		
		}
		System.out.println("No of words in a string "+count);

	}

}
