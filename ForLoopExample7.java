package eclipsproject;

public class ForLoopExample7 {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("enter a  number:");
		int n=sc.nextInt();
		int sum=0;
		for (int a=1; a<=n; a++) {
			sum=+a;//sum =sum+a;
		}
		System.out.println("Addituion is:" +sum);

	}

}
