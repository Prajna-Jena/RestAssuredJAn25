package MyModule;

public class sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,4,5};
		int largest=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>largest) {
				largest=a[i];
			}
			
		}
		System.out.println(largest);
		int sum=0;
		for(int i=0; i<a.length;i++)
		{
			 sum=sum+a[i];
		}
		System.out.println("Actual sum "+sum);
		int sum1=0;
		for(int j=1;j<=5;j++)
		{
			sum1=sum1+j;
		}
		System.out.println("Expected sum "+sum1);
	    int missingNumber=sum1-sum;
	    System.out.println("The missing number is "+missingNumber);

	}

}
