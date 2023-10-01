package eclipsproject;

public class NestedifElseEx {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		 System.out.println("eneter a number");
		 int a = sc.nextInt();
		 System.out.println("eneter a number");
		 int b=sc.nextInt();
		 System.out.println("eneter a number");
		 int c=sc.nextInt();
		 
		 if(a>b) {
			 if(a>c){
				System.out.println(a+"is greatest");
			 }else {
				 System.out.println(c+"is greatest");
			 }
		 }else {
			 if(b>c) {
				 System.out.println(b+"is greatest");
			 }else {
				 System.out.println(c+"is gfreatest");
			 }
		 }
		 System.out.println("thanks for using app");
		 sc.close();
	}
	

}
