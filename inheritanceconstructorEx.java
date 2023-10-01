package eclipsproject;
class RR{ // class RR extends object 
	int x=10;
	RR(){super();
		System.out.println("Hi A");
	}
	void m1() {
		System.out.println("Hello A");
	}
}
class CC extends RR{
	int y=20;
	CC(){super();
		System.out.println("Hi B");
	}
	void m2() {
		System.out.println("Hello B");
	}
}
public class inheritanceconstructorEx {
	public static void main(String[] args) {
     RR r=new RR();
     CC B=new CC();
	}

}
