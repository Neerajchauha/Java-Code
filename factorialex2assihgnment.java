package eclipsproject;

public class factorialex2assihgnment {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("enter anumber:");
		int n=sc.nextInt();
		int  mul = 1;
		for(int a=1;a<=n; a++) {
			mul*=a;
		}
		System.out.println("factorial is: "+mul);
	}

}

