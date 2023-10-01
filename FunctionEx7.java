package eclipsproject;

public class FunctionEx7 {
static int findMax(int a, int b) {
	if(a>b) {
		return a;
	}else {
		return b;
	}
}
	public static void main(String[] args) {
		
System.out.println("Max:"+ findMax(45,78));
System.out.println("Max:"+ findMax(96,96));
System.out.println("Max:"+ findMax(125,78));
System.out.println("Max:"+ findMax(7895,78));
	}

}
