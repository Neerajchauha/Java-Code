package eclipsproject;
class MMM {
	int x=10;
	MMM(int a){
		System.out.println("hi m");
		x=a;
	}
	MMM(){
		System.out.println("Hello M");
	}
	
}
class NNN extends MMM{
	int y=20;
	NNN(int b){
		super(8);
		System.out.println("HI N");
		y=b;
	}
	NNN(){
		System.out.println("Hello N");
	}
}
public class inheritanceconstructorex3 {

	public static void main(String[] args) {
	NNN n=new NNN();
	System.out.println(n.x+" "+n.y);
	}

}
