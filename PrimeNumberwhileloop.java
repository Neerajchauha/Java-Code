package eclipsproject;

public class PrimeNumberwhileloop {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println( "enter a number");
		 int n=sc.nextInt();
		if(n>1) {
			boolean flag=true;
			for(int x=2; x<=n-1; x++) {
				if(n%x==0) {
					flag = false;
					break;
				}
			}
			if(flag) {
				System.out.println(n+"is prime");
			}else {
				System.out.println(n+ "is not prime");
			}
			
		}else {
			System.out.println("invalid number");
		}
	}

}
