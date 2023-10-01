package eclipsproject;
class AB{
	int x=10;
	static String y="neeraj";
	void show() {
		System.out.println(x+y);
	}
}
public class StaticQues1 {
	public static void main(String[] args) {
		AB a1=new AB();
		a1.x=20; a1.y="xyz";
		AB a2 =new AB();
		a2.x=40; a2.y="yoyo";
		a1 .show();
		a2. show();
	}

}
