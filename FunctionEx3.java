package eclipsproject;

public class FunctionEx3 {
	static void add(int a , int b) {
		int r=a+b;
		System.out.println("sum: "+r);
	}

	public static void main(String[] args) {
		add(10,20);
		add(20,30);
		add(30,40);
		add(40,50);
		add(60,30);
		add(89,79);
		add(98,79);
		add(89,85);
		//add(); error show karega kyoki hamane variable ko inialization kiya hai
		//add(7); error show karega kyoki hamane do variable inialization kiya hai
		int a=15;
		add(a,5);
		
	}

}
