package eclipsproject;

public class switchex3monthfinding {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter a number");
		int a=sc.nextInt();
		switch(a) {
		case 1:
			System.out.println("jan");
			break;
		case 2:
			System.out.println("feb");
			break;
		case 3:
			System.out.println("march");
			break;
		case 4:
			System.out.println("april");
			break;
		case 5:
			System.out.println("may");
			break;
		case 6:
			System.out.println("jun");
			break;
		case 7:
			System.out.println("july");
			break;
		case 8:
			System.out.println("aug");
			break;
		case 9:
			System.out.println("sep");
			break;
		case 10:
			System.out.println("oct");
			break;
		case 11:
			System.out.println("nov");
			break;
		case 12:
			System.out.println("dec");
			break;
			
			default :
				System.out.println("invalid number");
			
				
		}
 System.out.println("thans for using app");
  sc.close();
	}

}
