package eclipsproject;
class PQR{
	int x=10;
	static String y;
	void Show() {
		System.out.println(x+y);
	}
}
public class StaticQues2 {
	public static void main(String[] args) {
		System.out.println(PQR.y);
		PQR a1=new PQR();
		PQR a2 =new PQR();
		a1.x=40; a2.y="yoyo";
		a1.y="abc";
		a1. Show();
		a2.Show();
	}

}
