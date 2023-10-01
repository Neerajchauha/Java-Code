package eclipsproject;

public class switchEX2 {

	public static void main(String[] args) {
		switch ("Ram") {
		case " Rohan" :
			System.out.println("hello");
			break;
		case "Ram" : 
			//case 2://error
			System.out.println("hi");
			break;
		case "mohan" :
			System.out.println("Bye");
			break;
			default :
				System.out.println("invalid");
		}
	}

}
