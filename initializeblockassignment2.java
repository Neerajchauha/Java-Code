package eclipsproject;
class nee{
	int x=10;
	static int h=10;
	private int g=30;
	void showg() {
		System.out.println(g);
	}
	void m1() {
		System.out.println("hello nee");
	}
}
class b extends nee{
	int y=20;
	void m2() {
		System.out.println("hello b");
		System.out.println(y);
		//system.out.println(g);
		showg();
	}
}
public class initializeblockassignment2 {

	public static void main(String[] args) {
		
                 nee a=new nee();
        a.x=15;
        a.h=15;
        System.out.println(a.x);
        System.out.println(a.h);
        a.m1();
        b b=new b();
        System.out.println(b.x);
        System.out.println(b.h);
        System.out.println(b.y);
        //System.out.println(b.g);//error
        b.showg();
        b.m1();
        b.m2();

	}

}
