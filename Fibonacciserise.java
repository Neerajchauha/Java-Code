package eclipsproject;

public class Fibonacciserise {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		 int n1=0;
		 int n2 =1;
		 int n3;
		 System.out.print(n1+" "+n2);
		 for( int a=0;a<=n;a++) {
			 n3=n1+n2;
			 n1=n2;
			 n2=n3;
			 System.out.print(n3);
			 
			 
		 }
		 }

}