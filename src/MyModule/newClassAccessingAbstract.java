package MyModule;

public class newClassAccessingAbstract extends NewAbstract{
	
		public  void methodB() {
			System.out.println("Inside MethodB");
		}
		public static void main(String args[]) {
			newClassAccessingAbstract ne=new newClassAccessingAbstract();
			ne.methodA();
			ne.methodB();
		}
	}


