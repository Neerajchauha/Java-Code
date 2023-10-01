package eclipsproject;

public class nestedifelseex1 {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		System.out.println("enter a number a:");
		int a =sc.nextInt();
		System.out.println("enter anumber b:");
		int b =sc.nextInt();
		System.out.println("enter a number c:");
		int c= sc.nextInt();
		if(a>b) {
			if(a>c) {
				System.out.println(a+"is greatest");
			}
			else {
				System.out.println(c+"is a greatest");
			}
		} else {
			if(b>c) {
				System.out.println(b+ "is greatest");
			}else {
				System.out.println(c+"is greatest");
			}
		}
         System.out.println("thanks for using app");
         sc.close();
	}

}
