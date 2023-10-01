package eclipsproject;

public class ifElseEx5onevariable {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("enter a age");
		int a=sc.nextInt();
		if(a>=13 && a<=19) {
			System.out.println("you are teenager");
		}else {
			System.out.println("you are not teenager");
		}
 System.out.println("thanks for using app");
 sc.close();
	}

}
