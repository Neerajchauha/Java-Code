package eclipsproject;

public class FunctionEx6 {
static void add(int x, int y) {
	int r=x+y;
	if(r>100) {
		return;
	}
	System.out.println("sum:"+r);
}
	public static void main(String[] args) {
		add(50,80);
		add(5,8);

	}

}
