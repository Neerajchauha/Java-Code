package eclipsproject;

public class TocheckPrimeNumberYesAndNO {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		String choice;
		do {
			System.out.println("Enter a number");
			int n=sc.nextInt();
			if(n>1) {
				boolean flag = true;
				for(int a=2; a<=n; a++) {
					if(n%2==0) {
						flag =false;
						break;
					}
				}
				if(flag) {
					System.out.println(n+ "is a prime number");
				}else {
					System.out.println(n+ "is a not prime number");
				}
				
			}else {
				System.out.println("this is a invalid number");
			}
			
			System.out.println("Do you Wanna To continue ? [yes/No]");
			choice=sc.next();
		}
		while(choice.equalsIgnoreCase("yes"));
		System.out.println("thanks for using app");
		sc.close();
	}

}
