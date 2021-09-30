package test;

public class conditionalexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=50;i++) {
			if(i%2==0) {
				System.out.println("even"+i);
			}
			else {
				System.out.println("odd"+i);
			}
		}
		
		
		
		
		int age=15;//eligible for votting
		
		if(age>=18) {
			System.out.println("eligible for votting");
		}
		else if(age==17){
			System.out.println("eligible for next yaer");
		}
		else {
			System.out.println("not eligible");
		}
				
	}

}
