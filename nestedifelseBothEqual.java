package eclipsproject;

public class nestedifelseBothEqual {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("eenter a number");
		int a=sc.nextInt();
		System.out.println("enter a number");
		int b=sc.nextInt();
		if(a==b) {
			System.out.println("both are equal or smae number");
		}else {
			if(a>b) {
				System.out.println(a+"is greatest");
			}else {
				System.out.println(b+"is greatest");
			}
			
		}
      System.out.println("thans for using app");
      sc.close();
      
	}

}
