package eclipsproject;

public class FunctionEx4 {
static int add() {
	int a=20, b=30;
	int r=a+b;
	return r;
}
	public static void main(String[] args) {
		int s=add();
		System.out.println("sum:"+s);
	   System.out.println("sum: "+add());
        add();//allowed
	}

}
