package MyModule;

public class SpaceCountString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="I am an Automation Engineer";
		int l=s.length();
		int count=0;
		for(int i=0;i<l;i++) {
			char c=s.charAt(i);
			if(c==' ') {
				count++;
			}
		}
		System.out.println("Total no of spaces "+count);

	}

}
