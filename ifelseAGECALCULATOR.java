package eclipsproject;

public class ifelseAGECALCULATOR {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("enter a number");
		int a=sc.nextInt();
		if(a>=13 && a<=19) {
			System.out.println(a+"you are teenager");
		}else {
			System.out.println(a+"you are not teenager");
			
		//	if(a>13 && a<=19) System.out.println("you are teenager"); (is form me bhi hum likh sakate hai)
		//	else System.out.println("you are not teenager");		(uper ke program ko)
		}
          System.out.println("thanks for using app");
          sc.close();
	}

}
