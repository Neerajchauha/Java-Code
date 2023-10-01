package eclipsproject;
class HS{
	int x=10;
	HS(int a){
		System.out.println("Hi H");
		x=a;
	}
	HS(){
		System.out.println("Hello H");
	}
}
class G extends HS{
	int y=20;
	G(int b){this ();
		System.out.println("Hi G");
		y=b;
	}
	G(){
		super (5);
		System.err.println("Hello G");
	}
}
public class inheritanceconstructorex4 {

	public static void main(String[] args) {
        G g=new G(4);
       // G g1=new G();
         System.out.println(g.x+" "+g.y);
	}

}
