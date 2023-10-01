package eclipsproject;

public class userSayTocountinueoddeven {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		String choice;
		do {
			System.out.println("Enter a number:");
			int n=sc.nextInt();
			if(n%2==0) {
				System.out.println(n+"is a even number");
			}else {
				System.out.println(n+"is a odd number");
			}
			System.out.println("do you wanna continue ?[yes/no]");
			choice=sc.next();
		}
         while(choice.equalsIgnoreCase("yes"));
		System.out.println("thanks for using App");
	}

}
