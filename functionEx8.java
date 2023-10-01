package eclipsproject;

public class functionEx8 {
static boolean findEvenOdd(int a) {
	if (a%2==0) {
		return true;
	}
	else {
		return false;
	}
}
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		int n=sc.nextInt();
		if(findEvenOdd(n)) {
			System.out.println(n+"is Even");
		}
		else {
			System.out.println(n+"is odd");
		}
	}

}
