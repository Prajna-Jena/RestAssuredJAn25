package MyModule;

public class Simplejava1 {

	public static void main(String[] args) {
	String s1="lipi";
	String s3="Soumya";
	String rev="";
	int l=s3.length();
	for(int k=l-1;k>=0;k--) {
		rev=rev+s3.charAt(k);
	}
	System.out.println(rev);
	String s2="duggu";
	s1=s1+s2;//lipiduggu
	s2=s1.substring(0,s1.length()-s2.length());//lipi
	System.out.print(s1);
	s1=s1.substring(s2.length());
	System.out.print("the value of "+s1+" The value of s2 "+ s2);
	int i=10;
	int j=12;
	i=i+j;
	j=i-j;
	i=i-j;
			
	System.out.println(i+""+j);
	
	try {
	System.out.print(i/0);
	}
	catch(ArithmeticException ie)
	{
		System.out.print("inside Exception Block");
	}
			
			
			

	}

}
