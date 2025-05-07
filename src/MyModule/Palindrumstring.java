package MyModule;

import java.util.Scanner;

public class Palindrumstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String");
		Scanner sc=new Scanner(System.in);
		String S=sc.next();
		int l=S.length();
		String s1="";
		System.out.println(l);
		for(int i=l-1;i>=0;i--) {
			s1=s1+S.charAt(i);
		}
		if(S.equalsIgnoreCase(s1)) {
			System.out.println("the input string is Palindrum");
		}
		else
			System.out.println(" String is not palindrum");

	}

}
