package eclipsproject;

public class IFstataement {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("enter a number a:");
		int a =sc.nextInt();
		System.out.println("enter a number b:");
		int b =sc.nextInt();
		System.out.println("enter a number c:");
		int c =sc.nextInt();
		System.out.println("enter a number d:");
		int d=sc.nextInt();
		System.out.println("enter a number e:");
		int e =sc.nextInt();
		 if(a>b && a>c && a>d && a>e) {
			 System.out.println(a+"is greatest");
		 }else {
			 if(b>c && b>d && b>e) {
				 System.out.println(b+"is greatest");
			 }else {
				 if(c>d && c>e) {
					 System.out.println(c+"is greatest");
				 }else {
					 if(d>e) {
						 System.out.println(d+"is greatest");
					 }else {
						 System.out.println(e+"is greatest");
					 }
				 }
			 }
		 }
		 System.out.println("thanks for using app");
		 sc.close();
	}  
	
}