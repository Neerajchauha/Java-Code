package eclipsproject;
class I{
	int a=10;
	void print() {
		System.out.println("Hello X");
	}
}
class F extends I {
	int b=20;
	int a=10;
	void m() {
		int c=30;
		int a=80;
		System.out.println(a);//80
		System.out.println(this.a);//10
		System.out.println(super.a);//10
		System.out.println(b);//20
		System.out.println(c);//30
		print();//Hello y
		this.print();//Hello y
		super.print();//Hello x
	}
		void print() {
			System.out.println("Hello y");
		}
}
public class ThisSuperAsMeberEx1 {

	public static void main(String[] args) {
		F f=new F();
		System.out.print(f.a);//50
		//System.out.println(f.super.a);//error
		f.print();//Hello y
		f.m();
		I i=new I();
		System.out.println(i.a);//10
		i.print();//Hello X

	}

}
