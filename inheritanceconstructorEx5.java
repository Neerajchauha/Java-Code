package eclipsproject;
class AAAAA{
	int x=10;
	AAAAA(){
		System.out.println("Hi A");
	}
	{
		System.out.println("Hello A"); // initialize block
	}
	
}
class BBBBB extends AAAAA{
	int y=20;
	BBBBB(){
		System.out.println("Hi B");
	}
	{
		System.out.println("Hello B");
	}
}
public class inheritanceconstructorEx5 {
	public static void main(String[] args) {
      AAAAA a=new AAAAA();
      BBBBB b=new BBBBB();
	}

}
