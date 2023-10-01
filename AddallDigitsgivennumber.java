package eclipsproject;

public class AddallDigitsgivennumber {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("enter a number:");
		int n=sc.nextInt();
		int sum=0;
		while(n!=0) {
			int r= n%10;
			sum+=r;
			n/=10;
			System.out.print(r+"+");
		}
		System.out.print(" " );
		System.out.println("="+sum);
		
		}
	}
	
	


