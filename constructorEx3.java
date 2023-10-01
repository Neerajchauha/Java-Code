package eclipsproject;
class Ap{
	String x;
	int y;
	void show() {
		System.out.println(x+" "+y);
	}
	Ap(String a,int b){
		System.out.println("Hello A");
		x=a;
		y=b;
	}
	Ap(String a){
		this("KK",80);
		System.out.println("Ok A");
		x=a;
	}
}
public class constructorEx3 {

	public static void main(String[] args) {
		Ap  a=new Ap ("GG");
		a.show();
	}

}
