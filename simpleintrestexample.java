package eclipsproject;

public class simpleintrestexample {

	public static void main(String[] args) {
	java.util.Scanner sc=new java.util.Scanner(System.in);
	 System.out.println("Enter a Number");
	 System.out.println("enter a principal");
	  int p=sc.nextInt();
	  System.out.println("enter a interest ");
	  int i=sc.nextInt();
	  System.out.println("enter a time span");
	  int T=sc.nextInt();
	  
	  int si= p*i*T/100;
	  System.out.println("the simple interest is :" +si);
	  sc.close();
	}

}
