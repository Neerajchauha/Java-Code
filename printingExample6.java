package eclipsproject;

public class printingExample6 {

	public static void main(String[] args) {
	int a=10, b=5;
	// value are 10,5
	System.out.println("value are " +a+ "," +b);
	System.out.printf("value are %d,%d\n", a,b);
	
	//value of a=10 and b=5
	System.out.println("value of a=" +a +"and b=" +b);
	System.out.printf("value of a=%d and b=%d\n",a,b);
	
	//sum of 10 and 5 = 15
	
	System.out.println("sum of " + a + " and " + b + "=" +(a+b) + ".");
	System.out.printf("sum of %d and %d = %d\n.",a,b, (a+b));
	}

}
