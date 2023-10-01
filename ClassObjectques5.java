package eclipsproject;
class W{
	int x=90;
	String y="Ram";
	void show() {
		x++;
		System.out.println(x+y);
	}
}
public class ClassObjectques5 {

	public static void main(String[] args) {
				W m1=new W();
				W m2=new W();
				m1.show();
				m1.show();
				m2.show();
			}
	}


