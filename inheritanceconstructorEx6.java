package eclipsproject;
class RCB{
	int x=10;
	RCB(){
		System.out.println("Hi A");
	}
	{
		System.out.println("Hello A");
	}
	static {
		System.out.println("Ok A");
	}
}
class MI extends RCB{
	int y=20;
	MI (){
		System.out.println("Hi B");
	}
	{
		System.out.println("Hello B");
	}
	static {
		System.out.println("Ok B");
	}
}
public class inheritanceconstructorEx6 {

	public static void main(String[] args) {
		MI mi=new MI ();
		System.out.println(mi.x+"\t"+mi.y);

	}

}
