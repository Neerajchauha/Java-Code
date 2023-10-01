package eclipsproject;
class M{
	int x;
	void m() {
		System.out.println("hi A");
	}
}
public class ClassObjectQues1 {

	public static void main(String[] args) {
		M a=new M();
		a.x=10;
		a.m();
		M b=new M();
		b.x=40;
		System.out.println(a.x);
		System.out.println(b.x);

	}

}
