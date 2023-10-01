package eclipsproject;
class OCP{
	int x=90;
	String y="Ram";
	void m(int a) {
		x=a;
		y=y+x;
	}
	void show() {
		System.out.println(x+y);
	}
}
public class ClassObjectques7 {

	public static void main(String[] args) {
		
		
				OCP m1=new OCP();
				OCP m2=new OCP();
				m1.m(15);
				m2.m(10);
				m1.show();
				m2.show();
			}
	}


