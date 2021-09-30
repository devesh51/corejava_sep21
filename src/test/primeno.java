package test;

public class primeno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		int flag=0;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				System.out.println("not a prime");
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println("yes it is prime");
		}

	}

}
