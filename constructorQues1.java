package eclipsproject;
class Pl{
	String x;
	static int y;
	void show() {
		System.out.println(x+" "+y);
	}
	Pl(){
		System.out.println("Hello P "+x+y);
		x="Ram";
		y++;
	}
}
public class constructorQues1 {

	public static void main(String[] args) {
		Pl p1=new Pl();
		Pl p2=new Pl();
		Pl p3=new Pl();
		p1.show();
		p2.show();
		p3.show();

	}

}
