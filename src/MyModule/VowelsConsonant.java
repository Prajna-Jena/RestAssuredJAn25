package MyModule;

public class VowelsConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Poorvans";
		int vcount=0;
		int ccount=0;
		int length=s.length();
		for(int i=0;i<length;i++) {
			char c=s.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				vcount++;
			}
			else {
				ccount++;
			}
		}
		System.out.println("the vowel number is "+vcount+"The consonant count is "+ccount);

	}

}
