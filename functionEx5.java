package eclipsproject;

public class functionEx5 {
static int add(int x, int y) {
	int r=x+y;
	return r;
}
	public static void main(String[] args) {
		int s=add(10,20);
		System.out.println("sum:"+s);
		System.out.println("sum:"+add(4,8));
		add(8,9);//allowed

	}

}
