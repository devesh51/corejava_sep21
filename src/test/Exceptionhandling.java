package test;

public class Exceptionhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b[] = {1,2,3};
		try {
			//System.out.println(a/0);
			System.out.println(b[5]);
		}
		/*try {
			System.out.println(b[5]);
		}
		*/
		
		catch(ArithmeticException e){
			e.printStackTrace();
			System.out.println("inside arithmetic");
		}
		catch(NullPointerException e) {
			e.printStackTrace();
			System.out.println("inside nullpointer");
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("indside generic ecception");
		}//always in the end exception e
		finally {
			System.out.println("always executed");
		}
		System.out.println("after the exception");
	}

}
