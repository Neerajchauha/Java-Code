package eclipsproject;

public class switchEx3 {

	public static void main(String[] args) {
		switch(1) {
		case 1:
			System.out.println("hello");
			break;
		case 2:
			//case "2"://error
			System.out.println("hi");
			break;
		case 3:
			System.out.println("Bye");
			break;
			default :
				System.out.println("invalid number");
 	}

  }
}