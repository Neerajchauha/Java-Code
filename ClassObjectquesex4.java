package eclipsproject;

public class ClassObjectquesex4 {
int x;
String y;
void show() {
	System.out.println(x+y);
}
	public static void main(String[] args) {
		ClassObjectquesex4 a=new ClassObjectquesex4();
		a.x=10;
		a.y ="kk";
		ClassObjectquesex4 b=new ClassObjectquesex4();
		b.y="Ram";
		b.x=90;
		a.show();
		b.show();

	}

}
