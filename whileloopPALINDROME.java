package eclipsproject;

public class whileloopPALINDROME {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("enter a number:");
		int r,sum=0,temp;
		int n=sc.nextInt();
		temp=n;
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum)
		System.out.println("palindrome number");
		else
			System.out.println("not palindrome");
		

	}

}
