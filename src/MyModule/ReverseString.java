package MyModule;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S="Poorvans";
		int l=S.length();
		String s1="";
		System.out.println(l);
		for(int i=l-1;i>=0;i--) {
			System.out.println(S.charAt(i));
			s1=s1+S.charAt(i);
		}
		System.out.println("The Reverse String is "+s1);

	}

}
