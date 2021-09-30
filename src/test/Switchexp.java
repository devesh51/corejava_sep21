package test;

public class Switchexp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=19;
		switch(age) {
		case 18:
		case 19:	
			System.out.println("eligible for votting");
			break;
		case 17:
			System.out.println("next year");
			break;
		case 15:
			System.out.println("not eligible for votting");
			break;
		default:
			System.out.println("default statement print ");
		}
	}

}
