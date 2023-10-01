package eclipsproject;

public class ifelsedivisibleby5and3both {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("enter anumber");
		int num=sc.nextInt();
		if(num%3==0 && num%5==0) {
			System.out.println(num+"number is divisible by 3 and 5 " );
			
		}else {
		    {
			   System.out.println("this is a invalid number" );
			   sc.close();
		   }
		}
	}
}
			 
		


