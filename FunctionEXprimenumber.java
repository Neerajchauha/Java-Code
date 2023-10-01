package eclipsproject;

public class FunctionEXprimenumber {
static boolean findprime(int n) {
	boolean flag =true;
	for (int a=2; a<=n/2; a++) {
		if(n%a==0){
			flag=false;
			break;
			}
		}
	return flag;
	}

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.println("enter a no: ");
int n=sc.nextInt();
if(n<2) {
	System.out.println("invalid number");
}
else {
	boolean result =findprime(n);
	if(result) {
	System.out.println(n+ "is prime no:");
	}
	else {
		System.out.println(n+"is not prime no");
		}
}   
 
	}

}
