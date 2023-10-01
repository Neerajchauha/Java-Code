package eclipsproject;
class U {
	int x=10;
	U(int a){
		System.out.println("Hi M");
		x=a;
	}
}
class H extends U{
	int y=20;
	H(){ super (5);
		System.out.println("Hi N");
	}
}
public class inheritanceconstructorEx1 {
	public static void main(String[] args) {
H h=new H();
System.out.println(h.x+" "+h.y);
	}

}
