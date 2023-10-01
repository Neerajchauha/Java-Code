package eclipsproject;

public class DOWhileLOOPEX2 {

	public static void main(String[] args) {
	java.util.Scanner sc=new java.util.Scanner(System.in);
	String choice;
	do {
		System.out.println("enter a number:");
		int n =sc.nextInt();
		System.out.println("square of "+n+" is ="     +  n*n);
		System.out.println("do you wanna continue ? [yes/no]");
		choice = sc.next();
	}
	while(choice.equalsIgnoreCase("yes"));
	
	System.out.println("thanks for using app");
	}

}
