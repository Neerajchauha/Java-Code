package eclipsproject;
class x{
	static int a=10;
	String  b;
	void show() {
		a++;
		System.out.println(a+b);
	}
	static void display() {
		System.out.println("hello x");
	}
}
public class StaticQues3 {

	public static void main(String[] args) {
		System.out.println(x.a);
		x x1=new x();
		x1.show();
		x.display();
		System.out.println(x.a);
	}

}
