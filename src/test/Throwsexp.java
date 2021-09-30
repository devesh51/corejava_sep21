package test;

public class Throwsexp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Throwsexp obj = new Throwsexp();
		try {
			obj.calculator();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void calculator() throws InterruptedException {
		member1();
	}
	public void member1() throws InterruptedException {
		System.out.println("inside member1");
		Thread.sleep(3000);
	}

}
