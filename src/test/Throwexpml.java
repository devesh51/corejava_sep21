package test;

public class Throwexpml {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age =17;
		
		Throwexpml obj = new Throwexpml();  //Throwexpml is same as the class name
		
		try {
			
		obj.ageCheck(age);
		}
		catch(ArithmeticException e){
			e.printStackTrace();
			System.out.println("exception");
		}
		System.out.println("after the agecheck");
	}
	public void ageCheck(int age) {
		if(age<18) {
			throw new ArithmeticException("not allowed");
		}else {
			System.out.println("eligible");
		}
	}

}
