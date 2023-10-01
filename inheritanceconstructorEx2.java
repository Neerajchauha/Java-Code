package eclipsproject;
class MN{
	int x=10;
	MN(int a){
		System.out.println("Hi M");
		x=a;
	}
	MN(){
		System.out.println("Hello M");
	}
}
class NM extends MN{
	int y=20;
	NM (){
		super (5);
		System.out.println("Hello N");
	}
}
public class inheritanceconstructorEx2 {
	public static void main(String[] args) {
            NM  n=new NM();
            System.out.println(n.x+" "+n.y);

	}

}
