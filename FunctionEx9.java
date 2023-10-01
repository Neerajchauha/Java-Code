package eclipsproject;

public class FunctionEx9 {
static int findmax (int x, int y) {
	if(x>y) {
		return x;
	}
	else {
		return y;
	}
}
	public static void main(String[] args) {
		System.out.println("max:"+findmax(45,78));
		System.out.println("max:"+findmax(889,698));
		System.out.println("max:"+findmax(789,787));

	}

}
