package eclipsproject;

public class WhileLoopEx2new {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("enter a number:");
		int n= sc.nextInt();
		while(n!=0) {
			int r=n%10;
			System.out.println(r);
			n/=10;
		}

	}

}
