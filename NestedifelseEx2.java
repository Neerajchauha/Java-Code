package eclipsproject;

public class NestedifelseEx2 {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("enter a number");
		int a =sc.nextInt();
		System.out.println("enter a number");
		int b=sc.nextInt();
		if (a==b) {
			System.out.println("both are same number");
		}else {
			if (a>b) {
				System.out.println(a+"is greatest");
			}else {
				System.out.println(b+"is reatest ");
			}
		}
		System.out.println("thanks for using app");
		sc.close();
	}

}
