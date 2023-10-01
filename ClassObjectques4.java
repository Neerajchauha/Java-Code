package eclipsproject;

public class ClassObjectques4 {
	int x;
	String y;
	void show() {
		System.out.println(x+y);
	}
	public static void main(String[] args) {
		ClassObjectques4 a=new ClassObjectques4();
		a.x=10;
		a.y="KK";
		ClassObjectques4 b=new ClassObjectques4();
		b.y="Ram";
		b.x=90;
		a.show();
		b.show();
	

	}

}
