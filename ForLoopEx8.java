package eclipsproject;

public class ForLoopEx8 {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter a number");
		int mul =1;
		int n=sc.nextInt();
		for( int a=1; a<=n; a++) {
			mul*=a;
		}
System.out.println("product is :" +mul);
	}

}
