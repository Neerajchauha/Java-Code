package eclipsproject;

public class fuctionexfactorial {
static int findfactorial(int n) {
	int fact=1;
	for(int x=1; x<=n; x++) {
		fact*=x;
	}
	return fact;
}
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int result =findfactorial(n);
		System.out.println("factorial of "+n+"is"+result);
	}

}
