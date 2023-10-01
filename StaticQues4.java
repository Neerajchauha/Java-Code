package eclipsproject;
class Rs{
	static int x=10;
	String y;
	void show() {
		x++;
		System.out.println(x+y);
	}
}
public class StaticQues4 {
	public static void main(String[] args) {
		Rs a1=new Rs();
		Rs a2=new Rs();
		a1.x=40; a2.y="yoyo";
		a2.x=50; a1.y="abc";
		a1.show();
		a2.show();
		

	}

}
