package eclipsproject;
class pp{
	String x;
	static int y;
	void show() {
		System.out.println(x+" "+y);
	}
	pp(){
		System.out.println("Hello pp");
		x="Ram";
		y++;
	}
	static {
		System.out.println("Hi pp");
	}
}
public class cunstructorQues2 {

	public static void main(String[] args) {
		System.out.println(pp.y);
		pp a1=new pp();
		pp a2=new pp();
		a1.show();
		a2.show();

	}

}
